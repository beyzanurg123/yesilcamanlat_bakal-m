package com.beyza.yesilcamfilm_anlatbakalm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText grup1;
    EditText grup2;
    String g1;
    String g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     grup1=findViewById(R.id.grup1ıd);
     grup2=findViewById(R.id.grup2ıd);
     
    }
    public void gecis(View view){
        if (grup1.getText().toString().matches("") || grup2.getText().toString().matches("") ) {
            Toast.makeText(MainActivity.this,"GRUP İSMİ YAZ",Toast.LENGTH_LONG).show();
        }
        else{
        Intent intent=new Intent(MainActivity.this,grup1anlat.class);
        g1=grup1.getText().toString();
        g2=grup2.getText().toString();
        intent.putExtra("grup1adı",g1);
        Intent intentt=new Intent(MainActivity.this,grup2anlat.class);
        intentt.putExtra("grup2adı",g2);
        startActivity(intent);

    }}

}
