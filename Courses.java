package com.example.asssignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Courses extends AppCompatActivity {
    ListView courselist;
    ArrayList<String> courses=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        courselist =findViewById(R.id.courselist);

        courses.add("Maths 1");
        courses.add("Maths 2");
        courses.add("Android App Development");
        courses.add("SSDI");
        courses.add("STPA");
        courses.add("IDSA");
        courses.add("DBMS");
        courses.add("ISP");
        courses.add("DHV");
        courses.add("Economis");
        courses.add("COI");
        courses.add("Optimization Methods");
        courses.add("EVS");
        courses.add("MAE");
        courses.add("English");
        courses.add("Professional Ethics");

        ArrayAdapter<String> adapter= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,courses);
        courselist.setAdapter(adapter);

        String coursetitle= "Courses";
        getSupportActionBar().setTitle(coursetitle);


    }
}