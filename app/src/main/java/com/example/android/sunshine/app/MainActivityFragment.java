package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        ArrayList<String> fakeData = null;
        fakeData.add("Today - Cloudy - 83/65");
        fakeData.add("Tomorrow - Thunderstorms - 81/63");
        fakeData.add("Saturday - Partly Cloudy - 83/65");
        fakeData.add("Sunday - Cloudy - 83/65");
        fakeData.add("Monday - Isolated Thunderstorms - 83/65");
        fakeData.add("Tuesday - Cloudy - 83/65");

        return rootView;
    }
}
