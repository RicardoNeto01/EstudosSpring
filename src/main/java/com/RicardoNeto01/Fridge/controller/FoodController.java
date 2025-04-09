package com.RicardoNeto01.Fridge.controller;

import com.RicardoNeto01.Fridge.model.Food;
import com.RicardoNeto01.Fridge.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

//essa classe é de controller
@RestController
//essa classe precisa ser mapeada na url
@RequestMapping("/food")
public class FoodController {

    //Injeção de dependencia
    @Autowired
    private FoodService service;

    //Nessa classe que são feitas as requisições.
    @GetMapping
    public List<Food> getAll(){
        return service.getAll();
    }

    @PostMapping("")
    //RequestBody pede pra mandar no corpo da requisição as informações
    public Food create(@RequestBody Food food){

        return service.save(food);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
