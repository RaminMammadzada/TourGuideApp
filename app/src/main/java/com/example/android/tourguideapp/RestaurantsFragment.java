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
        View rootView = inflater.inflate( R.layout.element_list, container, false );


        // load the restraurant array
        ArrayList<Element> restaurants = new ArrayList<Element>();
        restaurants = loadRestaurants();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), restaurants );

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

    private ArrayList<Element> loadRestaurants() {
        final ArrayList<Element> restaurants = new ArrayList<Element>();
        Location location1 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Fatih), getString( R.string.Iskenderpasa_mah), getString( R.string.SImitci_saki_sok), 16, 1, 34080 );
        restaurants.add( new Element( getString( R.string.Restaurant), getString( R.string.Cigeristan), getString( R.string.cigeristan_about), R.drawable.cigeristan, getString( R.string.cigeristan_website), location1, getString( R.string.cigeristan_phone_num), getString( R.string.cigeristan_price), 0 ) );

        Location location2 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Beyoglu), getString( R.string.Cihangir), getString( R.string.Aga_cami_atif_yilmaz), 9, 1, 34071 );
        restaurants.add( new Element( getString( R.string.Restaurant ), getString( R.string.Haci_abdullah_lokantasi), getString( R.string.haci_abdullah_lokantasi_about), R.drawable.haci_abdullah_lokantasi, getString( R.string.haci_abdullah_lokantasi_website), location2, getString( R.string.haci_abdullah_lokantasi_phone_num), getString( R.string.haci_abdullah_lokantasi_price), 0 ) );

        Location location3 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Fatih), getString( R.string.iskenderpasa_mah), getString( R.string.simit_sakir_sokak), 16, 1, 34080 );
        restaurants.add( new Element( getString( R.string.Restaurant), getString( R.string.azci), getString( R.string.azci_about), R.drawable.azci, "", location3, getString( R.string.azci_phone_num), getString( R.string.azci_price), 0 ) );

        Location location4 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Beyoglu), getString( R.string.Cihangir), getString( R.string.Aga_cami_atif_yilmaz), 9, 1, 34071 );
        restaurants.add( new Element( getString( R.string.Restaurant), getString( R.string.ramiz_kofte), getString( R.string.ramiz_kofte_about), R.drawable.ramiz_kofte, getString( R.string.ramiz_kofte_website), location4, getString( R.string.ramiz_kofte_phone_num), getString( R.string.ramiz_kofte_price), 0 ) );

        return restaurants;
    }

}
