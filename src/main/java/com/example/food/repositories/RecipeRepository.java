package com.example.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
    
    List<Recipe> findAll();

    // List<Recipe> findByPrepareId(String id);

}