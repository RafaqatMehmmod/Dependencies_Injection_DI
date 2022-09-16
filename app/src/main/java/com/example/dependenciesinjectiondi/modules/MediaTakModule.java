package com.example.dependenciesinjectiondi.modules;

import com.example.dependenciesinjectiondi.model.MediaTak;
import com.example.dependenciesinjectiondi.model.Processor;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 16/09/2022
 */

//Ap is tara be use kar saktay ho ya Jis tara Snap dragon ka keya ha us tara be kar sakta ha
    //Lain thora sa code ko enhance keya jy to yea best ha
@Module
public abstract class MediaTakModule {

    @Binds
    abstract Processor getProcessor(MediaTak mediaTak);
}
