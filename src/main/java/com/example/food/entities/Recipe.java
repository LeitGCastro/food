package com.example.food.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food id_food;

    @ManyToOne
    @JoinColumn(name = "id_prepare")
    private Prepare id_prepare;

    @ManyToOne
    @JoinColumn(name = "id_group")
    private Group id_group;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Food getId_food() {
        return id_food;
    }
    public void setId_food(Food id_food) {
        this.id_food = id_food;
    }
    public Prepare getId_prepare() {
        return id_prepare;
    }
    public void setId_prepare(Prepare id_prepare) {
        this.id_prepare = id_prepare;
    }
    public Group getId_group() {
        return id_group;
    }
    public void setId_group(Group id_group) {
        this.id_group = id_group;
    }
    
}
