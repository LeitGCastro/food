package com.example.food.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Nutrient;

public interface NutrientRepository extends JpaRepository<Nutrient, Integer>{

} 
