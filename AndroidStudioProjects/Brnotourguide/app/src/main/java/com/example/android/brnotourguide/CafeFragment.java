package com.example.android.brnotourguide;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CafeFragment extends Fragment {

    public CafeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.Cafe_name_1, R.string.Cafe_adress_1, R.string.Cafe_hours_1, R.string.Cafe_description_1,
                R.drawable.cofe1));
        places.add(new Place(R.string.Cafe_name_2, R.string.Cafe_adress_2, R.string.Cafe_hours_2, R.string.Cafe_description_2,
                R.drawable.cofe2));
        places.add(new Place(R.string.Cafe_name_3, R.string.Cafe_adress_3, R.string.Cafe_hours_3, R.string.Cafe_description_3,
                R.drawable.cofe3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}






