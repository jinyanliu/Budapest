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

        places.add(new Place("Chain Bridge", "Spans the River Danube between Buda and Pest, the western and eastern sides.", "https://en.wikipedia.org/wiki/Chain_Bridge_(Budapest)", R.drawable.see_chain_bridge));
        places.add(new Place("Elisabeth Bridge", "The third newest bridge connecting Buda and Pest across the River Danube.", "https://en.wikipedia.org/wiki/Elisabeth_Bridge_(Budapest)", R.drawable.see_elisabeth_bridge));
        places.add(new Place("St. Stephen's Basilica", "Dedicated to the holy king St Stephen who was also the founder of the Hungarian state.", "http://www.bazilika.biz/", R.drawable.see_ststephens_basilica));
        places.add(new Place("Hungarian Parliament Building", "Currently the largest building in Hungary and the tallest building in Budapest.", "http://www.parlament.hu/", R.drawable.see_hungarian_parliament_building));
        places.add(new Place("Gellért Hill", "A 235m high hill overlooking the Danube.", "https://en.wikipedia.org/wiki/Gell%C3%A9rt_Hill", R.drawable.see_gellert_hill));
        places.add(new Place("Várhegy", "Castle Hill", "https://en.wikipedia.org/wiki/V%C3%A1rhegy", R.drawable.see_varhegy));
        places.add(new Place("Buda Castle", "The castle of the Hungarian kings, which was first completed in 1265.", "http://www2.budavar.hu/index.php?menu=136", R.drawable.see_buda_castle));
        places.add(new Place("Budapest History Museum", "The museum of the capital's history documents, collect relics.", "http://www.btm.hu/", R.drawable.see_budapest_history_museum));
        places.add(new Place("Hungarian National Gallery", "Established in 1957 as the national art museum.", "http://mng.hu/", R.drawable.see_hungarian_national_gallery));
        places.add(new Place("Great Market Hall", "The largest and oldest indoor market in Budapest.", "http://www.piaconline.hu/new/index.php", R.drawable.see_great_market_hall));
        places.add(new Place("Budapest Zoo and Botanical Garden", "The oldest zoo park in Hungary and one of the oldest in the world.", "http://www.zoobudapest.com/", R.drawable.see_budapest_zoo_and_botanical_garden));
        places.add(new Place("National Széchényi Library", "Repositories of knowledge in the cultural heritage.", "http://www.oszk.hu/", R.drawable.see_national_szechenyi_library));
        places.add(new Place("Museum of Fine Arts", "International Art", "http://www.szepmuveszeti.hu/", R.drawable.see_museum_of_fine_arts));
        places.add(new Place("Heroes' Square", "A host to many political events.", "https://en.wikipedia.org/wiki/H%C5%91s%C3%B6k_tere", R.drawable.see_heroes_square));
        places.add(new Place("Fisherman's Bastion", "Were built in the 19th century to serve as a lookout tower for the best panoramic views.", "http://www.fishermansbastion.com/", R.drawable.see_fishermans_bastion));
        places.add(new Place("Matthias Church", "A Roman Catholic church, which was constructed in the florid late Gothic style.", "http://www.matyas-templom.hu/", R.drawable.see_matthias_church));
        places.add(new Place("Hungarian State Opera House", "The second largest opera house in Budapest and in Hungary.", "http://www.opera.hu/", R.drawable.see_hungarian_state_opera_house));
        places.add(new Place("Margaret Island", "In the middle of the Danube in central Budapest.", "https://en.wikipedia.org/wiki/Margaret_Island", R.drawable.see_margaret_island));
        places.add(new Place("Népliget", "The biggest public park in Budapest.", "https://en.wikipedia.org/wiki/People%27s_Park_(Budapest)", R.drawable.see_nepliget));

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
         * Make the ListView use the PlaceAdapter so that the ListView will display list items for each place in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}
