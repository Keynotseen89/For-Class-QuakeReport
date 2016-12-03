package com.example.android.quakereport;

/**
 * Created by kench on 12/2/2016.
 * A class that gets objects containing information about Earthquake
 */

public class Earthquake {

    //The magnitude of the Earthquake
    private String mMagnitude;

    //Location of the Earthquake
    private String mLocatoin;

    //The date of the Earthquake
    private String mDate;

    /**
     * Create/ construct a new {@link Earthquake} object.
     *
     * @param magnitude is the size of the earthquake
     * @param location is the location of the earthquake/magnitude
     * @param date is the Date that the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocatoin = location;
        mDate = date;
    }

    /**
     * Returns magnitude of Earthquake
     */
    public String getMagnitude(){
        return mMagnitude;
    }

    /**
     * Returns location of Earthquake
     */
    public String getLocatoin(){
        return mLocatoin;
    }

    /**
     * Returns the Date that the Earthquake
     * happened
     */
    public String getDate(){
        return mDate;
    }

}
