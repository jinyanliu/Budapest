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

        places.add(new Place("Chain Bridge", R.string.see_sd_chain_bridge, "https://en.wikipedia.org/wiki/Chain_Bridge_(Budapest)", R.drawable.see_chain_bridge));
        places.add(new Place("Elisabeth Bridge", R.string.see_sd_elisabeth_bridge, "https://en.wikipedia.org/wiki/Elisabeth_Bridge_(Budapest)", R.drawable.see_elisabeth_bridge));
        places.add(new Place("St. Stephen's Basilica", R.string.see_sd_ststephens_basilica, "http://www.bazilika.biz/", R.drawable.see_ststephens_basilica));
        places.add(new Place("Hungarian Parliament Building", R.string.see_sd_hungarian_parliament_building, "http://www.parlament.hu/", R.drawable.see_hungarian_parliament_building));
        places.add(new Place("Gellért Hill", R.string.see_sd_gellert_hill, "https://en.wikipedia.org/wiki/Gell%C3%A9rt_Hill", R.drawable.see_gellert_hill));
        places.add(new Place("Várhegy", R.string.see_sd_varhergy, "https://en.wikipedia.org/wiki/V%C3%A1rhegy", R.drawable.see_varhegy));
        places.add(new Place("Buda Castle", R.string.see_sd_buda_castle, "http://www2.budavar.hu/index.php?menu=136", R.drawable.see_buda_castle));
        places.add(new Place("Budapest History Museum", R.string.see_sd_budapest_history_museum, "http://www.btm.hu/", R.drawable.see_budapest_history_museum));
        places.add(new Place("Hungarian National Gallery", R.string.see_sd_hungarian_national_gallery, "http://mng.hu/", R.drawable.see_hungarian_national_gallery));
        places.add(new Place("Great Market Hall", R.string.see_sd_great_market_hall, "http://www.piaconline.hu/new/index.php", R.drawable.see_great_market_hall));
        places.add(new Place("Budapest Zoo and Botanical Garden", R.string.see_sd_budapest_zoo_and_botanical_garden, "http://www.zoobudapest.com/", R.drawable.see_budapest_zoo_and_botanical_garden));
        places.add(new Place("National Széchényi Library", R.string.see_sd_national_szechenyi_library, "http://www.oszk.hu/", R.drawable.see_national_szechenyi_library));
        places.add(new Place("Museum of Fine Arts", R.string.see_sd_museums_of_fine_arts, "http://www.szepmuveszeti.hu/", R.drawable.see_museum_of_fine_arts));
        places.add(new Place("Heroes' Square", R.string.see_sd_heroes_square, "https://en.wikipedia.org/wiki/H%C5%91s%C3%B6k_tere", R.drawable.see_heroes_square));
        places.add(new Place("Fisherman's Bastion", R.string.see_sd_fishmans_bastion, "http://www.fishermansbastion.com/", R.drawable.see_fishermans_bastion));
        places.add(new Place("Matthias Church", R.string.see_sd_matthias_church, "http://www.matyas-templom.hu/", R.drawable.see_matthias_church));
        places.add(new Place("Hungarian State Opera House", R.string.see_sd_hungarian_state_opera_house, "http://www.opera.hu/", R.drawable.see_hungarian_state_opera_house));
        places.add(new Place("Margaret Island", R.string.see_sd_margaret_island, "https://en.wikipedia.org/wiki/Margaret_Island", R.drawable.see_margaret_island));
        places.add(new Place("Népliget", R.string.see_sd_nepliget, "https://en.wikipedia.org/wiki/People%27s_Park_(Budapest)", R.drawable.see_nepliget));

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
