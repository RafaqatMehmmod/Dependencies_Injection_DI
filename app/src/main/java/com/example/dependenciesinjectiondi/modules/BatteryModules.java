package com.example.dependenciesinjectiondi.modules;

import com.example.dependenciesinjectiondi.model.Battery;
import com.example.dependenciesinjectiondi.model.Cobalt;
import com.example.dependenciesinjectiondi.model.Lithium;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */

@Module
public class BatteryModules {

    //Ab is ko 2 cheeza chaya jis per yea depend ha
    //Ab dagger ko batana ha ka yea battery mobile in per depend ha r wo is ko use kara us ka lea @Provider liaky gay


    @Provides
    static Cobalt getCobalt()
    {
        return new Cobalt();
    }

    @Provides
    static Lithium getLithium()
    {
        Lithium lithium=new Lithium();
        lithium.done();
        return lithium;
    }

    @Provides
   static Battery getBattery(Cobalt cobalt,Lithium lithium)
    {
        return new Battery(lithium,cobalt);
    }

    //Ager Performance increase karnee ha to method ko static kar do q ka dagger ko bar bar Object bana parta ha
    //So is cheez ko over kam karna ka lea static keyword use kar la gay
}
