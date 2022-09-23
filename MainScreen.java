package com.example.survey;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import com.example.survey.AboutFragment;
import com.example.survey.HomeFragment;
import com.example.survey.PostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainScreen extends AppCompatActivity {

    BottomNavigationView navigationbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_screen);

        navigationbar = findViewById(R.id.navigation_bar);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.conta,new HomeFragment());
        transaction.commit();
        navigationbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId())
                {
                    case R.id.home:
                        transaction.replace(R.id.conta,new HomeFragment());
                        break;

                    case R.id.post:
                        transaction.replace(R.id.conta,new PostFragment());
                        break;
                    case R.id.about:
                        transaction.replace(R.id.conta,new AboutFragment());
                        break;
                }
                transaction.commit();

                return true;
            }
        });
    }
}