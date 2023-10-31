package com.example.food.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Group;

public interface GroupRepository extends JpaRepository<Group, Integer>{
    
}
