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

        places.add(new Place(R.string.play_name_kiosk, R.string.play_sd_kiosk, R.string.play_web_kiosk, R.drawable.play_kiosk));
        places.add(new Place(R.string.play_name_cinema_city_arena, R.string.play_sd_cinema_city_arena, R.string.play_web_cinema_city_arena, R.drawable.play_cinema_city_arena));
        places.add(new Place(R.string.play_name_szechenyi_thermal_bath, R.string.play_sd_szechenyi_thermal_bath, R.string.play_web_szechenyi_thermal_bath, R.drawable.play_szechenyi_thermal_bath));
        places.add(new Place(R.string.play_name_gellert_baths, R.string.play_sd_gellert_baths, R.string.play_web_gellert_baths, R.drawable.play_gellert_baths));
        places.add(new Place(R.string.play_name_rudas_baths, R.string.play_sd_rudas_baths, R.string.play_web_rudas_baths, R.drawable.play_rudas_baths));
        places.add(new Place(R.string.play_name_magnolia_day_spa, R.string.play_sd_magnolia_day_spa, R.string.play_web_magnolia_day_spa, R.drawable.play_magnolia_day_spa));
        places.add(new Place(R.string.play_name_mandala_day_spa, R.string.play_sd_mandala_day_spa, R.string.play_web_mandala_day_spa, R.drawable.play_mandala_day_spa));
        places.add(new Place(R.string.play_name_oxygen_wellness, R.string.play_sd_oxygen_wellness, R.string.play_web_oxygen_wellness, R.drawable.play_oxygen_wellness));

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
