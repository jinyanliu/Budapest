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
        places.add(new Place("Meat Boutique","international","http://meatboutique.hu/menu.html", 0));
        places.add(new Place("Kiosk","european","http://kiosk-budapest.com/", 0));
        places.add(new Place("Vintage Garden","hungarian","https://www.facebook.com/vintagegardenbudapest/about/", 0));
        places.add(new Place("Pastrami","international","http://pastrami.hu/#", 0));
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
