package com.example.dependenciesinjectiondi.model;

import static com.example.dependenciesinjectiondi.constants.Constant.MY_TAG;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */
public class Battery {

//    @Inject
//    public Battery() {
//        Log.i(MY_TAG, "Battery Constructor Call: ");
//    }

    //Assume that Yea hamari class nahe ha built in class ha like Retrofit jis ko hum change nahe kar sakta
    // So is ka uper @Inject use nahe karsatay

    private Lithium lithium;
    private Cobalt cobalt;

    public Battery(Lithium lithium,Cobalt cobalt) {
        this.lithium=lithium;
        this.cobalt=cobalt;
        Log.i(MY_TAG, "Battery Constructor Call: ");
    }
}
