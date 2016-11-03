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

        places.add(new Place(R.string.eat_name_comme_chez_soi, R.string.eat_sd_comme_chez_soi, R.string.eat_web_comme_chez_soi, R.drawable.eat_comme_chez_soi));
        places.add(new Place(R.string.eat_name_vintage_garden, R.string.eat_sd_vintage_garden, R.string.eat_web_vintage_garden, R.drawable.eat_vintage_garden));
        places.add(new Place(R.string.eat_name_meat_boutique, R.string.eat_sd_meat_boutique, R.string.eat_web_meat_boutique, R.drawable.eat_meat_boutique));
        places.add(new Place(R.string.eat_name_kiosk, R.string.eat_sd_kiosk, R.string.eat_web_kiosk, R.drawable.eat_kiosk));
        places.add(new Place(R.string.eat_name_tuning_bar_burger, R.string.eat_sd_tuning_bar_burger, R.string.eat_web_tuning_bar_burger, R.drawable.eat_tuning_bar_burger));
        places.add(new Place(R.string.eat_name_terminal, R.string.eat_sd_terminal, R.string.eat_web_terminal, R.drawable.eat_terminal));
        places.add(new Place(R.string.eat_name_pastrami, R.string.eat_sd_pastrami, R.string.eat_web_pastrami, R.drawable.eat_pastrami));
        places.add(new Place(R.string.eat_name_paprika_vendeglo, R.string.eat_sd_paprika_vendeglo, R.string.eat_web_paprika_vendeglo, R.drawable.eat_paprika_vendeglo));
        places.add(new Place(R.string.eat_name_menza, R.string.eat_sd_menza, R.string.eat_web_menza, R.drawable.eat_menza));
        places.add(new Place(R.string.eat_name_kfc, R.string.eat_sd_kfc, R.string.eat_web_kfc, R.drawable.eat_kfc));
        places.add(new Place(R.string.eat_name_nagyi_palacsintazoja, R.string.eat_sd_nagyi_palacsintazoja, R.string.eat_web_nagyi_palacsintazoja, R.drawable.eat_nagyi_palacsintazoja));
        places.add(new Place(R.string.eat_name_cafe_gerbeaud, R.string.eat_sd_cafe_gerbeaud, R.string.eat_web_cafe_gerbeaud, R.drawable.eat_gerbeaud_cukraszda));
        places.add(new Place(R.string.eat_name_ambers, R.string.eat_sd_ambers, R.string.eat_web_ambers, R.drawable.eat_ambers));
        places.add(new Place(R.string.eat_name_fruccola, R.string.eat_sd_fruccola, R.string.eat_web_fruccola, R.drawable.eat_fruccola));
        places.add(new Place(R.string.eat_name_book_cafe_lotz_hall, R.string.eat_sd_book_cafe_lotz_hall, R.string.eat_web_book_cafe_lotz_hall, R.drawable.eat_book_cafe));
        places.add(new Place(R.string.eat_name_new_york_cafe, R.string.eat_sd_new_york_cafe, R.string.eat_web_new_york_cafe, R.drawable.eat_new_york_cafe));

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
