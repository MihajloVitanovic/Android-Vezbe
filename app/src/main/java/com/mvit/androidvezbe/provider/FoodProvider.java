package com.mvit.androidvezbe.provider;

import android.support.annotation.Nullable;

import com.mvit.androidvezbe.model.Category;
import com.mvit.androidvezbe.model.Food;
import com.mvit.androidvezbe.model.Ingredient;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class FoodProvider {

    /*
    public static List<Food> getFood(){
        Category predjela = new Category(0, "Predjela");
        Category glavnaJela = new Category(1, "Glavna jela");
        Category dezerti = new Category(2, "Dezerti");

        List<Food> food = new ArrayList<>();
        food.add(new Food(0, 120.0f, "apples.jpg", "name1", "desc", predjela, "spinner", 20.0));
        food.add(new Food(1, 120.0f, "apples.jpg", "name2", "desc", glavnaJela, "spinner", 20.0));
        food.add(new Food(2, 120.0f, "apples.jpg", "name3", "desc", dezerti, "spinner", 20.0));
        return food;
    }
    */

    public static List<String> getFoodNames() {
        List<String> names = new ArrayList<>();
        names.add("ImeZaPrviActivity111");
        names.add("ImeZaPrviActivity222");
        names.add("ImeZaPrviActivity333");
        return names;
    }

    public static Food getFoodById(int id) {

        Category predjela = new Category(0, "Predjela");
        Category glavnajela = new Category(1, "Glavna jela");
        Category dezerti = new Category(2, "Dezerti");

        Ingredient so = new Ingredient(0, "So");
        Ingredient biber = new Ingredient(1, "Biber");
        Ingredient ulje = new Ingredient(2, "Ulje");

        switch (id) {
            case 0:
                return new Food(0, "120", "apples.jpg", "name11", "desc", predjela, so, "spin", "150.00");
            case 1:
                return new Food(0, "120", "apples.jpg", "name22", "desc", glavnajela, biber, "spin", "150.00");
            case 2:
                return new Food(0, "120", "apples.jpg", "name33", "desc", dezerti, ulje, "spin", "150.00");
            default:
                return null;
        }
    }

}
