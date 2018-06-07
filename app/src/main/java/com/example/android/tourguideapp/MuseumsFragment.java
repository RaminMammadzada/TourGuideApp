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
        ArrayList<Element> museums = new ArrayList<Element>(  );
        museums = loadMuseums();

        // set up the array adapter
        ElementAdapter itemAdapter = new ElementAdapter( getActivity(), museums);

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

    private ArrayList<Element> loadMuseums() {

        final ArrayList<Element> museums = new ArrayList<Element>(  );

        Location location1 = new Location("Turkey", "Istanbul", "Fatih", "Cankurtaran Mahallesi", "",28, 1, 34122);
        museums.add( new Element("Museum", "Topkapi Palace", "After the conquest of Istanbul by Mehmed the Conqueror at 1453, construction of the Topkapı Palace was started at the year 1460 and completed at 1478 . Palace was built upon a 700.000 squaremeters area on an Eastern Roman Acropolis located at the Istanbul Peninsula between Sea of Marmara, Bosphorus and the Golden Horn. Topkapı Palace, was the administrative, educational and art center of the Empire for nearly four hundred years since Mehmed the Conqueror until Sultan Abdulmecid who is the thirty-first Sultan. Although Palace was abandoned by the Ottoman Dynasty by moving to the Dolmabahçe Palace at middle 19th century, Topkapı Palace was protected its importance everytime.", R.drawable.topkapi,"www.topkapisarayi.gov.tr/en", location1, "(0212) 315 60 00", "$$$", 6) );


        Location location2 = new Location("Turkey", "Istanbul", "Beyoglu", "Kocatepe Mahallesi", " Abdülhak Hamit Cd. ",42, 1, 34437);
        museums.add( new Element("Museum", "Hagia Sophia Museum ", "From the date of its construction in 537 AD until 1453, it served as an Eastern Orthodox cathedral and the seat of the Patriarch of Constantinople,[1] except between 1204 and 1261, when it was converted by the Fourth Crusaders to a Roman Catholic cathedral under the Latin Empire. The building was later converted into an Ottoman mosque from 29 May 1453 until 1931. It was then secularized and opened as a museum on 1 February 1935.[2] Famous in particular for its massive dome, it is considered the epitome of Byzantine architecture[3] and is said to have changed the history of architecture.[4] It remained the world's largest cathedral for nearly a thousand years, until Seville Cathedral was completed in 1520.", R.drawable.hagia_sophia,"www.ayasofyamuzesi.gov.tr", location2, "(0212) 235 81 60", "$", 5) );

        Location location3 = new Location("Turkey", "Istanbul", "Fatih", "Iskenderpasa mahallesi", "Simitci Sakir Sokak",16, 1, 34080);
        museums.add( new Element("Museum", "Basilica Cistern", "is the largest of several hundred ancient cisterns that lie beneath the city of Istanbul (formerly Constantinople), Turkey. The cistern, located 150 metres (490 ft) southwest of the Hagia Sophia on the historical peninsula of Sarayburnu, was built in the 6th century during the reign of Byzantine Emperor Justinian I.[1]", R.drawable.basilica_cistern,"no website", location3, "0534 057 51 51", "$$$$$", 4) );


        Location location4 = new Location("Turkey", "Istanbul", "Beyoglu", "Cihangir", "Ağa Camii Atıf Yılmaz Caddesi",9, 1, 34071);
        museums.add( new Element("Museum", "Blue Mosque", "The Blue Mosque (Called Sultanahmet Camii in Turkish) is an historical mosque in Istanbul. The mosque is known as the Blue Mosque because of blue tiles surrounding the walls of interior design.Mosque was built between 1609 and 1616 years, during the rule of Ahmed I. ", R.drawable.blue_mosque,"www.bluemosque.co", location4, "0534 057 51 51", "$$$", 3) );


        return museums;

    }



}
