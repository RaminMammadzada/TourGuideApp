package com.example.android.tourguideapp;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.element_list, container, false);


        // load the restraurant array
        ArrayList<Element> restaurants = new ArrayList<Element>(  );
        restaurants = loadRestaurants();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), restaurants );

        // finding the listView and setting the adapter to it
        findListViewSetAdapter(rootView, itemAdapter);

/*        TextView textView = new TextView( getActivity() );
        textView.setText( "Restaurants" );
        textView.setTextSize( 20 );
        return textView;*/


        return rootView;


    }

    private void findListViewSetAdapter(View rootView, ElementAdapter itemsAdapter) {
        // finding the listView and setting the adapter to it
        final ListView listView = (ListView)rootView.findViewById(R.id.element_list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });
    }

    private ArrayList<Element> loadRestaurants() {
        final ArrayList<Element> restaurants = new ArrayList<Element>(  );
        Location location1 = new Location("Turkey", "Istanbul", "Fatih", "Iskenderpasa mahallesi", "Simitci Sakir Sokak",16, 1, 34080);
        restaurants.add( new Element("Restaurant", "Cigeristan", "You can eat lung kebab in that restaurant. The taste is the best in Istanbul in that kebab I can say.", R.drawable.cigeristan,"www.cigeristan.com.tr", location1, "0534 057 51 51", "$$$", 0) );


        Location location2 = new Location("Turkey", "Istanbul", "Beyoglu", "Cihangir", "Ağa Camii Atıf Yılmaz Caddesi",9, 1, 34071);
        restaurants.add( new Element("Restaurant", "Haci Abdullah Lokantasi", "Historical restraunt serves you the best delicious of Ottoman culture since 1888. ", R.drawable.haci_abdullah_lokantasi,"www.hacibdullah.com.tr", location2, "0534 057 51 51", "$$$", 0) );


        Location location3 = new Location("Turkey", "Istanbul", "Fatih", "Iskenderpasa mahallesi", "Simitci Sakir Sokak",16, 1, 34080);
        restaurants.add( new Element("Restaurant", "Azci", "Perfect Turkish fast food restaurant", R.drawable.azci,"", location3, "0534 057 51 51", "$$$", 0) );


        Location location4 = new Location("Turkey", "Istanbul", "Beyoglu", "Cihangir", "Ağa Camii Atıf Yılmaz Caddesi",9, 1, 34071);
        restaurants.add( new Element("Restaurant", "Ramiz Kofte", "The meats are really delicious.", R.drawable.ramiz_kofte,"www.ramizkofte.com.tr", location4, "0534 057 51 51", "$$$", 0) );


        return restaurants;
    }


}
