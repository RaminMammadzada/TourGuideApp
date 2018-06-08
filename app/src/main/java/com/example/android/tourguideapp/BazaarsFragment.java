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
        ArrayList<Element> bazaars = new ArrayList<Element>();
        bazaars = loadBazaars();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), bazaars );

        // finding the listView and setting the adapter to it
        findListViewSetAdapter( rootView, itemAdapter );

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

    private ArrayList<Element> loadBazaars() {

        final ArrayList<Element> bazaars = new ArrayList<Element>();

        Location location1 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Fatih ), getString( R.string.Beyazit_mah), "", 50, 1, 34367 );
        bazaars.add( new Element( getString( R.string.Bazaar), getString( R.string.Grand_bazaar), getString( R.string.Grand_bazaar_about), R.drawable.grand_bazaar, getString( R.string.Grand_bazaar_website), location1, getString( R.string.Grand_bazaar_phone_num), "", 6 ) );

        Location location2 = new Location( getString( R.string.Turkey ),getString( R.string.Istanbul ), getString( R.string.Beyoglu ), getString( R.string.Kocatepe_mah ), getString( R.string.abdulhak_hamit_cad ), 42, 1, 34437 );
        bazaars.add( new Element( getString( R.string.Bazaar), getString( R.string.Egyptian_bazaar), getString( R.string.Egyptian_bazaar_about), R.drawable.eguptian_bazaar, getString( R.string.Eyptian_bazaar_website), location2, getString( R.string.Egytian_bazaar_phone_num), "", 5 ) );

        Location location3 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Fatih ), getString( R.string.iskenderpasa_mahallesi ), getString( R.string.simit_sakir_sokak ), 16, 1, 34080 );
        bazaars.add( new Element( getString( R.string.Bazaar), getString( R.string.Pelican_mall), getString( R.string.Pelican_mall_about), R.drawable.pelican_mall, getString( R.string.Pelican_mall_website), location3, getString( R.string.Pelican_mall_phone_num), "", 4 ) );

        Location location4 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul ), getString( R.string.Beyoglu ), getString( R.string.Cihangir ), getString( R.string.Aga_cami_atif_yilmaz_cad ), 9, 1, 34071 );
        bazaars.add( new Element( getString( R.string.Bazaar), getString( R.string.Cevahir_mall), getString( R.string.Cevahir_mall_about), R.drawable.cevahir_mall, getString( R.string.Cevahir_mall_website), location4, getString( R.string.Cevahir_mall_phone_num), "", 3 ) );

        return bazaars;
    }

}
