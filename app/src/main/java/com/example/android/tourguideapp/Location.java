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

    public String getmCountry() {

        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmDistrict() {
        return mDistrict;
    }

    public void setmDistrict(String mDistrict) {
        this.mDistrict = mDistrict;
    }

    public String getmArea() {
        return mArea;
    }

    public void setmArea(String mArea) {
        this.mArea = mArea;
    }

    public String getmStreet() {
        return mStreet;
    }

    public void setmStreet(String mStreet) {
        this.mStreet = mStreet;
    }

    public int getmBuildingNumber() {
        return mBuildingNumber;
    }

    public void setmBuildingNumber(int mBuildingNumber) {
        this.mBuildingNumber = mBuildingNumber;
    }

    public int getmFlatNumber() {
        return mFlatNumber;
    }

    public void setmFlatNumber(int mFlatNumber) {
        this.mFlatNumber = mFlatNumber;
    }

    public int getmPostCode() {
        return mPostCode;
    }

    public void setmPostCode(int mPostCode) {
        this.mPostCode = mPostCode;
    }

    public String getFullLocation(){
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
