package com.shijo.bottomnavigation;

import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BottomNavigationThree extends AppCompatActivity {

    private TabLayout tab_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_three);

        tab_layout = (TabLayout) findViewById(R.id.tab_layout);

        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_home), 0);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_search), 1);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_add_box), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_favorites), 3);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_person), 4);

        tab_layout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.color2), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.color3), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.color3), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(3).getIcon().setColorFilter(getResources().getColor(R.color.color3), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(4).getIcon().setColorFilter(getResources().getColor(R.color.color3), PorterDuff.Mode.SRC_IN);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.color2), PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        Toast.makeText(BottomNavigationThree.this, "Home clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(BottomNavigationThree.this, "Search clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(BottomNavigationThree.this, "ADD clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(BottomNavigationThree.this, "Favorite clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(BottomNavigationThree.this, "person clicked", Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.color3), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
