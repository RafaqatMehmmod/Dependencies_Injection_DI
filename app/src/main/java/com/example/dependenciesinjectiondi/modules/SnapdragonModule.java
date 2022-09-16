package com.example.dependenciesinjectiondi.modules;

import com.example.dependenciesinjectiondi.model.Processor;
import com.example.dependenciesinjectiondi.model.Snapdragon;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */

@Module
public class SnapdragonModule {

    @Provides
    static Processor getProcessor(Snapdragon snapdragon)
    {
        return snapdragon;
    }

}
