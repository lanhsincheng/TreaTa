package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CoSongActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView cosongsss,cosongddd,co1,co2,co3,co4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_song);
        if (BTActivity.mConnectedThread != null) //First check to make sure thread created
            BTActivity.mConnectedThread.write("0");

        //set reference to every card
        cosongsss = (ImageView) findViewById(R.id.cosongsss_id);
        cosongddd = (ImageView) findViewById(R.id.cosongddd_id);
        co1 = (ImageView) findViewById(R.id.co1_id);
        co2 = (ImageView) findViewById(R.id.co2_id);
        co3 = (ImageView) findViewById(R.id.co3_id);
        co4 = (ImageView) findViewById(R.id.co4_id);
        //set click
        cosongsss.setClickable(true);
        cosongddd.setClickable(true);
        co1.setClickable(true);
        co2.setClickable(true);
        co3.setClickable(true);
        co4.setClickable(true);
        //add click listener
        cosongsss.setOnClickListener(this);
        cosongddd.setOnClickListener(this);
        co1.setOnClickListener(this);
        co2.setOnClickListener(this);
        co3.setOnClickListener(this);
        co4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.cosongsss_id : i = new Intent(this, CoActivity.class); startActivity(i) ; break;
            case R.id.cosongddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            case R.id.co1_id : i = new Intent(this, CoVastActivity.class); startActivity(i) ; break;
            case R.id.co2_id : i = new Intent(this, CoVast2Activity.class); startActivity(i) ; break;
            case R.id.co3_id : i = new Intent(this, CoVast3Activity.class); startActivity(i) ; break;
            case R.id.co4_id : i = new Intent(this, CoVast4Activity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
