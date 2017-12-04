package com.example.aizat.cryptocurrencycourses;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Aizat on 04.12.2017.
 */

public class AppDelegate extends Application{
    @Override
    public void onCreate() {
            super.onCreate();
            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                    .setDefaultFontPath("fonts/11031.ttf")
                    .setFontAttrId(R.attr.fontPath)
                    .build()
            );
    }
}
