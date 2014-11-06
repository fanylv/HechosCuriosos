package com.estefanialopez.hechoscuriosos;

import android.graphics.Color;

import java.util.Random;


public class ColorWeel {

   Random rnd = new Random();
    int colores []={Color.parseColor("#39add1"),Color.parseColor("#3079ab"),Color.parseColor("#c25975"),Color.parseColor("#e15258"),
            Color.parseColor("#f9845b"),Color.parseColor("#838cc7"),Color.parseColor("#7d669e"),Color.parseColor("#53bbb4"),
            Color.parseColor("#51b46d"),Color.parseColor("#e0ab18"),Color.parseColor("#637a91"),Color.parseColor("#f092b0"),
            Color.parseColor("#b7c0c7"),


    };


    public int dameColor()
    {

    return colores[rnd.nextInt(colores.length)];
    }

}
