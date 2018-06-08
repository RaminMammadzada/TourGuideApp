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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.element_list, container, false );

        // load the restraurant array
        ArrayList<Element> museums = new ArrayList<Element>();
        museums = loadMuseums();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), museums );

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

    private ArrayList<Element> loadMuseums() {

        final ArrayList<Element> museums = new ArrayList<Element>();

        Location location1 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Fatih ), getString( R.string.cankurtaran_mah), "", 28, 1, 34122 );
        museums.add( new Element( getString( R.string.Museum), getString( R.string.Topkapi_palace), getString( R.string.Topkapi_palace_about), R.drawable.topkapi, getString( R.string.topkapi_palace_website), location1, getString( R.string.topkapi_palace_phone_num), "", 6 ) );

        Location location2 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Beyoglu ), getString( R.string.Kocatepe_mah), getString( R.string.abdulhak_hamit_cad), 42, 1, 34437 );
        museums.add( new Element( getString( R.string.Museum), getString( R.string.Hagia_sophia_museum), getString( R.string.hagia_sophia_about), R.drawable.hagia_sophia, getString( R.string.hagia_sophia_website), location2, getString( R.string.hagia_sophia_phone_num), "", 5 ) );

        Location location3 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Fatih ), getString( R.string.iskenderpasa_mahallesi), getString( R.string.simit_sakir_sokak ), 16, 1, 34080 );
        museums.add( new Element( getString( R.string.Museum), getString( R.string.Basilica_cistern), getString( R.string.basilica_cistern_about), R.drawable.basilica_cistern, getString( R.string.basilica_cistern_website), location3, getString( R.string.basilica_cistern_phone_num), "", 4 ) );

        Location location4 = new Location( getString( R.string.Turkey ), getString( R.string.Istanbul), getString( R.string.Beyoglu ), getString( R.string.Cihangir ), getString( R.string.Aga_cami_atif_yilmaz_cad), 9, 1, 34071 );
        museums.add( new Element( getString( R.string.Museum), getString( R.string.Blue_mosque), getString( R.string.blue_mosque_about), R.drawable.blue_mosque, getString( R.string.blue_mosque_website), location4, getString( R.string.blue_mosque_phone_num), "", 3 ) );

        return museums;
    }

}
