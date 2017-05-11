package com.mvit.androidvezbe.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihajlo on 10-May-17.
 */

public class IngredientProvider {

    public static List<String> getIngredientNames() {
        List<String> names = new ArrayList<>();
        names.add("So");
        names.add("Biber");
        names.add("Ulje");
        return names;
    }
}
