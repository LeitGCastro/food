package com.example.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Nutrient;
import com.example.food.repositories.NutrientRepository;

@RestController
@RequestMapping(value = "/nutrient")
public class NutrientController {
    
    @Autowired
    private NutrientRepository repository;

    @GetMapping
    public List<Nutrient> findAll(){
        List<Nutrient> result = repository.findAll();
        return result;        
    }
    
    @GetMapping(value = "/{id}")
    public Nutrient findById(@PathVariable Integer id){
        Nutrient result = repository.findById(id).get();
        return result;
    }
}
