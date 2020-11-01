package com.example.loginn;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.openNavDrawer,
                R.string.closeNavDrawer
        );
        navigationView.bringToFront();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
            {
                //Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                Intent intent = new Intent(HomeActivity.this,HomemenuActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_profile:
            {
                //Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                Intent intent = new Intent(HomeActivity.this,ProfileActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_contact:
            {
                //Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                Intent intent = new Intent(HomeActivity.this,ContactActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_logout:
            {
                //Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }

//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}