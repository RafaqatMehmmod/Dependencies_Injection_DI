package com.example.dependenciesinjectiondi.component;

import com.example.dependenciesinjectiondi.MainActivity;
import com.example.dependenciesinjectiondi.model.Mobile;
import com.example.dependenciesinjectiondi.modules.BatteryModules;

import dagger.Component;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */

//@Component   //Dagger Notation Simple Field , Construction and Method Injection then use this
@Component (modules = BatteryModules.class)  //Dagger Notation but Use Model Injection then Use this
public interface MobileComponent {

    //Important Point
    // Dagger ka jis Component ka inder Method create karta ha wo asa a Provision methods declare hotee ha
    //Jis Cheez ka Object Chaya us ka Return Type Wo Raka gay
    Mobile getMobile();

    //Ab Ager atna Code Run Kara gay to Issue Ay ga is ko nahe pata kis ka object create karna ha
    // Is Cheez ka Solution Yea ha Jis ka Object Bana ha us ka Constructor ka uper ja ka notation inject use kara ga


    // call for filed injection

    void inject(MainActivity activity);
}
