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
public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Terminal Market","Authentic wines from the hearth of Europe.","http://terminalrestaurant.hu/", R.drawable.shop_terminal_market));
        places.add(new Place("Café Gerbeaud","You can choose from an extensive range of beautifully and exquisitely packaged chocolate.","http://www.gerbeaud.hu/", R.drawable.shop_gerbeaud_cukraszda));
        places.add(new Place("Book Café - Lotz Hall","Not only bookstores, multi-purpose cultural center as well.","http://www.lotzterem.hu/", R.drawable.shop_book_store));
        places.add(new Place("Arena Plaza","Great Entertainment.","http://www.arenaplaza.hu/", R.drawable.shop_plaza_arena));
        places.add(new Place("Váci Street","Main Shopping Street","https://en.wikipedia.org/wiki/V%C3%A1ci_Street", R.drawable.shop_vaci_street));
        places.add(new Place("Andrássy út","Main Shopping Street","https://en.wikipedia.org/wiki/Andr%C3%A1ssy_%C3%BAt", R.drawable.shop_andrassy_ut));
        places.add(new Place("Herend Porcelain Manufactory","Beauty to be treatured for ever.","http://herend.com/", R.drawable.shop_herend_porcelain_manufactory));
        places.add(new Place("Memories of Hungary","arts & crafts","http://memoriesofhungary.hu/en/", 0));
        places.add(new Place("Rózsavölgyi Csokoládé","chocolate","http://www.rozsavolgyi.com/en/index.php", 0));
        places.add(new Place("Vass Shoes","shoes","http://www.vass-shoes.com/", 0));
        places.add(new Place("Bortársaság","wine","http://www.bortarsasag.hu/en/", 0));
        places.add(new Place("BÁV","antiques","http://www.bav.hu/en/", 0));
        places.add(new Place("CBA","Supermarket","http://www.cba.hu/", R.drawable.shop_cba));
        places.add(new Place("Premier Outlets","30-70% off normal retail price everyday!","http://premieroutlet.hu/", R.drawable.shop_outlet));


        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_shop);

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
