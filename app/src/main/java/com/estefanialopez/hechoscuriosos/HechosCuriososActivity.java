package com.estefanialopez.hechoscuriosos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class HechosCuriososActivity extends Activity {

    Hechos hechos ;
    ColorWeel col;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        hechos = new Hechos(HechosCuriososActivity.this);
        col = new ColorWeel();
    }

    public void factButtonAction(View view) {
        TextView factLabel = (TextView)findViewById(R.id.HechoCuriosoTextView);
        String fact = "";
        ChangeBackGroundColor();




        fact= hechos.dameFrase();

        factLabel.setText(fact);

    }

    private void ChangeBackGroundColor(){

     Button showFactButton = (Button) findViewById(R.id.button);
     RelativeLayout rel = (RelativeLayout) findViewById(R.id.relativeLayout);

     int numero=col.dameColor();
     rel.setBackgroundColor(numero);
     showFactButton.setTextColor(numero);



    }













}
