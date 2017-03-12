package com.example.chen.schoolapp.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by chen on 2017/3/10.
 */

/**
 * 重写onCreate
 * 能在任意地方使用context
 */
public class Myapplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext(){
        return context;
    }
}
