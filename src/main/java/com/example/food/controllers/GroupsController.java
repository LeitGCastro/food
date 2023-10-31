package com.example.food.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.entities.Group;
import com.example.food.repositories.GroupRepository;

@RestController
@RequestMapping(value = "/groups")
public class GroupsController {

    @Autowired
    private GroupRepository repository;

    @GetMapping
    public List<Group> findAll(){
        List<Group> result = repository.findAll();
        return result;
    }

}
