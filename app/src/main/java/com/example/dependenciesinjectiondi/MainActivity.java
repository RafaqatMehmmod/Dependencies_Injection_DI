package com.example.dependenciesinjectiondi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dependenciesinjectiondi.component.DaggerMobileComponent;
import com.example.dependenciesinjectiondi.component.MobileComponent;
import com.example.dependenciesinjectiondi.model.Battery;
import com.example.dependenciesinjectiondi.model.Mobile;
import com.example.dependenciesinjectiondi.model.Processor;

import java.lang.reflect.Constructor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Filed Inject ma Filed private nahe ho satee
    @Inject
    Mobile mobile;

    //    Note:
//            1. Filed Injection Waha use ho ga Jaha per java.lang.reflect.Constructor Create Nahe ho ga Like MainActivity ka constructor hum nahe bana sakta so Filed Injection Use kara gay ...
//    Ager Hamari Apnee Class Ha to hum Constructor Injection Use kara Gay
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Manuall Call DI Using Constructor
//        Battery battery=new Battery();
//        Processor processor=new Processor();
//        Mobile mobile=new Mobile(battery,processor);


        //Using DI IN Constructor
        MobileComponent mobileComponent = DaggerMobileComponent.create();
//        //Provision Method ka through object DI na khud create keya ha humay create karna ke zaroat nahe pari
//        Mobile mobile=mobileComponent.getMobile();
//        mobile.run();

        //Ager hum na mobile ka method ko run karna ha to hum company ma wo he activity pass kasrnee ha jis ma hum field inject kar raha ha
        mobileComponent.inject(this);
        mobile.run();


    }


}