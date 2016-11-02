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
        places.add(new Place("Arena Plaza","shopping plaza","http://www.arenaplaza.hu/en/", 0));
        places.add(new Place("Váci Street","tourist central","https://en.wikipedia.org/wiki/V%C3%A1ci_Street", 0));
        places.add(new Place("Andrássy út","shopping street","https://en.wikipedia.org/wiki/Andr%C3%A1ssy_%C3%BAt", 0));
        places.add(new Place("Hecserli","food","http://www.hecserli.hu/", 0));
        places.add(new Place("Herend Porcelain Manufactory","porcelain","https://en.wikipedia.org/wiki/Herend_Porcelain_Manufactoryh", 0));
        places.add(new Place("Memories of Hungary","arts & crafts","http://memoriesofhungary.hu/en/", 0));
        places.add(new Place("Rózsavölgyi Csokoládé","chocolate","http://www.rozsavolgyi.com/en/index.php", 0));
        places.add(new Place("Vass Shoes","shoes","http://www.vass-shoes.com/", 0));
        places.add(new Place("Bortársaság","wine","http://www.bortarsasag.hu/en/", 0));
        places.add(new Place("BÁV ","antiques","http://www.bav.hu/en/", 0));

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
