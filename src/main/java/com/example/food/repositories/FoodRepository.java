package com.example.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{   
    
    List<Food> findByNameContains(String name);

} 