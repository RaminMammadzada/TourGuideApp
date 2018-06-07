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
public class BazaarsFragment extends Fragment {


    public BazaarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.element_list, container, false );

        // load the restraurant array
        ArrayList<Element> bazaars = new ArrayList<Element>(  );
        bazaars = loadBazaars();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), bazaars);

        // finding the listView and setting the adapter to it
        findListViewSetAdapter(rootView, itemAdapter);

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

    private ArrayList<Element> loadBazaars() {

        final ArrayList<Element> bazaars = new ArrayList<Element>(  );

        Location location1 = new Location("Turkey", "Istanbul", "Fatih", "Beyazit Mahallesi", "",50, 1, 34367);
        bazaars.add( new Element("Bazaar", "Grand Bazaar", "One of the most historical marketplace all over the world. It has been working for more than 500 years.", R.drawable.grand_bazaar,"www.kapalicarsi.com.tr", location1, "(0212) 315 60 00", "$$$", 6) );


        Location location2 = new Location("Turkey", "Istanbul", "Beyoglu", "Kocatepe Mahallesi", " Abdülhak Hamit Cd. ",42, 1, 34437);
        bazaars.add( new Element("Bazaar", "Eguaptian Bazaar", "It is clear that this bazaar includes all of the natural food and spices in Turkey.", R.drawable.eguptian_bazaar,"www.misircarsisi.org.tr", location2, "(0212) 235 81 60", "$", 5) );

        Location location3 = new Location("Turkey", "Istanbul", "Fatih", "Iskenderpasa mahallesi", "Simitci Sakir Sokak",16, 1, 34080);
        bazaars.add( new Element("Bazaar", "Pelican Mall", "One of the mostly visited mall in Istanbul", R.drawable.pelican_mall,"www.pelicanmall.com.tr", location3, "0534 057 51 51", "$$$$$", 4) );


        Location location4 = new Location("Turkey", "Istanbul", "Beyoglu", "Cihangir", "Ağa Camii Atıf Yılmaz Caddesi",9, 1, 34071);
        bazaars.add( new Element("Bazaar", "Cevahir Mall", "Great place to hangout directly in the middle of Istanbul", R.drawable.cevahir_mall,"www.istanbulcevahir.com", location4, "0534 057 51 51", "$$$", 3) );


        return bazaars;

    }

}
