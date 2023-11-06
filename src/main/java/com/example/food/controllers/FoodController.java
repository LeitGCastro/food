package com.example.food.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Food;
import com.example.food.repositories.FoodRepository;

@RestController
@RequestMapping(value = "/food")
public class FoodController {
    
    // Injeção de dependencias para instanciar o FoodRepository
    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<Food> findAll(){
        List<Food> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Food findById(@PathVariable Integer id){
        Food result = repository.findById(id).get();
        return result;
    }

    @GetMapping(value = "/name")
    public List<Food> findByNameContains(@RequestParam("name") String name){
        List<Food> result = repository.findByNameContains(name);
        return result;
    }

}
