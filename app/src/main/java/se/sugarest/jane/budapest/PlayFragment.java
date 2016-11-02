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
        places.add(new Place("Magnolia Day Spa", "day spa", "http://www.magnoliadayspa.hu/", 0));
        places.add(new Place("Mandala Day Spa", "day spa", "http://www.en.mandaladayspa.hu/", 0));
        places.add(new Place("OXYGEN Wellness", "gym & bath", "http://www.oxygenwellness.hu/", 0));
        places.add(new Place("Buda Hills", "hill", "https://en.wikipedia.org/wiki/Buda_Hills", 0));
        places.add(new Place("Akvárium Klub", "live music", "http://akvariumklub.hu/", 0));
        places.add(new Place("Budapest Operetta-theater", "opera", "http://www.operett.hu/operett.php", 0));
        places.add(new Place("Budapest Bábszínház", "theatre", "http://www.budapest-babszinhaz.hu/", 0));
        places.add(new Place("Ladó Café", "live music & dance", "http://ladocafe.hu/?lang=en", 0));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /**
         * Find the ListView object in the view hierarchy of the Activity.
         * There should be a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         * Make the ListView use the PlayAdapter we created above,
         * so that the ListView will display list items for each play in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }

}
