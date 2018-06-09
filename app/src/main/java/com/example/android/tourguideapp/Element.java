package com.example.android.tourguideapp;

import android.media.Image;

public class Element {

    private String mElementType = "";
    private String mElementTitle = "";
    private String mElementBody = "";
    private String mPriceLevel = "";
    private int mStarNumber = 0;

    private String mWebAddress = "";

    private Location mLocation;

    private String mPhoneNumber = "";

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location getmLocation() {
        return mLocation;
    }

    public int getmStarNumber() {
        return mStarNumber;
    }

    public void setmStarNumber(int mStarNumber) {
        this.mStarNumber = mStarNumber;
    }

    public String getmPriceLevel() {
        return mPriceLevel;
    }

    public void setmPriceLevel(String priceLevel) {
        this.mPriceLevel = priceLevel;
    }


    // Constructor for Restaurants and Hotels
    public Element(String mElementType, String mElementTitle, String mElementBody, int mImageResourceId, String mWebAddress, Location mLocation, String mPhoneNumber, String mPriceLevel, int mStarNumber) {
        this.mElementType = mElementType;
        this.mElementTitle = mElementTitle;
        this.mElementBody = mElementBody;
        this.mImageResourceId = mImageResourceId;
        this.mWebAddress = mWebAddress;
        this.mLocation = mLocation;
        this.mPhoneNumber = mPhoneNumber;
        this.mPriceLevel = mPriceLevel;
        this.mStarNumber = mStarNumber;
    }


    public String getmWebAddress() {
        return mWebAddress;
    }

    public String getmElementType() {
        return mElementType;
    }

    public String getmElementTitle() {
        return mElementTitle;
    }

    public String getmElementBody() {
        return mElementBody;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        if (mImageResourceId != -1) {
            return true;
        } else return false;
    }

}
