package com.example.food.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.food.entities.Group;

/**
 * GroupRepository
 */
public interface GroupRepository extends JpaRepository<Group, Integer>{
 
    List<Group> findByNameContains(String name);

}