package com.example.asssignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        TextView abtust;
        abtust=findViewById(R.id.abtust);
        Intent frommain= getIntent();
        String name;
        name = frommain.getStringExtra("name");
        String rollnumber= frommain.getStringExtra("rollnumber");
        String sapid=frommain.getStringExtra("sapid");
        String year= frommain.getStringExtra("year");
        String sem=  frommain.getStringExtra("sem");
        int age=frommain.getIntExtra("age",18);
        String hobby=frommain.getStringExtra("hobby");
        String favclub=frommain.getStringExtra("favclub");
        String abtustitle= "About Us";

        abtust.setText("Name: "+name+"\n\nRollnumber: "+rollnumber+"\n\nSAP ID: "+sapid+"\n\nYear: "+year+"\n\nSemester: "+sem+"\n\nAge: "+age+"\n\nHobby: "+hobby+"\n\nFavourite Club: "+favclub);
        getSupportActionBar().setTitle(abtustitle);

    }
}