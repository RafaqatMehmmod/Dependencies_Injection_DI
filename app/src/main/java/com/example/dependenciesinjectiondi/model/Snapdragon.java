package com.example.dependenciesinjectiondi.model;

import static com.example.dependenciesinjectiondi.constants.Constant.MY_TAG;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */
public class Snapdragon implements Processor{
    @Inject
    public Snapdragon() {
        Log.i(MY_TAG, "Snap Dragon Call Const: ");
    }

    @Override
    public void start() {
        Log.i(MY_TAG, "Snap Dragon Start: ");
    }
}
