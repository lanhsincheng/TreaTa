package com.example.ucer.treatatreata;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class VastActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView vastsss,vastddd,play,vast;
    AnimationDrawable anim;
    MediaPlayer song;
    int counter = 0;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vast);

        song = MediaPlayer.create(VastActivity.this,R.raw.littlestar);

        //set vast animation
        vast = (ImageView) findViewById(R.id.vast_id);

        //animation
        if(vast==null) throw new AssertionError();
        vast.setBackgroundResource(R.drawable.anim1);

        anim = (AnimationDrawable)vast.getBackground();

        //set reference to every card
        vastsss = (ImageView) findViewById(R.id.vastsss_id);
        vastddd = (ImageView) findViewById(R.id.vastddd_id);
        play = (ImageView) findViewById(R.id.play_id);
        //set click
        vastsss.setClickable(true);
        vastddd.setClickable(true);
        play.setClickable(true);
        //add click listener
        vastsss.setOnClickListener(this);
        vastddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.vastsss_id : i = new Intent(this, PerSongActivity.class); startActivity(i) ; break;
            case R.id.vastddd_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            default: break;
        }

    }


     public void playit(View view) {

            if (counter % 2 == 0) {
                song.start();
                anim.start();
                if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                    BTActivity.mConnectedThread.write("1");
            } else {
                song.stop();
                anim.stop();
                if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                    BTActivity.mConnectedThread.write("0");
            }
            counter++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
    }

}
