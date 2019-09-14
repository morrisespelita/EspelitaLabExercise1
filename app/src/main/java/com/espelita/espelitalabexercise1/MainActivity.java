package com.espelita.espelitalabexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMsg(View v){
        Intent i = new Intent(this, USTPlaces.class);
        startActivity(i);
    }

    public void displayCatalog(View v){
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }
}
