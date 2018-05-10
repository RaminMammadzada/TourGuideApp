package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourStarPlusHotelsFragment extends Fragment {


    public FourStarPlusHotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView( getActivity() );
        textView.setText( "FourStarPlusHotels" );
        textView.setTextSize( 20 );
        return textView;
    }



}
