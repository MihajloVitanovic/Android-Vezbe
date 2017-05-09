package com.mvit.androidvezbe.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class Category {

    private int id;
    private String name;
    private List<Food> food;

    public Category(){
        food = new ArrayList<>();
    }

    public Category(int id, String name) {
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
