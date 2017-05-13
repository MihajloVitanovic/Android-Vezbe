package com.mvit.androidvezbe.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.mvit.androidvezbe.R;
import com.mvit.androidvezbe.provider.FoodProvider;
import java.util.List;

/**
 * Created by androiddevelopment on 13.5.17..
 */

public class ListFragment extends Fragment {

    OnItemSelectedListener listener;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final List<String> foodNames = FoodProvider.getFoodNames();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, foodNames);
        ListView listView = (ListView) getActivity().findViewById(R.id.lista_jela);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    // onAttach method is a life-cycle method that is called when a fragment is first attached to its context.
    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "MasterFragment.onAttach()", Toast.LENGTH_SHORT).show();

        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    // Container activity must implement this interface
    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }

}
