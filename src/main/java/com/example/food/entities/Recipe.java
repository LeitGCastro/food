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
    private Food foodId;

    @ManyToOne
    @JoinColumn(name = "id_prepare")
    private Prepare prepareId;

    @ManyToOne
    @JoinColumn(name = "id_group")
    private Group groupId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Food getFoodId() {
        return foodId;
    }
    public void setFoodId(Food foodId) {
        this.foodId = foodId;
    }
    public Prepare getPrepareId() {
        return prepareId;
    }
    public void setPrepareId(Prepare prepareId) {
        this.prepareId = prepareId;
    }
    public Group getGroupId() {
        return groupId;
    }
    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }
    
    
}
