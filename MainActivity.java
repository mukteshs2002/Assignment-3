package com.example.asssignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homebtn,abtbtn,coursebtn;
        homebtn=findViewById(R.id.homebtn);
        abtbtn=findViewById(R.id.abtbtn);
        coursebtn=findViewById(R.id.coursebtn);

        Intent home= new Intent(MainActivity.this,Home.class);
        Intent courses= new Intent(this,Courses.class);

        Intent aboutus= new Intent(MainActivity.this,AboutUs.class);
        aboutus.putExtra("name","Muktesh Raghavan");
        aboutus.putExtra("rollnumber","J024");
        aboutus.putExtra("sapid","70092000073");
        aboutus.putExtra("year","2nd");
        aboutus.putExtra("sem","4th");
        aboutus.putExtra("age",19);
        aboutus.putExtra("hobby","Chess, Badminton, Football");
        aboutus.putExtra("favclub","FC Barcelona");

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(home);
            }
        });

        abtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(aboutus);

            }
        });

        coursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(courses);
            }
        });





    }
}