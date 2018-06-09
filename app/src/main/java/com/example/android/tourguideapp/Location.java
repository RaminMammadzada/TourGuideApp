package com.example.android.tourguideapp;

public class Location {

    public Location(String mCountry, String mCity, String mDistrict, String mArea, String mStreet, int mBuildingNumber, int mFlatNumber, int mPostCode) {
        this.mCountry = mCountry;
        this.mCity = mCity;
        this.mDistrict = mDistrict;
        this.mArea = mArea;
        this.mStreet = mStreet;
        this.mBuildingNumber = mBuildingNumber;
        this.mFlatNumber = mFlatNumber;
        this.mPostCode = mPostCode;
    }

    public String getFullLocation() {
        return "" + mDistrict + ", " + mArea + ", " + mStreet + ", No: " + mBuildingNumber + "/" + mFlatNumber + ", " + mCity + "" + mCountry + " " + mPostCode;
    }

    private String mCountry;
    private String mCity;
    private String mDistrict;
    private String mArea;
    private String mStreet;
    private int mBuildingNumber;
    private int mFlatNumber;
    private int mPostCode;

}
