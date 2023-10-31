package com.example.food.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{   
    
    
} 