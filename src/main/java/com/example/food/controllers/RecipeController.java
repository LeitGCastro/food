package com.example.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Recipe;
import com.example.food.repositories.RecipeRepository;

@RestController
@RequestMapping(value = "/")
public class RecipeController {
    
    @Autowired
    private RecipeRepository repository;

    @GetMapping
    public List<Recipe> findAll(){
        List<Recipe> result = repository.findAll();
        return result;
    }
    
    @GetMapping(value = "/{id}")
    public Recipe findById(@PathVariable Integer id){
        Recipe result = repository.findById(id).get();
        return result;
    }

    // @GetMapping(value = "/prepare")
    // public List<Recipe> findByPrepareId(@RequestParam("id") String id){
    //     List<Recipe> result = repository.findByPrepareId(id);
    //     return result;
    // }
}
