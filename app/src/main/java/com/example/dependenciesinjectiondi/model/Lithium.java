package com.example.dependenciesinjectiondi.model;

import static com.example.dependenciesinjectiondi.constants.Constant.MY_TAG;

import android.util.Log;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */
public class Lithium {

    //Assume that Yea hamari class nahe ha built in class ha like Retrofit jis ko hum change nahe kar sakta
    // So is ka uper @Inject use nahe karsatay
    public Lithium() {
        Log.i(MY_TAG, "Lithium Constructor Call: ");
    }

    public void done()
    {
        Log.i(MY_TAG, "Done Call: ");
    }
}
