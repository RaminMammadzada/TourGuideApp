package com.example.android.tourguideapp;


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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.element_list, container, false);


        // load the restraurant array
        ArrayList<Element> hotels = new ArrayList<Element>(  );
        hotels = loadHotels();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), hotels );

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

    private ArrayList<Element> loadHotels() {
        final ArrayList<Element> hotels = new ArrayList<Element>(  );

        Location location1 = new Location("Turkey", "Istanbul", "Sisli", "Harbiye Mahallesi", "Cumhuriyet Cd",50, 1, 34367);
        hotels.add( new Element("Hotel", "Hilton Hotel Bosphorus", "Life in the heart of Istanbul", R.drawable.hilton,"www.cigeristan.com.tr", location1, "(0212) 315 60 00", "$$$", 6) );


        Location location2 = new Location("Turkey", "Istanbul", "Beyoglu", "Kocatepe Mahallesi", " Abdülhak Hamit Cd. ",42, 1, 34437);
        hotels.add( new Element("Hotel", "Avantgarde Taksim Hotel", "Great Boutic Hotel ", R.drawable.avantgarde,"www.cigeristan.com.tr", location2, "(0212) 235 81 60", "$", 5) );

        Location location3 = new Location("Turkey", "Istanbul", "Fatih", "Iskenderpasa mahallesi", "Simitci Sakir Sokak",16, 1, 34080);
        hotels.add( new Element("Hotel", "Elmali Hotel", "Hotel in the green wood.", R.drawable.elmali,"www.cigeristan.com.tr", location3, "0534 057 51 51", "$$$$$", 4) );


        Location location4 = new Location("Turkey", "Istanbul", "Beyoglu", "Cihangir", "Ağa Camii Atıf Yılmaz Caddesi",9, 1, 34071);
        hotels.add( new Element("Hotel", "Double Tree Hotel", "Great luxurious hotel ", R.drawable.doubletree,"www.cigeristan.com.tr", location4, "0534 057 51 51", "$$$", 3) );


        return hotels;
    }



}
