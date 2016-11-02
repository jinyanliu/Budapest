package se.sugarest.jane.budapest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Play Fragment subclass.
 */
public class PlayFragment extends Fragment {

    public PlayFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Kiosk (Dec 27 19:00)", "A meeting point where you will find the perfect mood adjusted for every time of the day.", "http://kiosk-budapest.com/", R.drawable.play_kiosk));
        places.add(new Place("Cinema City Arena", "The only IMAX in Budapest plus 23 Screens and VIP rooms.", "http://www.arenaplaza.hu/", R.drawable.play_cinema_city_arena));
        places.add(new Place("Széchenyi thermal bath", "One of Europe's largest bath complexes in the heart of the City Park.", "http://www.szechenyifurdo.hu/", R.drawable.play_szechenyi_thermal_bath));
        places.add(new Place("Gellért Baths", "Part of the famous Hotel Gellért in Buda, which is a bath complex.", "http://www.gellertfurdo.hu/", R.drawable.play_gellert_baths));
        places.add(new Place("Rudas Baths", "A thermal and medicinal bath.", "http://www.rudasfurdo.hu/", R.drawable.play_rudas_baths));
        places.add(new Place("Magnolia Day Spa", "A place where no effort is spared to achieve harmony of body and soul.", "http://www.magnoliadayspa.hu/", R.drawable.play_magnolia_day_spa));
        places.add(new Place("Mandala Day Spa", "The home of relaxation and harmony.", "http://www.mandaladayspa.hu/", R.drawable.play_mandala_day_spa));
        places.add(new Place("OXYGEN Wellness", "Hungary's largest fitness and wellness facilities.", "http://www.oxygenwellness.hu/", R.drawable.play_oxygen_wellness));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /**
         * Find the ListView object in the view hierarchy of the Activity.
         * There is a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         * Make the ListView use the PlayAdapter so that the ListView will display list items for each place in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}
