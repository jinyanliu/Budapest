package se.sugarest.jane.budapest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * See Fragment subclass.
 */
public class SeeFragment extends Fragment {

    public SeeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Budapest Zoo and Botanical Garden", "zoo & park", "https://en.wikipedia.org/wiki/Budapest_Zoo_and_Botanical_Garden", 0));
        places.add(new Place("Margaret Island", "island & park", "https://en.wikipedia.org/wiki/Margaret_Island", 0));
        places.add(new Place("Hungarian National Gallery", "art museum", "https://en.wikipedia.org/wiki/Hungarian_National_Gallery", 0));
        places.add(new Place("Chain Bridge", "bridge", "https://en.wikipedia.org/wiki/Chain_Bridge_(Budapest)", 0));
        places.add(new Place("Deák Ferenc square", "square & transport junction", "https://en.wikipedia.org/wiki/De%C3%A1k_Ferenc_t%C3%A9r", 0));
        places.add(new Place("Great Market Hall", "indoor market", "https://en.wikipedia.org/wiki/Great_Market_Hall_(Budapest)", 0));
        places.add(new Place("Fisherman's Bastion", "historical building", "https://en.wikipedia.org/wiki/Fisherman%27s_Bastion", 0));
        places.add(new Place("Buda Castle", "historical building", "https://en.wikipedia.org/wiki/Buda_Castle", 0));
        places.add(new Place("Hungarian Parliament Building", "historical building", "https://en.wikipedia.org/wiki/Hungarian_Parliament_Building", 0));
        places.add(new Place("Memento Park", "open-air museum", "https://en.wikipedia.org/wiki/Memento_Park", 0));

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
         * Make the ListView use the PlaceAdapter we created above,
         * so that the ListView will display list items for each place in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }

}
