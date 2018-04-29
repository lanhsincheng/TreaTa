package com.example.ucer.treatatreata;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RaVast4Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageView vast4sss,vast4ddd,play4,vast4;
    AnimationDrawable anim4;
    MediaPlayer song4;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vast4);

        song4 = MediaPlayer.create(RaVast4Activity.this,R.raw.bridge);

        //set vast animation
        vast4 = (ImageView) findViewById(R.id.vast4_id);

        //animation
        if(vast4==null) throw new AssertionError();
        vast4.setBackgroundResource(R.drawable.anim4);

        anim4 = (AnimationDrawable)vast4.getBackground();

        //set reference to every card
        vast4sss = (ImageView) findViewById(R.id.vast4sss_id);
        vast4ddd = (ImageView) findViewById(R.id.vast4ddd_id);
        play4 = (ImageView) findViewById(R.id.play4_id);
        //set click
        vast4sss.setClickable(true);
        vast4ddd.setClickable(true);
        play4.setClickable(true);
        //add click listener
        vast4sss.setOnClickListener(this);
        vast4ddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.vast4sss_id : i = new Intent(this, RaceSongActivity.class); startActivity(i) ; break;
            case R.id.vast4ddd_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            default: break;
        }
    }

    public void play4it(View view) {
        if(counter%2==0) {
            song4.start();
            anim4.start();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("4");
        }
        else{
            song4.stop();
            anim4.stop();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("0");
        }

        counter++;

    }

    @Override
    protected void onPause() {
        super.onPause();
        song4.release();
    }
}
