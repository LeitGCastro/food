package com.example.food.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes_nutrients")
public class RecipesNutrients implements Serializable { 

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_recipe", referencedColumnName = "id")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "id_nutrient", referencedColumnName = "id")
    private Nutrient nutrient;

    private float value;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
