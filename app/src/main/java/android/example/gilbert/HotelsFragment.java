package android.example.gilbert;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) { View rootView = inflater.inflate(R.layout.tour_list, container, false);
        // Create a list of entertainment places
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));
        tour.add(new Tour(R.drawable.ic_action_achievement,R.drawable.ic_action_achievement));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.category_attractions);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}