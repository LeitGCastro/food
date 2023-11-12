package com.example.food.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes_nutrients")
public class RecipesNutrients { 

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToMany
    @JoinColumn(name = "id_recipe")
    private List<Recipe> idRecipe;

    @ManyToMany
    @JoinColumn(name = "id_nutrient")
    private List<Nutrient> idNutrient;

    private float value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Recipe> getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(List<Recipe> idRecipe) {
        this.idRecipe = idRecipe;
    }

    public List<Nutrient> getIdNutrient() {
        return idNutrient;
    }

    public void setIdNutrient(List<Nutrient> idNutrient) {
        this.idNutrient = idNutrient;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
