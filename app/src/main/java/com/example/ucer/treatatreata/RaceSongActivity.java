package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RaceSongActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView rasongsss,rasongddd,ra1,ra2,ra3,ra4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_song);
        if (BTActivity.mConnectedThread != null) //First check to make sure thread created
            BTActivity.mConnectedThread.write("0");

        //set reference to every card
        rasongsss = (ImageView) findViewById(R.id.rasongsss_id);
        rasongddd = (ImageView) findViewById(R.id.rasongddd_id);
        ra1 = (ImageView) findViewById(R.id.ra1_id);
        ra2 = (ImageView) findViewById(R.id.ra2_id);
        ra3 = (ImageView) findViewById(R.id.ra3_id);
        ra4 = (ImageView) findViewById(R.id.ra4_id);
        //set click
        rasongsss.setClickable(true);
        rasongddd.setClickable(true);
        ra1.setClickable(true);
        ra2.setClickable(true);
        ra3.setClickable(true);
        ra4.setClickable(true);
        //add click listener
        rasongsss.setOnClickListener(this);
        rasongddd.setOnClickListener(this);
        ra1.setOnClickListener(this);
        ra2.setOnClickListener(this);
        ra3.setOnClickListener(this);
        ra4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.rasongsss_id : i = new Intent(this, RaceActivity.class); startActivity(i) ; break;
            case R.id.rasongddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            case R.id.ra1_id : i = new Intent(this, RaVastActivity.class); startActivity(i) ; break;
            case R.id.ra2_id : i = new Intent(this, RaVast2Activity.class); startActivity(i) ; break;
            case R.id.ra3_id : i = new Intent(this, RaVast3Activity.class); startActivity(i) ; break;
            case R.id.ra4_id : i = new Intent(this, RaVast4Activity.class); startActivity(i) ; break;
            default: break;
        }

    }
}
