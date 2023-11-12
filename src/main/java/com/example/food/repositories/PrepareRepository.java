package com.example.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Prepare;

public interface PrepareRepository extends JpaRepository<Prepare, Integer>{
    
    List<Prepare> findByNameContains(String name);

}