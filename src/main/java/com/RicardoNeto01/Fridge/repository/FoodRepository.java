package com.RicardoNeto01.Fridge.repository;

import com.RicardoNeto01.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

//Para funcionar corretamente, é necessário passsar o tipo de model utilizado, e o tipo do id que o model usa.
public interface FoodRepository extends JpaRepository<Food, Long> {
}
