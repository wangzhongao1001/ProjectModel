package com.sx.app;

import android.app.Application;

public class MyApp extends Application {
    private   static MyApp myserver;
    @Override
    public void onCreate() {
        super.onCreate();
        myserver=this;

    }
    public  static MyApp getInstance(){
        return myserver;
    }

}
