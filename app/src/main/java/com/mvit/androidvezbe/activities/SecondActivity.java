package com.mvit.androidvezbe.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.mvit.androidvezbe.R;
import com.mvit.androidvezbe.provider.CategoryProvider;
import com.mvit.androidvezbe.provider.FoodProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by androiddevelopment on 9.5.17..
 */

public class SecondActivity extends Activity {

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final int position = getIntent().getIntExtra("position", 0);

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(FoodProvider.getFoodById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(FoodProvider.getFoodById(position).getName());

        TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setText(FoodProvider.getFoodById(position).getDescription());

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
