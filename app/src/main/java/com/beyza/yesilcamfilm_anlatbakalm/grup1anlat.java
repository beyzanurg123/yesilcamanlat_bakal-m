package com.beyza.yesilcamfilm_anlatbakalm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class grup1anlat extends AppCompatActivity {
    TextView b;
    Runnable runnable;
    Handler handler;
    SharedPreferences sharedPreferences;
    TextView timeid;
    int sayac;
    Button pas;
    TextView skor;
    int hak=3;
    ImageView img;
  //  ImageView [] array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grup1anlat);
        timeid=findViewById(R.id.time);
        pas=findViewById(R.id.pas);
        skor=findViewById(R.id.skor);
        b=findViewById(R.id.grupadı1);
        img = (ImageView)findViewById(R.id.img);

        Intent intent=getIntent();
        String j=intent.getStringExtra("grup1adı");
        b.setText(j);

        sharedPreferences=this.getSharedPreferences("com.beyza.yesilcamfilm_anlatbakalm", Context.MODE_PRIVATE );

        int[] array = {R.drawable.maviboncuk,R.drawable.selviboylum,R.drawable.koydenindm,R.drawable.bizimaile,R.drawable.salako,R.drawable.neseligun,
                R.drawable.zugurtaga,R.drawable.cpcu,R.drawable.hbmm};
        Random rand = new Random();
        int i = rand.nextInt(array.length);
        img.setImageDrawable(getResources().getDrawable(array[i]));

        new CountDownTimer(40000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                timeid.setText("Time "+millisUntilFinished / 1000);
            }
            @Override
            public void onFinish() {

                timeid.setText("SÜREN BİTTİ");

                sharedPreferences.edit().putInt("skor",sayac).apply();
                Intent intent=new Intent(getApplicationContext(),grup2anlat.class);
                startActivity(intent);

            }
        }.start();
    }

    public void dogru(View view){
        sayac++;
       skor.setText("skor"+" "+sayac);
        int[] array = {R.drawable.neseligun,R.drawable.maviboncuk,R.drawable.selviboylum,R.drawable.koydenindm,R.drawable.bizimaile,R.drawable.salako,
        R.drawable.zugurtaga,R.drawable.cpcu,R.drawable.hbmm};
        Random rand = new Random();
        int i = rand.nextInt(array.length);
        img.setImageDrawable(getResources().getDrawable(array[i]));

    }
    public void pas(View view){
       hak--;
        if(hak==0){
           pas.setEnabled(false);
        }
        int[] array = {R.drawable.koydenindm,R.drawable.bizimaile,R.drawable.salako,
                R.drawable.zugurtaga,R.drawable.cpcu,R.drawable.hbmm};
        Random rand = new Random();
        int i = rand.nextInt(array.length);
        img.setImageDrawable(getResources().getDrawable(array[i]));
    }
}
