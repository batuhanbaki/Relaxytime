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

public class NaturalFragment extends Fragment
{
    AdView mAdView;
    ImageView ates,simsek,yagmur,kar,firtina,kus,tiger,su,at;
    Integer atesi,simseki,yagmuri,kari,firtinai,kusi,tigeri,sui,ati;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.natural_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MobileAds.initialize(view.getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ates =  view.findViewById(R.id.ates);
        simsek =  view.findViewById(R.id.simsek);
        yagmur =  view.findViewById(R.id.yagmur);
        kar =  view.findViewById(R.id.kar);
        firtina =  view.findViewById(R.id.firtina);
        kus =  view.findViewById(R.id.kus);
        tiger =  view.findViewById(R.id.tiger);
        su =  view.findViewById(R.id.water);
        at =  view.findViewById(R.id.at);

        atesi =0;simseki=0;yagmuri=0;kari=0;firtinai=0;kusi=0;tigeri=0;sui=0;ati=0;

        final MediaPlayer atesm = MediaPlayer.create(view.getContext(),R.raw.fire);
        final MediaPlayer simsekm = MediaPlayer.create(view.getContext(),R.raw.simsek);
        final MediaPlayer yagmurm = MediaPlayer.create(view.getContext(),R.raw.dalgalar);
        final MediaPlayer karm = MediaPlayer.create(view.getContext(),R.raw.snow);
        final MediaPlayer firtinam = MediaPlayer.create(view.getContext(),R.raw.firtina);
        final MediaPlayer kusm = MediaPlayer.create(view.getContext(),R.raw.gus);
        final MediaPlayer tigerm = MediaPlayer.create(view.getContext(),R.raw.tiger);
        final MediaPlayer sum = MediaPlayer.create(view.getContext(),R.raw.water);
        final MediaPlayer atm = MediaPlayer.create(view.getContext(),R.raw.horse);

        ates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(atesi==0)
                {
                    atesi=1;
                    ates.setImageResource(R.drawable.ates1);
                    atesm.start();
                    atesm.setLooping(true);
                }
                else if(atesi==1)
                {
                    atesi=0;
                    ates.setImageResource(R.drawable.ates);
                    atesm.pause();
                }
            }
        });

        simsek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(simseki==0)
                {
                    simseki=1;
                    simsek.setImageResource(R.drawable.simsek1);
                    simsekm.start();
                    simsekm.setLooping(true);
                }
                else if(simseki==1)
                {
                    simseki=0;
                    simsek.setImageResource(R.drawable.simsek);
                    simsekm.pause();
                }
            }
        });

        firtina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firtinai==0)
                {
                    firtinai=1;
                    firtina.setImageResource(R.drawable.firtina1);
                    firtinam.start();
                    firtinam.setLooping(true);
                }
                else if(firtinai==1)
                {
                    firtinai=0;
                    firtina.setImageResource(R.drawable.firtina);
                    firtinam.pause();
                }
            }
        });

        kus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kusi==0)
                {
                    kusi=1;
                    kus.setImageResource(R.drawable.gus1);
                    kusm.start();
                    kusm.setLooping(true);
                }
                else if(kusi==1)
                {
                    kusi=0;
                    kus.setImageResource(R.drawable.gus);
                    kusm.pause();
                }
            }
        });

        yagmur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yagmuri==0)
                {
                    yagmuri=1;
                    yagmur.setImageResource(R.drawable.yagmur1);
                    yagmurm.start();
                    yagmurm.setLooping(true);
                }
                else if(yagmuri==1)
                {
                    yagmuri=0;
                    yagmur.setImageResource(R.drawable.yagmur);
                    yagmurm.pause();
                }
            }
        });

        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tigeri==0)
                {
                    tigeri=1;
                    tiger.setImageResource(R.drawable.tiger1);
                    tigerm.start();
                    tigerm.setLooping(true);
                }
                else if(tigeri==1)
                {
                    tigeri=0;
                    tiger.setImageResource(R.drawable.tiger);
                    tigerm.pause();
                }
            }
        });

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sui==0)
                {
                    sui=1;
                    su.setImageResource(R.drawable.water1);
                    sum.start();
                    sum.setLooping(true);
                }
                else if(sui==1)
                {
                    sui=0;
                    su.setImageResource(R.drawable.water);
                    sum.pause();
                }
            }
        });

        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ati==0)
                {
                    ati=1;
                    at.setImageResource(R.drawable.at1);
                    atm.start();
                    atm.setLooping(true);
                }
                else if(ati==1)
                {
                    ati=0;
                    at.setImageResource(R.drawable.at);
                    atm.pause();
                }
            }
        });

        kar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kari==0)
                {
                    kari=1;
                    kar.setImageResource(R.drawable.kar1);
                    karm.start();
                    karm.setLooping(true);
                }
                else if(kari==1)
                {
                    kari=0;
                    kar.setImageResource(R.drawable.kar);
                    karm.pause();
                }
            }
        });

    }



}
