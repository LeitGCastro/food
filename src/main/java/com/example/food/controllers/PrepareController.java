package com.example.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Prepare;
import com.example.food.repositories.PrepareRepository;

@RestController
@RequestMapping(value = "/prepare")
public class PrepareController {
    
    @Autowired
    private PrepareRepository repository;

    @GetMapping
    public List<Prepare> findAll(){
        List<Prepare> result = repository.findAll();
        return result;
    }
}
