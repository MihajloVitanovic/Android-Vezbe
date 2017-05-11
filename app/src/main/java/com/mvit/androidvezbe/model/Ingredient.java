package com.mvit.androidvezbe.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihajlo on 10-May-17.
 */

public class Ingredient {

    private int id;
    private String name;
    private List<Food> food;

    public Ingredient(){
        food = new ArrayList<>();
    }

    public Ingredient(int id, String name) {
        this.id = id;
        this.name = name;
        food = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }
}
