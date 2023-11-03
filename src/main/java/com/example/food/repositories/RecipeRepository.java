package com.example.food.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
    
}