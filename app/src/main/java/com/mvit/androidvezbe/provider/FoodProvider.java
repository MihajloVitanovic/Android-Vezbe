package com.mvit.androidvezbe.provider;

import com.mvit.androidvezbe.model.Category;
import com.mvit.androidvezbe.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class FoodProvider {

    public static List<Food> getFood(){
        Category predjela = new Category(0, "Predjela");
        Category glavnaJela = new Category(1, "Glavna jela");
        Category dezerti = new Category(2, "Dezerti");

        List<Food> food = new ArrayList<>();
        food.add(new Food(0, 120.0f, "img", "name1", "desc", predjela, "spinner", 20.0));
        food.add(new Food(1, 120.0f, "img", "name2", "desc", glavnaJela, "spinner", 20.0));
        food.add(new Food(2, 120.0f, "img", "name3", "desc", dezerti, "spinner", 20.0));
        return food;
    }

    public static List<String> getFoodNames() {
        List<String> names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        return names;
    }

    public static Food getFoodById(int id) {

        Category predjela = new Category(0, "Predjela");
        Category glavnajela = new Category(1, "Glavna jela");
        Category dezerti = new Category(2, "Dezerti");

        switch (id) {
            case 0:
                return new Food(0, 120.0f, "img", "name", "desc", predjela, "spin", 20.0);
            case 1:
                return new Food(0, 120.0f, "img", "name", "desc", glavnajela, "spin", 20.0);
            case 2:
                return new Food(0, 120.0f, "img", "name", "desc", dezerti, "spin", 20.0);
            default:
                return null;
        }
    }

}
