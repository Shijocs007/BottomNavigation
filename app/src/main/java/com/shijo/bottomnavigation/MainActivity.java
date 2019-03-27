package com.shijo.bottomnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bottomNavigation1, bottomNavigation2, bottomNavigation3, bottomNavigation4, bottomNavigation5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation1 = (Button) findViewById(R.id.navigation_one);
        bottomNavigation2 = (Button) findViewById(R.id.navigation_two);
        bottomNavigation3 = (Button) findViewById(R.id.navigation_three);
        bottomNavigation4 = (Button) findViewById(R.id.navigation_four);

        bottomNavigation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomNavihationOne.class));
            }
        });

        bottomNavigation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomNavigationTwo.class));
            }
        });

        bottomNavigation3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomNavigationThree.class));
            }
        });

        bottomNavigation4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomNavigationFour.class));
            }
        });
    }
}
