package com.beyza.yesilcamfilm_anlatbakalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class son extends grup1anlat {
    TextView aa;
    TextView b;
    TextView c;
    int a;
    int bb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_son);
        aa=findViewById(R.id.textView4);
        b=findViewById(R.id.textView5);
        c=findViewById(R.id.textView3);
        a=sharedPreferences.getInt("skor",0);
        bb=sharedPreferences.getInt("skor2",0);
        aa.setText("skor"+" "+a);
        b.setText("skor"+" "+b);


    }
}