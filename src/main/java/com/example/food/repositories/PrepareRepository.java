package com.example.food.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Prepare;

public interface PrepareRepository extends JpaRepository<Prepare, Integer>{
    
}