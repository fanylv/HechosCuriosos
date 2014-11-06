package com.estefanialopez.hechoscuriosos;

import android.content.Context;

import java.util.Random;


public class Hechos {

    Random randomGenerator ;

   String[] frases;

    Hechos(Context c){

        randomGenerator = new Random();
        frases=c.getResources().getStringArray(R.array.h);


    }

    public String dameFrase(){

     int randomNumber=randomGenerator.nextInt(frases.length);
     String frase= frases[randomNumber];

        return frase;


    }




}
