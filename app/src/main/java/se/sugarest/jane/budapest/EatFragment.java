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

        places.add(new Place("Comme Chez Soi", "A romantic, candlelit dinner in a true small Mediterranean Restaurant!", "http://www.commechezsoi.hu/", R.drawable.eat_comme_chez_soi));
        places.add(new Place("Vintage Garden (Dec 23 19:00)", "Hungarian Restaurant", "https://www.facebook.com/vintagegardenbudapest/", R.drawable.eat_vintage_garden));
        places.add(new Place("Meat Boutique (Dec 24 19:00)", "Sitting at the foot of Castle Hill, the Chain Bridge Buda side, with view of the Danube flowing.", "http://meatboutique.hu/", R.drawable.eat_meat_boutique));
        places.add(new Place("Kiosk (Dec 27 19:00)", "A meeting point where you will find the perfect mood adjusted for every time of the day.", "http://kiosk-budapest.com/", R.drawable.eat_kiosk));
        places.add(new Place("Tuning Bar & Burger", "Bar & Grill · Burger Restaurant", "http://www.tuningburgerbudapest.hu/", R.drawable.eat_tuning_bar_burger));
        places.add(new Place("Terminal", "Situated in what was once a bus station, where fusion cuisine await gastronomic adventurers.", "http://terminalrestaurant.hu/", R.drawable.eat_terminal));
        places.add(new Place("Pastrami", "Because you need a place where you can at last taste New York’s most popular sandwiches.", "http://pastrami.hu/", R.drawable.eat_pastrami));
        places.add(new Place("Paprika Vendéglő", "Hungarian Restaurant", "http://www.paprikavendeglo.hu/", R.drawable.eat_paprika_vendeglo));
        places.add(new Place("Menza", "Merging modern restaurants with the atmosphere Budapest's 1960s coffee bars.", "http://www.menzaetterem.hu/", R.drawable.eat_menza));
        places.add(new Place("Nagyi Palacsintázója", "The most authentic pancake bars of Budapest established more than 20 years ago.", "http://nagyipali.hu/", R.drawable.eat_nagyi_palacsintazoja));
        places.add(new Place("Café Gerbeaud", "Tradition and Innovation.", "http://www.gerbeaud.hu/", R.drawable.eat_gerbeaud_cukraszda));
        places.add(new Place("Amber's", "French Bakery & Cafe", "https://ambers.hu/", R.drawable.eat_ambers));
        places.add(new Place("Fruccola", "Nice to sweet you.", "http://fruccola.hu/", R.drawable.eat_fruccola));
        places.add(new Place("Book Café - Lotz Hall", "Opened on March 3, 1911, which was Paris Department Store, Budapest's first building.", "http://www.lotzterem.hu/", R.drawable.eat_book_cafe));
        places.add(new Place("New York Café", "Built in eclectic Italian Renaissance-style and opened on October 23rd 1894.", "http://www.newyorkcafe.hu/", R.drawable.eat_new_york_cafe));

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
