package com.bh.datastructure;

import android.util.Log;

public class Logger {
    private static final String TAG = "BOO@";

    public static void d(String className, String msg) {
        Log.d(TAG + className, msg);
    }
}
