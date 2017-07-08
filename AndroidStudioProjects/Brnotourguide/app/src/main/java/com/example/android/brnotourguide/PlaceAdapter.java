package com.example.android.brnotourguide;

/**
 * Created by jansplichal on 06.07.17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the place object location
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        //get proper string for current place a set it as a text
        placeName.setText(currentPlace.getplaceNameId());

        // Find the TextView in the list_item.xml layout
        TextView placeAdress = (TextView) listItemView.findViewById(R.id.place_adress);
        //get proper string for current place a set it as a text
        placeAdress.setText(currentPlace.getplaceAdressId());

        // Find the TextView in the list_item.xml layout
        TextView placeHours = (TextView) listItemView.findViewById(R.id.place_hours);
        //get proper string for current place a set it as a text
        placeHours.setText(currentPlace.getplaceHoursId());

        // Find the TextView in the list_item.xml layout
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);
        //get proper string for current place a set it as a text
        placeDescription.setText(currentPlace.getplaceDescriptionId());

        // Find the TextView in the list_item.xml layout with id image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getimageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Return the whole list
        return listItemView;

    }
}


