package se.sugarest.jane.budapest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Eat Fragment subclass.
 */
public class EatFragment extends Fragment {

    public EatFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Comme Chez Soi", R.string.eat_sd_comme_chez_soi, "http://www.commechezsoi.hu/", R.drawable.eat_comme_chez_soi));
        places.add(new Place("Vintage Garden (Dec 23 19:00)", R.string.eat_sd_vintage_garden, "https://www.facebook.com/vintagegardenbudapest/", R.drawable.eat_vintage_garden));
        places.add(new Place("Meat Boutique (Dec 24 19:00)", R.string.eat_sd_meat_boutique, "http://meatboutique.hu/", R.drawable.eat_meat_boutique));
        places.add(new Place("Kiosk (Dec 27 19:00)", R.string.eat_sd_kiosk, "http://kiosk-budapest.com/", R.drawable.eat_kiosk));
        places.add(new Place("Tuning Bar & Burger", R.string.eat_sd_tuning_bar_burger, "http://www.tuningburgerbudapest.hu/", R.drawable.eat_tuning_bar_burger));
        places.add(new Place("Terminal", R.string.eat_sd_terminal, "http://terminalrestaurant.hu/", R.drawable.eat_terminal));
        places.add(new Place("Pastrami", R.string.eat_sd_pastrami, "http://pastrami.hu/", R.drawable.eat_pastrami));
        places.add(new Place("Paprika Vendéglő", R.string.eat_sd_paprika_vendeglo, "http://www.paprikavendeglo.hu/", R.drawable.eat_paprika_vendeglo));
        places.add(new Place("Menza", R.string.eat_sd_menza, "http://www.menzaetterem.hu/", R.drawable.eat_menza));
        places.add(new Place("Nagyi Palacsintázója", R.string.eat_sd_nagyi_palacsintazoja, "http://nagyipali.hu/", R.drawable.eat_nagyi_palacsintazoja));
        places.add(new Place("Café Gerbeaud", R.string.eat_sd_cafe_gerbeaud, "http://www.gerbeaud.hu/", R.drawable.eat_gerbeaud_cukraszda));
        places.add(new Place("Amber's", R.string.eat_sd_ambers, "https://ambers.hu/", R.drawable.eat_ambers));
        places.add(new Place("Fruccola", R.string.eat_sd_fruccola, "http://fruccola.hu/", R.drawable.eat_fruccola));
        places.add(new Place("Book Café - Lotz Hall", R.string.eat_sd_book_cafe_lotz_hall, "http://www.lotzterem.hu/", R.drawable.eat_book_cafe));
        places.add(new Place("New York Café", R.string.eat_sd_new_york_cafe, "http://www.newyorkcafe.hu/", R.drawable.eat_new_york_cafe));

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
