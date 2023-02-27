package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pagina2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);


        Intent intent = getIntent();
        int resulsuma,resulresta,resulmulti,resuldivi;
          resulsuma= intent.getIntExtra("suma", 0);
         resulresta= intent.getIntExtra("resta", 0);
        resulmulti= intent.getIntExtra("multi", 0);
        resuldivi= intent.getIntExtra("divi", 0);

          TextView textViewsuma = findViewById(R.id.textViewsuma);
         TextView textViewres=findViewById(R.id.textView2resta);
         TextView textView4multi=findViewById(R.id.textView4multipli);
        TextView textView5divi=findViewById(R.id.textView5divi);

        String mensajesuma = "La suma es: " + resulsuma;
       String mensajeresta = "La resta es: " + resulresta;
        String mensajemulti = "La Multiplicacion es: " + resulmulti;
        String mensajedivi = "La Division es: " + resuldivi;


       textViewsuma.setText(mensajesuma);
        textViewres.setText(mensajeresta);
        textView4multi.setText(mensajemulti);
        textView5divi.setText(mensajedivi);


//        Intent intent1 = getIntent();
//        int restaQueNosPasaron = intent1.getIntExtra("resta", 0);
//        TextView textView1 = findViewById(R.id.textView);
//        String mensajer = "La resta es: " + restaQueNosPasaron;
//        textView1.setText(mensajer);




    }


}