package com.udemy.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nE2OBMUgr7Wb8DM4mq4kkSFZgraRXyEtrSP58OwC")
                // if defined
                .clientKey("6LFEFf9o0IsGouGW9wbfdbSCV264z0tf2yW4rkV3")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
