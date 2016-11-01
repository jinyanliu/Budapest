package se.sugarest.jane.budapest;

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
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Kiosk (Dec 27 19:00)","A meeting point where you will find the perfect mood adjusted for every time of the day.","http://kiosk-budapest.com/", R.drawable.eat_kiosk));
        places.add(new Place("Magnolia Day Spa","day spa","http://www.magnoliadayspa.hu/", 0));
        places.add(new Place("Mandala Day Spa","day spa","http://www.en.mandaladayspa.hu/", 0));
        places.add(new Place("Széchenyi thermal bath","bath","http://www.szechenyibath.hu/", 0));
        places.add(new Place("Gellért Baths","bath","http://www.gellertfurdo.hu/", 0));
        places.add(new Place("OXYGEN Wellness","gym & bath","http://www.oxygenwellness.hu/", 0));
        places.add(new Place("Buda Hills","hill","https://en.wikipedia.org/wiki/Buda_Hills", 0));
        places.add(new Place("Akvárium Klub","live music","http://akvariumklub.hu/", 0));
        places.add(new Place("Budapest Operetta-theater","opera","http://www.operett.hu/operett.php", 0));
        places.add(new Place("Budapest Bábszínház","theatre","http://www.budapest-babszinhaz.hu/", 0));
        places.add(new Place("Ladó Café","live music & dance","http://ladocafe.hu/?lang=en", 0));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_play);

        /**
         * Find the ListView object in the view hierarchy of the Activity.
         * There should be a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         * Make the ListView use the WordAdapter we created above,
         * so that the ListView will display list items for each word in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }

}
