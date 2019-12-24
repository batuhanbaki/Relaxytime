package com.prod.musicapp;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MusicFragment extends Fragment
{

    AdView mAdView;
    ImageView drum,violin,rattle,tablas,sitar,piano,trumpet,clarinet,trombone;
    Integer drumi,violini,rattlei,tablasi,sitari,pianoi,trumpeti,clarineti,trombonei;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.music_fragment,container,false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MobileAds.initialize(view.getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        drum = view.findViewById(R.id.drum);
        violin= view.findViewById(R.id.violin);
        rattle= view.findViewById(R.id.rattle);
        tablas= view.findViewById(R.id.tablas);
        sitar= view.findViewById(R.id.sitar);
        piano= view.findViewById(R.id.piano);
        trumpet= view.findViewById(R.id.trumpet);
        clarinet= view.findViewById(R.id.clarinet);
        trombone= view.findViewById(R.id.trombone);

        drumi=0;violini=0;rattlei=0;tablasi=0;sitari=0;pianoi=0;trumpeti=0;clarineti=0;trombonei=0;

        final MediaPlayer drumm = MediaPlayer.create(view.getContext(),R.raw.drum);
        final MediaPlayer violinm = MediaPlayer.create(view.getContext(),R.raw.violin);
        final MediaPlayer rattlem = MediaPlayer.create(view.getContext(),R.raw.rattle);
        final MediaPlayer tablasm = MediaPlayer.create(view.getContext(),R.raw.tabla);
        final MediaPlayer sitarm = MediaPlayer.create(view.getContext(),R.raw.sitar);
        final MediaPlayer pianom = MediaPlayer.create(view.getContext(),R.raw.piano);
        final MediaPlayer trumpetm = MediaPlayer.create(view.getContext(),R.raw.trumpet);
        final MediaPlayer clarinetm = MediaPlayer.create(view.getContext(),R.raw.clarinet);
        final MediaPlayer trombonem = MediaPlayer.create(view.getContext(),R.raw.trombone);

        drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drumi==0)
                {
                    drumi=1;
                    drum.setImageResource(R.drawable.drum1);
                    drumm.start();
                    drumm.setLooping(true);
                }
                else if(drumi==1)
                {
                    drumi=0;
                    drum.setImageResource(R.drawable.drum);
                    drumm.pause();
                }
            }
        });

        violin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(violini==0)
                {
                    violini=1;
                    violin.setImageResource(R.drawable.violin1);
                    violinm.start();
                    violinm.setLooping(true);
                }
                else if(violini==1)
                {
                    violini=0;
                    violin.setImageResource(R.drawable.violin);
                    violinm.pause();
                }
            }
        });

        rattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rattlei==0)
                {
                    rattlei=1;
                    rattle.setImageResource(R.drawable.rattle1);
                    rattlem.start();
                    rattlem.setLooping(true);
                }
                else if(rattlei==1)
                {
                    rattlei=0;
                    rattle.setImageResource(R.drawable.rattle);
                    rattlem.pause();
                }
            }
        });

        tablas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tablasi==0)
                {
                    tablasi=1;
                    tablas.setImageResource(R.drawable.tablas1);
                    tablasm.start();
                    tablasm.setLooping(true);
                }
                else if(tablasi==1)
                {
                    tablasi=0;
                    tablas.setImageResource(R.drawable.tablas);
                    tablasm.pause();
                }
            }
        });
        sitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sitari==0)
                {
                    sitari=1;
                    sitar.setImageResource(R.drawable.sitar1);
                    sitarm.start();
                    sitarm.setLooping(true);
                }
                else if(sitari==1)
                {
                    sitari=0;
                    sitar.setImageResource(R.drawable.sitar);
                    sitarm.pause();
                }
            }
        });
        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pianoi==0)
                {
                    pianoi=1;
                    piano.setImageResource(R.drawable.piano1);
                    pianom.start();
                    pianom.setLooping(true);
                }
                else if(pianoi==1)
                {
                    pianoi=0;
                    piano.setImageResource(R.drawable.piano);
                    pianom.pause();
                }
            }
        });
        trumpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(trumpeti==0)
                {
                    trumpeti=1;
                    trumpet.setImageResource(R.drawable.trumpet1);
                    trumpetm.start();
                    trumpetm.setLooping(true);
                }
                else if(trumpeti==1)
                {
                    trumpeti=0;
                    trumpet.setImageResource(R.drawable.trumpet);
                    trumpetm.pause();
                }
            }
        });
        clarinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clarineti==0)
                {
                    clarineti=1;
                    clarinet.setImageResource(R.drawable.clarinet1);
                    clarinetm.start();
                    clarinetm.setLooping(true);
                }
                else if(clarineti==1)
                {
                    clarineti=0;
                    clarinet.setImageResource(R.drawable.clarinet);
                    clarinetm.pause();
                }
            }
        });
        trombone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(trombonei==0)
                {
                    trombonei=1;
                    trombone.setImageResource(R.drawable.trombone1);
                    trombonem.start();
                    trombonem.setLooping(true);
                }
                else if(trombonei==1)
                {
                    trombonei=0;
                    trombone.setImageResource(R.drawable.trombone);
                    trombonem.pause();
                }
            }
        });

    }
}
