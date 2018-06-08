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
        View rootView = inflater.inflate( R.layout.element_list, container, false );


        // load the restraurant array
        ArrayList<Element> hotels = new ArrayList<Element>();
        hotels = loadHotels();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), hotels );

        // finding the listView and setting the adapter to it
        findListViewSetAdapter( rootView, itemAdapter );

/*        TextView textView = new TextView( getActivity() );
        textView.setText( "Restaurants" );
        textView.setTextSize( 20 );
        return textView;*/


        return rootView;


    }

    private void findListViewSetAdapter(View rootView, ElementAdapter itemsAdapter) {
        // finding the listView and setting the adapter to it
        final ListView listView = (ListView) rootView.findViewById( R.id.element_list );
        listView.setAdapter( itemsAdapter );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        } );
    }

    private ArrayList<Element> loadHotels() {
        final ArrayList<Element> hotels = new ArrayList<Element>();

        Location location1 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Sisli), getString( R.string.Hariye_mahallesi), getString( R.string.Cumhiriyyet_cad), 50, 1, 34367 );
        hotels.add( new Element( getString( R.string.Hotel), getString( R.string.Hilton_hotel), getString( R.string.Hilton_hotel_about), R.drawable.hilton, getString( R.string.Hilton_hotel_website), location1, getString( R.string.Hilton_hotel_phone_num), getString( R.string.Hilton_hotel_price), 6 ) );

        Location location2 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Beyoglu ), getString( R.string.Kocatepe_mah ), getString( R.string.abdulhak_hamit_cad ), 42, 1, 34437 );
        hotels.add( new Element( getString( R.string.Hotel), getString( R.string.Avantgarde_taksim_hotel), getString( R.string.Avantgarde_taksim_hotel_abot), R.drawable.avantgarde, getString( R.string.Avantgarde_hotel_website), location2, getString( R.string.Avantgrade_hotel_phone_num), getString( R.string.Avantgrade_hotel_price), 5 ) );

        Location location3 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Fatih ), getString( R.string.iskenderpasa_mahallesi ), getString( R.string.simit_sakir_sokak ), 16, 1, 34080 );
        hotels.add( new Element( getString( R.string.Hotel), getString( R.string.Elmali_hotel), getString( R.string.Elmali_hotel_about), R.drawable.elmali, "", location3, getString( R.string.Elmali_hotel_phone_num), getString( R.string.Elmali_hotel_price), 4 ) );

        Location location4 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Beyoglu ), getString( R.string.Cihangir ), getString( R.string.Aga_cami_atif_yilmaz_cad ), 9, 1, 34071 );
        hotels.add( new Element( getString( R.string.Hotel), getString( R.string.Double_tree_hotel), getString( R.string.Double_tree_hotel_about), R.drawable.doubletree, getString( R.string.Double_tree_hotel_website), location4, getString( R.string.Double_tree_hotel_phone_num), getString( R.string.Double_tree_hotel_price), 3 ) );

        return hotels;
    }

}
