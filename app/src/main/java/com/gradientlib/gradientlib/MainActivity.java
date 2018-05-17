package com.gradientlib.gradientlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.gradientlibrary.GradientArtistBasic;

public class MainActivity extends AppCompatActivity {
    GradientArtistBasic gradient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradient = (GradientArtistBasic) findViewById(R.id.gradientImage);
        gradient.setUrlImage("https://img1.etsystatic.com/002/0/6449624/il_fullxfull.382134677_so6e.jpg", R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, ImageView.ScaleType.CENTER_CROP);
    }
}
