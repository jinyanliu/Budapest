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

        places.add(new Place("Várhegy", "Castle Hill", "https://en.wikipedia.org/wiki/V%C3%A1rhegy", R.drawable.see_varhegy));
        places.add(new Place("Buda Castle", "The castle of the Hungarian kings, which was first completed in 1265.", "http://www2.budavar.hu/index.php?menu=136", R.drawable.see_buda_castle));
        places.add(new Place("Budapest History Museum", "The museum of the capital's history documents, collect relics.", "http://www.btm.hu/", R.drawable.see_budapest_history_museum));
        places.add(new Place("Hungarian National Gallery", "Established in 1957 as the national art museum.", "http://mng.hu/", R.drawable.see_hungarian_national_gallery));
        places.add(new Place("National Széchényi Library", "Repositories of knowledge in the cultural heritage.", "http://www.oszk.hu/", R.drawable.see_national_szechenyi_library));
        places.add(new Place("Museum of Fine Arts", "International Art", "http://www.szepmuveszeti.hu/", R.drawable.see_museum_of_fine_arts));
        places.add(new Place("Fisherman's Bastion", "Were built in the 19th century to serve as a lookout tower for the best panoramic views.", "http://www.fishermansbastion.com/", R.drawable.see_fishermans_bastion));
        places.add(new Place("Matthias Church", "A Roman Catholic church, which was constructed in the florid late Gothic style.", "http://www.matyas-templom.hu/", R.drawable.see_matthias_church));
        places.add(new Place("Chain Bridge", "bridge", "https://en.wikipedia.org/wiki/Chain_Bridge_(Budapest)", 0));


        places.add(new Place("Budapest Zoo and Botanical Garden", "zoo & park", "https://en.wikipedia.org/wiki/Budapest_Zoo_and_Botanical_Garden", 0));
        places.add(new Place("Margaret Island", "island & park", "https://en.wikipedia.org/wiki/Margaret_Island", 0));

        places.add(new Place("Deák Ferenc square", "square & transport junction", "https://en.wikipedia.org/wiki/De%C3%A1k_Ferenc_t%C3%A9r", 0));
        places.add(new Place("Great Market Hall", "indoor market", "https://en.wikipedia.org/wiki/Great_Market_Hall_(Budapest)", 0));
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
