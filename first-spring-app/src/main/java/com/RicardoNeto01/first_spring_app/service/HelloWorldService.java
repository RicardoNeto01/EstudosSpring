package com.RicardoNeto01.first_spring_app.service;

import org.springframework.stereotype.Service;

//Indica pro spring que isso é uma classe service(trata toda a lógica de negócio)
@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello World " + name;
    }

}
