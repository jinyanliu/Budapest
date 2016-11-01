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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place("Comme Chez Soi","A romantic, candlelit dinner in a true small Mediterranean Restaurant!","http://www.commechezsoi.hu/", R.drawable.eat_comme_chez_soi));
        places.add(new Place("Meat Boutique (Dec 24 19:00)","Sitting at the foot of Castle Hill, the Chain Bridge Buda side, with view of the Danube flowing.","http://meatboutique.hu/", R.drawable.eat_meat_boutique));
        places.add(new Place("Kiosk (Dec 27 19:00)","A meeting point where you will find the perfect mood adjusted for every time of the day.","http://kiosk-budapest.com/", R.drawable.eat_kiosk));
        places.add(new Place("Vintage Garden","Hungarian Restaurant","https://www.facebook.com/vintagegardenbudapest/", R.drawable.eat_vintage_garden));
        places.add(new Place("Pastrami","Because you need a place where you can at last taste New York’s most popular sandwiches.","http://pastrami.hu/", R.drawable.eat_pastrami));
        places.add(new Place("Tuning Bar & Burger","international","http://www.tuningburgerbudapest.hu/etlap-menu/", 0));
        places.add(new Place("Terminal","international","http://terminalrestaurant.hu/en/", 0));
        places.add(new Place("Amber's","bakery","https://ambers.hu/", 0));
        places.add(new Place("Fruccola","break","http://fruccola.hu/english.html", 0));
        places.add(new Place("Paprika Vendéglő","european","http://www.paprikavendeglo.hu/angol/index.html", 0));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_eat);

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
