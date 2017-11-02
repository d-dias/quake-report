package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

/**
 * Created by DILKI DIAS on 15-Mar-17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<earthquakes>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;

        // TODO: Finish implementing this constructor

    }

    @Override
    protected void onStartLoading() {
        forceLoad();

    }

    @Override
    public List<earthquakes> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<earthquakes> earthquake = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquake;

    }
}
