package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view. View;

import java.util.List;

/**
 * Created by kench on 12/2/2016.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context, 0 , earthquakes);
    }

    @Override
    public View getView(int position, View contextView, ViewGroup parent){
        View listItemView = contextView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthQuake = getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitudeView.setText(currentEarthQuake.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);

        locationView.setText(currentEarthQuake.getLocatoin());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        dateView.setText(currentEarthQuake.getDate());

        return listItemView;
        }
    }

