package com.espelita.espelitalabexercise1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Place 1", "Fusebox");
        Log.d("Place 2", "Plaza Mayor");
        Log.d("Place 3", "Roque Ruaño");
        Log.d("Place 4","Grandstand");
    }
}
