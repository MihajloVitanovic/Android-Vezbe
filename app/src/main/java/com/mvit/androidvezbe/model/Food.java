package com.mvit.androidvezbe.model;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class Food {

    private int id;
    private String image;
    private String name;
    private String description;
    private Category category;
    private String spinner;
    private double price;
    private float calories;

    public Food(){}

    public Food(int id, float calories, String image, String name, String description, Category category, String spinner, double price) {
        this.id = id;
        this.calories = calories;
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.spinner = spinner;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSpinner() {
        return spinner;
    }

    public void setSpinner(String spinner) {
        this.spinner = spinner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", spinner='" + spinner + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }

}