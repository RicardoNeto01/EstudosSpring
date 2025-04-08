package com.RicardoNeto01.first_spring_app.controller;

import com.RicardoNeto01.first_spring_app.service.HelloWorldService;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Podemos ter API STATEFULL: estado de cada cliente (autenticação, token, etc), é salvo no servidor.
// E também API STATELESS: a cada requisição, é necessário receber todas as informações para executar a funcionalidade que o cliente quer.

//Anotação para o Spring entender que essa classe é um controller.
@RestController
//Anotação para mapear os endpoints e qual requisição essa classe ira responder
@RequestMapping("/hello-world")
public class HelloWorldController {

    //Fiz isso para a classe controller conseguir acessar a classe service

    //Usando autoWired, a dependencia é injetada pelo Spring
    @Autowired
    private HelloWorldService helloWorldService;

    //Anotação para especificar qual requisição http esse método responde
    // post, get, put, delete, patch, etc...

    //GET /hello-world
    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Ricardo");
    }

    //QUando alguém enviar uma requisição do tipo post, esse método responde
    //Recebendo requisições pela url, usa-se chaves e nome da variável
    @PostMapping("/{id}")
    //Request body porque o método precisa receber um json com valores
    //@PathVariable recebe pela url, e injeta no parametro do método
    public String helloWorldPost(@PathVariable String id, @RequestBody User body){
        return "Hello World " + body.getName() + id;
    }
}
