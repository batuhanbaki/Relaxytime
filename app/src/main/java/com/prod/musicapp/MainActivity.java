package com.prod.musicapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{

    ImageView dogal,muzik,notavailable;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlamalar();
        notavailable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Şuanda Aktif Değildir", Toast.LENGTH_SHORT).show();
            }
        });
        final MusicFragment musicFragment = new MusicFragment();
        final NaturalFragment naturalFragment = new NaturalFragment();

        FragmentManager fm = getFragmentManager();
        final FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.relativeLayout,naturalFragment,"");
        transaction.commit();

        dogal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.relativeLayout,naturalFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        muzik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.relativeLayout,musicFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



    }

    public void tanimlamalar()
    {
        dogal = findViewById(R.id.natural);
        muzik = findViewById(R.id.muzik);
        notavailable = findViewById(R.id.notavailable);
    }





}
