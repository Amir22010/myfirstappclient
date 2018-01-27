package com.example.amirclient.myfirstappclient;

/**
 * Created by Amir on 26-01-2018.
 */

import com.google.firebase.analytics.FirebaseAnalytics;

public class GoogleMainApplication extends MainApplication {

    private FirebaseAnalytics mfirebaseAnalytics;

    @Override
    public void onCreate() {
        super.onCreate();
        mfirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

}