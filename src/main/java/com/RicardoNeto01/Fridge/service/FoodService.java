package com.RicardoNeto01.Fridge.service;

import com.RicardoNeto01.Fridge.model.Food;
import com.RicardoNeto01.Fridge.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repository;

    //Listar
    public List<Food> getAll(){
        //Esse método lista todas as comidas que estão no banco de dados
        return repository.findAll();
    }
    //Criar no BD
    public Food save(Food food){
        return repository.save(food);
    }
    //Deletar
    public void delete(Long id){
        //Como deletamos pelo id, precisa ser deleteById.
        repository.deleteById(id);
    }
}
