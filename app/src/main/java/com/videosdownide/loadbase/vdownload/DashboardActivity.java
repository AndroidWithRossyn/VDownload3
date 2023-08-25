package com.videosdownide.loadbase.vdownload;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.videosdownide.loadbase.vdownload.Fragment.HomeFragment;
import com.videosdownide.loadbase.vdownload.Fragment.WallpaperFragment;

public class DashboardActivity extends AppCompatActivity {
    TextView homepage, wallpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        homepage = findViewById(R.id.homepage);
        wallpaper = findViewById(R.id.wallpaper);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                HomeFragment homeFragment = new HomeFragment();
                transaction.replace(R.id.frame1, homeFragment);
                transaction.commit();
            }
        });
        wallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                WallpaperFragment wallpaperFragment = new WallpaperFragment();
                transaction.replace(R.id.frame1, wallpaperFragment);
                transaction.commit();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,
                R.anim.slide_out_right);
    }
}