package com.example.buihoangdat_bai1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private FargmentNavigationAdapter adapter;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.navigation);
        adapter = new FargmentNavigationAdapter(getSupportFragmentManager(),
                FargmentNavigationAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mHN:viewPager.setCurrentItem(0);
                        break;
                    case R.id.mDN:viewPager.setCurrentItem(1);
                        break;
                    case R.id.mDL:viewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_header,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mInfo:
                Intent intent = new Intent(MainActivity.this, InfomartionActivity.class);
                startActivity(intent);
                break;
            case R.id.mClose:
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}