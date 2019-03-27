package com.shijo.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavigationTwo extends AppCompatActivity {

    private BottomNavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_two);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_movie:
                        Toast.makeText(BottomNavigationTwo.this, "Movie clicked", Toast.LENGTH_SHORT).show();
                        navigation.setBackgroundColor(getResources().getColor(R.color.color1));
                        return true;
                    case R.id.navigation_music:
                        Toast.makeText(BottomNavigationTwo.this, "Music clicked", Toast.LENGTH_SHORT).show();
                        navigation.setBackgroundColor(getResources().getColor(R.color.color2));
                        return true;
                    case R.id.navigation_books:
                        Toast.makeText(BottomNavigationTwo.this, "Book clicked", Toast.LENGTH_SHORT).show();
                        navigation.setBackgroundColor(getResources().getColor(R.color.color3));
                        return true;
                    case R.id.navigation_newsstand:
                        Toast.makeText(BottomNavigationTwo.this, "News clicked", Toast.LENGTH_SHORT).show();
                        navigation.setBackgroundColor(getResources().getColor(R.color.color4));
                        return true;
                }
                return false;
            }
        });
    }
}
