package com.espelita.espelitalabexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class USTPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ustplaces);
    }

    public void place1(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/fuseboxph/"));
        startActivity(i);
    }

    public void place2(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/plaza-mayor/4d4f05c49d662d433ce34c00"));
        startActivity(i);
    }

    public void place3(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/roque-rua%C3%B1o-building/4d4ede8a9d662d43d6a94b00"));
        startActivity(i);
    }

    public void place4(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Field"));
        startActivity(i);
    }
}
