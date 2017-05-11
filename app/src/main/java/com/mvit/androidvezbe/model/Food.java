package com.mvit.androidvezbe.model;

import com.mvit.androidvezbe.provider.FoodProvider;

import java.text.DecimalFormat;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class Food {

    private int id;
    private String image;
    private String name;
    private String description;
    private Category category;
    private Ingredient ingredient;
    private String spinner;
    private double price;
    private float calories;

    //String priceString = Double.toString(price);
    //String caloriesString = Float.toString(calories);


    public Food(){}

    public Food(int id, float calories, String image, String name, String description, Category category, Ingredient ingredient, String spinner, double price) {
        this.id = id;
        this.calories = calories;
        //this.caloriesString = caloriesString;
        //this.priceString = priceString;
        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingredient = ingredient;
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

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
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

    /*public String getPriceString() {
        return priceString;
    }*/

    /*public void setPriceString(String priceString) {
        this.priceString = priceString;
    }*/

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    /*public String getCaloriesString() {
        return caloriesString;
    }*/

    /*public void setCaloriesString(String caloriesString) {
        this.caloriesString = caloriesString;
    }*/

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", spinner='" + spinner + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }

}