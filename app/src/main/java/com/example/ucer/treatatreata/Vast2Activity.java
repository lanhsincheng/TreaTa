package com.example.ucer.treatatreata;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vast2Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView vast2sss,vast2ddd,play2,vast2;
    AnimationDrawable anim2;
    MediaPlayer song2;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vast2);

        song2 = MediaPlayer.create(Vast2Activity.this,R.raw.alla);

        //set vast animation
        vast2 = (ImageView) findViewById(R.id.vast2_id);

        //animation
        if(vast2==null) throw new AssertionError();
        vast2.setBackgroundResource(R.drawable.anim2);

        anim2 = (AnimationDrawable)vast2.getBackground();
        //anim.start();

        //set reference to every card
        vast2sss = (ImageView) findViewById(R.id.vast2sss_id);
        vast2ddd = (ImageView) findViewById(R.id.vast2ddd_id);
        play2 = (ImageView) findViewById(R.id.play2_id);
        //set click
        vast2sss.setClickable(true);
        vast2ddd.setClickable(true);
        play2.setClickable(true);
        //add click listener
        vast2sss.setOnClickListener(this);
        vast2ddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.vast2sss_id : i = new Intent(this, PerSongActivity.class); startActivity(i) ; break;
            case R.id.vast2ddd_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            default: break;
        }

    }

    public void play2it(View view) {
        if(counter%2 == 0) {
            song2.start();
            anim2.start();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("2");
        }
        else{
            song2.stop();
            anim2.stop();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("0");
        }

        counter++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        song2.release();
    }
}
