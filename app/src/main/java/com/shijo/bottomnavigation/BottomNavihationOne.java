package com.shijo.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class BottomNavihationOne extends AppCompatActivity {

    private BottomNavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navihation_one);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_recent:
                        Toast.makeText(BottomNavihationOne.this, "Recent clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_favorites:
                        Toast.makeText(BottomNavihationOne.this, "Favourite clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_nearby:
                        Toast.makeText(BottomNavihationOne.this, "Nearme clicked", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });

    }
}
