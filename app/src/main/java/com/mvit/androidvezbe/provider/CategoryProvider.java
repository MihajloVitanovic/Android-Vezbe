package com.mvit.androidvezbe.provider;

import com.mvit.androidvezbe.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class CategoryProvider {

    /*
    public static List<Category> getCategories(){
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Predjela"));
        categories.add(new Category(1, "Glavna jela"));
        categories.add(new Category(2, "Dezerti"));
        return categories;
    }
    */

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Predjela");
        names.add("Glavna jela");
        names.add("Dezerti");
        return names;
    }

    /*
    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Predjela");
            case 1:
                return new Category(1, "Glavna jela");
            case 2:
                return new Category(2, "Dezerti");
            default:
                return null;
        }
    }
    */
}
