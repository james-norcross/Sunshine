package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // fake data
        ArrayList<String> weekForecast = new ArrayList<String>();

        weekForecast.add("Today - Cloudy - 83/65");
        weekForecast.add("Tomorrow - Thunderstorms - 81/63");
        weekForecast.add("Saturday - Partly Cloudy - 83/65");
        weekForecast.add("Sunday - Cloudy - 83/65");
        weekForecast.add("Monday - Isolated Thunderstorms - 83/65");
        weekForecast.add("Tuesday - Cloudy - 83/65");

        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forcast, R.id.list_item_forecast_textview, weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
