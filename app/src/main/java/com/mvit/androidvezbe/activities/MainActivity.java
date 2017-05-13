package com.mvit.androidvezbe.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.mvit.androidvezbe.R;
import com.mvit.androidvezbe.fragments.DetailFragment;
import com.mvit.androidvezbe.fragments.ListFragment;
import com.mvit.androidvezbe.provider.FoodProvider;
import java.util.List;

public class MainActivity extends Activity implements ListFragment.OnItemSelectedListener {

    boolean landscape = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            // FragmentTransaction is a set of changes (e.g. adding, removing and replacing fragments) that you want to perform at the same time.
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ListFragment masterFragment = new ListFragment();
            ft.add(R.id.master_view, masterFragment, "Master_Fragment_1");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

        if (findViewById(R.id.detail_view) != null) {
            landscape = true;
            getFragmentManager().popBackStack();

            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
            if (detailFragment == null) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                detailFragment = new DetailFragment();
                ft.replace(R.id.detail_view, detailFragment, "Detail_Fragment_1");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }

        //***---------------------------------V Stari kod V---------------------------------***
        /*// Loads food from array resource
        final List<String> foodNames = FoodProvider.getFoodNames();

        // Creates an ArrayAdaptar from the array of String
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foodNames);
        ListView listView = (ListView) findViewById(R.id.lista_jela);

        // Assigns ArrayAdaptar to ListView
        listView.setAdapter(dataAdapter);

        // Starts the SecondActivity and sends it the selected URL as an extra data
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });*/
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

    @Override
    public void onItemSelected(int position) {
        if (landscape) {
            // If the device is in the landscape mode updates detail fragment's content.
            DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_view);
            detailFragment.updateContent(position);
        } else {
            // If the device is in the portrait mode sets detail fragment's content and replaces master fragment with detail fragment in a fragment transaction.
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setContent(position);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.master_view, detailFragment, "Detail_Fragment_2");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
