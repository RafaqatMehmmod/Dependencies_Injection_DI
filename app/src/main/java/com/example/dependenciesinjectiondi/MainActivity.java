package com.example.dependenciesinjectiondi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dependenciesinjectiondi.component.DaggerMobileComponent;
import com.example.dependenciesinjectiondi.component.MobileComponent;
import com.example.dependenciesinjectiondi.model.Battery;
import com.example.dependenciesinjectiondi.model.Mobile;
import com.example.dependenciesinjectiondi.model.Processor;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Manuall Call DI Using Constructor
//        Battery battery=new Battery();
//        Processor processor=new Processor();
//        Mobile mobile=new Mobile(battery,processor);


        //Using DI IN Constructor
        MobileComponent mobileComponent= DaggerMobileComponent.create();
        //Provision Method ka through object DI na khud create keya ha humay create karna ke zaroat nahe pari
        Mobile mobile=mobileComponent.getMobile();
        mobile.run();
    }


}