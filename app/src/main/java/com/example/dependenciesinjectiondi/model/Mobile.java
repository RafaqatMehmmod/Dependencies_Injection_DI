package com.example.dependenciesinjectiondi.model;

import static com.example.dependenciesinjectiondi.constants.Constant.MY_TAG;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */
public class Mobile {

    //This Code is Issue because
    // 1. Break the Single Responsibility Principle because one class only perform single task
    // 2. Unit Testing nahe ho saktee q ka Mobile ka lea hum bound ho gaya ha hir bar new object create karna ka lea
    private Battery battery;
    private Processor processor;
//    public Mobile() {
//        this.battery=new Battery();
//        this.processor=new Processor();
//    }

    //.....Solution is that Using Dependencies Injection
    // 1. Manual Injection And Automatic Injection using dagger

    //  Constructor Injection Manually
//    public Mobile(Battery battery,Processor processor) {
//        this.battery=battery;
//        this.processor=processor;
//    }

    // Constructor Injection Using Dagger
    // Notes: Multiple Constructor Inject Nahe Hota Sirf ek constructor he inject hota ha
    @Inject
    public Mobile(Battery battery,Processor processor) {
        this.battery=battery;
        this.processor=processor;
        Log.i(MY_TAG, "Mobile Constructor Call: ");
    }

    //Ab Dagger ko still nahe pata Mobile ka lea kis ka object create karna us ka fir hum batter ka constructor
    // bana ka us ka uper inject use kara gay


    public void run()
    {
        Log.i(MY_TAG, "Mobile Run Call: ");
    }

    //Method Injection
//    @Inject
//    public void connectCharger(Charger charger)
//    {
//        charger.setCharger(this);
//    }
}
