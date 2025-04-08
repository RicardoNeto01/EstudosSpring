package com.RicardoNeto01.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Podemos ter API STATEFULL: estado de cada cliente (autenticação, token, etc), é salvo no servidor.
// E também API STATELESS: a cada requisição, é necessário receber todas as informações para executar a funcionalidade que o cliente quer.

//Anotação para o Spring entender que essa classe é um controller.
@RestController
//Anotação para mapear os endpoints e qual requisição essa classe ira responder
@RequestMapping("/hello-world")
public class HelloWorldController {

    //Anotação para especificar qual requisição http esse método responde
    // post, get, put, delete, patch, etc...

    //GET /hello-world
    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }

}
