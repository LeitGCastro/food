package com.example.food.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes_nutrients")
public class RecipesNutrients { 

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_recipe")
    private Recipe id_recipe;

    @ManyToOne
    @JoinColumn(name = "id_nutrient")
    private Nutrient id_nutrient;

    private float value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Recipe getId_recipe() {
        return id_recipe;
    }

    public void setId_recipe(Recipe id_recipe) {
        this.id_recipe = id_recipe;
    }

    public Nutrient getId_nutrient() {
        return id_nutrient;
    }

    public void setId_nutrient(Nutrient id_nutrient) {
        this.id_nutrient = id_nutrient;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
