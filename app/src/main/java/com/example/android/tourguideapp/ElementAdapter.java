package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 24-06-2016.
 */
public class ElementAdapter extends ArrayAdapter<Element> {

    public ElementAdapter(Activity context, ArrayList<Element> elements) {
        super(context, 0, elements);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Element element_item = getItem(position);



        if(element_item.getmElementTitle() != "") {
            //find the textview in list_item with id default_text_view
            TextView elementTitle = (TextView) listItemView.findViewById( R.id.element_title );
            //gets the default Translation and set it to the text of this textView
            elementTitle.setText( element_item.getmElementTitle() );
        }

        if(element_item.getmElementType() !="") {
            //find the textview in list_item with id default_text_view
            TextView elementType = (TextView) listItemView.findViewById( R.id.element_type );
            //gets the default Translation and set it to the text of this textView
            elementType.setText( element_item.getmElementType() );
        }

        // price level of the restaurant and hotels
        TextView element_price_tv = (TextView) listItemView.findViewById( R.id.price_text_view );
        TextView elementPriceLevel = (TextView) listItemView.findViewById( R.id.price_level );
        if(element_item.getmElementType() == "Restaurant" || element_item.getmElementType() == "Hotel" ) {
            element_price_tv.setText( R.string.price_text );
            elementPriceLevel.setText( element_item.getmPriceLevel() );
        } else {
            element_price_tv.setVisibility( View.GONE );
            elementPriceLevel.setVisibility( View.GONE );
        }


        // star level of hotels
        TextView element_star_tv = (TextView) listItemView.findViewById( R.id.star_text_view );
        TextView elementStarLevel = (TextView) listItemView.findViewById( R.id.star_level );
        if( element_item.getmElementType() == "Hotel" ) {
            element_star_tv.setText( R.string.star_text );
            elementStarLevel.setText( String.valueOf( element_item.getmStarNumber() ) );
        } else {
            element_star_tv.setVisibility( View.GONE );
            elementStarLevel.setVisibility( View.GONE );
        }


        if(element_item.getmElementBody() !="") {
            //find the textview in list_item with id miwok_text_view
            TextView elementBody = (TextView) listItemView.findViewById( R.id.element_body );
            //gets the miwok Translation and set it to the text of this textView
            elementBody.setText( element_item.getmElementBody() );
        }


        //find the image view with id image
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if(element_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(element_item.getmImageResourceId());

            //make the image view visible
            mImageView.setVisibility( View.VISIBLE);
        }
        else {
            mImageView.setVisibility( View.GONE);
        }


        if( element_item.getmLocation().getFullLocation() != null){
            TextView element_location_tv = (TextView) listItemView.findViewById( R.id.location_text_view );
            element_location_tv.setText( R.string.location_text );

            TextView element_location = (TextView) listItemView.findViewById( R.id.location );
            element_location.setText( element_item.getmLocation().getFullLocation() );
        }

        if( element_item.getmWebAddress() != ""){
            TextView element_website_tv = (TextView) listItemView.findViewById( R.id.website_text_view );
            element_website_tv.setText( R.string.website_text );

            TextView element_website = (TextView) listItemView.findViewById( R.id.website );
            element_website.setText( element_item.getmWebAddress());
        }

        return listItemView;
    }
}
