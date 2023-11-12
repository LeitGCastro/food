package com.example.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Group;
import com.example.food.repositories.GroupRepository;

@RestController
@RequestMapping(value = "/group")
public class GroupController {
    
    @Autowired
    private GroupRepository repository;

    @GetMapping 
    public List<Group> findAll(){
        List<Group> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Group findById(@PathVariable Integer id){
        Group result = repository.findById(id).get();
        return result;
    }
    
    @GetMapping(value = "/name")
    public List<Group> findByNameContains(@RequestParam("name") String name){
        List<Group> result = repository.findByNameContains(name);
        return result;
    }
}
