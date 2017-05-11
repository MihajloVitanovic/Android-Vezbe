package com.mvit.androidvezbe.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.mvit.androidvezbe.R;
import com.mvit.androidvezbe.provider.CategoryProvider;
import com.mvit.androidvezbe.provider.FoodProvider;
import com.mvit.androidvezbe.provider.IngredientProvider;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class SecondActivity extends Activity {

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_relative);

        // Loads an URL into the WebView
        final int position = getIntent().getIntExtra("position", 0);

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(FoodProvider.getFoodById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tv_name" TextView and sets "text" property
        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(FoodProvider.getFoodById(position).getName());

        // Finds "tv_description" TextView and sets "text" property
        TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setText(FoodProvider.getFoodById(position).getDescription());

        // Loads food from array resource
        final List<String> ingredientsNames = IngredientProvider.getIngredientNames();
        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ingredientsNames);
        // Finds "lv_ingredients" ListView and sets "list" property
        ListView lvIngredients = (ListView) findViewById(R.id.lv_ingredients);
        // Assigns ArrayAdaptar to ListView
        lvIngredients.setAdapter(dataAdapter);

        // Finds "tv_price" TextView and sets "text" property
        TextView tvPrice = (TextView) findViewById(R.id.tv_price);
        tvPrice.setText(FoodProvider.getFoodById(position).getPrice() + " cena");

        // Finds "tv_calories" TextView and sets "text" property
        TextView tvCalories = (TextView) findViewById(R.id.tv_calories);
        tvCalories.setText(FoodProvider.getFoodById(position).getCalories() + " ukupno kalorija");

        // Finds "sp_category" Spinner and sets "selection" property
        Spinner category = (Spinner) findViewById(R.id.sp_category);
        List<String> categories = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)(FoodProvider.getFoodById(position).getCategory().getId()));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
