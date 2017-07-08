package com.example.android.brnotourguide;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A restaurant fragment.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Creates a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.Restaurant_name_1, R.string.Restaurant_adress_1, R.string.Restaurant_hours_1, R.string.Restaurant_description_1,
                R.drawable.restaurant1));
        places.add(new Place(R.string.Restaurant_name_2, R.string.Restaurant_adress_2, R.string.Restaurant_hours_2, R.string.Restaurant_description_2,
                R.drawable.restaurant2));
        places.add(new Place(R.string.Restaurant_name_3, R.string.Restaurant_adress_3, R.string.Restaurant_hours_3, R.string.Restaurant_description_3,
                R.drawable.restaurant3));

        //connect to place adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // find the list view
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // set adapter for the list view
        listView.setAdapter(adapter);

        return rootView;
    }
}






