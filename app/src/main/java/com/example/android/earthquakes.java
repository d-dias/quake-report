package com.example.android.quakereport;

/**
 * Created by DILKI DIAS on 13-Mar-17.
 */

public class earthquakes {

    private double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public earthquakes(double vMagnitude, String vLocation, Long vTimeInMilliseconds, String vUrl) {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTimeInMilliseconds = vTimeInMilliseconds;
        mUrl = vUrl;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
