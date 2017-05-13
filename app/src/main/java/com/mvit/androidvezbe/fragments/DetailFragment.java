package com.mvit.androidvezbe.fragments;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mvit.androidvezbe.R;
import com.mvit.androidvezbe.provider.CategoryProvider;
import com.mvit.androidvezbe.provider.FoodProvider;
import com.mvit.androidvezbe.provider.IngredientProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by androiddevelopment on 13.5.17..
 */

public class DetailFragment extends Fragment {

    private int position = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(FoodProvider.getFoodById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tv_name" TextView and sets "text" property
        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(FoodProvider.getFoodById(position).getName());

        // Finds "tv_description" TextView and sets "text" property
        TextView tvDescription = (TextView) getView().findViewById(R.id.tv_description);
        tvDescription.setText(FoodProvider.getFoodById(position).getDescription());

        // Loads food from array resource
        final List<String> ingredientsNames = IngredientProvider.getIngredientNames();
        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ingredientsNames);
        //ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categories);

        // Finds "lv_ingredients" ListView and sets "list" property
        ListView lvIngredients = (ListView) getView().findViewById(R.id.lv_ingredients);
        // Assigns ArrayAdaptar to ListView
        lvIngredients.setAdapter(dataAdapter);

        // Finds "tv_price" TextView and sets "text" property
        TextView tvPrice = (TextView) getView().findViewById(R.id.tv_price);
        tvPrice.setText(FoodProvider.getFoodById(position).getPrice() + " cena");

        // Finds "tv_calories" TextView and sets "text" property
        TextView tvCalories = (TextView) getView().findViewById(R.id.tv_calories);
        tvCalories.setText(FoodProvider.getFoodById(position).getCalories() + " ukupno kalorija");

        // Finds "sp_category" Spinner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> categories = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)(FoodProvider.getFoodById(position).getCategory().getId()));

    }

    // onCreateView method is a life-cycle method that is called  to have the fragment instantiate its user interface view.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        // Finds view in the view hierarchy and returns it.
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    public void setContent(final int position) {
        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(FoodProvider.getFoodById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tv_name" TextView and sets "text" property
        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(FoodProvider.getFoodById(position).getName());

        // Finds "tv_description" TextView and sets "text" property
        TextView tvDescription = (TextView) getView().findViewById(R.id.tv_description);
        tvDescription.setText(FoodProvider.getFoodById(position).getDescription());

        // Loads food from array resource
        final List<String> ingredientsNames = IngredientProvider.getIngredientNames();
        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ingredientsNames);
        //ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, categories);

        // Finds "lv_ingredients" ListView and sets "list" property
        ListView lvIngredients = (ListView) getView().findViewById(R.id.lv_ingredients);
        // Assigns ArrayAdaptar to ListView
        lvIngredients.setAdapter(dataAdapter);

        // Finds "tv_price" TextView and sets "text" property
        TextView tvPrice = (TextView) getView().findViewById(R.id.tv_price);
        tvPrice.setText(FoodProvider.getFoodById(position).getPrice() + " cena");

        // Finds "tv_calories" TextView and sets "text" property
        TextView tvCalories = (TextView) getView().findViewById(R.id.tv_calories);
        tvCalories.setText(FoodProvider.getFoodById(position).getCalories() + " ukupno kalorija");

        // Finds "sp_category" Spinner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_category);
        List<String> categories = CategoryProvider.getCategoryNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)(FoodProvider.getFoodById(position).getCategory().getId()));


    }


}
