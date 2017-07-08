package com.example.android.brnotourguide;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class PubFragment extends Fragment {

    public PubFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.Pub_name_1, R.string.Pub_adress_1, R.string.Pub_hours_1, R.string.Pub_description_1,
                R.drawable.pub1));
        places.add(new Place(R.string.Pub_name_2, R.string.Pub_adress_2, R.string.Pub_hours_2, R.string.Pub_description_2,
                R.drawable.pub2));
        places.add(new Place(R.string.Pub_name_3, R.string.Pub_adress_3, R.string.Pub_hours_3, R.string.Pub_description_3,
                R.drawable.pub3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}






