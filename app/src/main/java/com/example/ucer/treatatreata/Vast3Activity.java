package com.example.ucer.treatatreata;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vast3Activity extends AppCompatActivity implements View.OnClickListener{
    private ImageView vast3sss,vast3ddd,play3,vast3;
    AnimationDrawable anim3;
    MediaPlayer song3;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vast3);

        song3 = MediaPlayer.create(Vast3Activity.this,R.raw.bee);

        //set vast animation
        vast3 = (ImageView) findViewById(R.id.vast3_id);

        //animation
        if(vast3==null) throw new AssertionError();
        vast3.setBackgroundResource(R.drawable.anim3);

        anim3 = (AnimationDrawable)vast3.getBackground();

        //set reference to every card
        vast3sss = (ImageView) findViewById(R.id.vast3sss_id);
        vast3ddd = (ImageView) findViewById(R.id.vast3ddd_id);
        play3 = (ImageView) findViewById(R.id.play3_id);
        //set click
        vast3sss.setClickable(true);
        vast3ddd.setClickable(true);
        play3.setClickable(true);
        //add click listener
        vast3sss.setOnClickListener(this);
        vast3ddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.vast3sss_id : i = new Intent(this, PerSongActivity.class); startActivity(i) ; break;
            case R.id.vast3ddd_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            default: break;
        }

    }

    public void play3it(View view) {
        if(counter%2==0) {
            song3.start();
            anim3.start();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("3");
        }
        else{
            song3.stop();
            anim3.stop();
            if (BTActivity.mConnectedThread != null) //First check to make sure thread created
                BTActivity.mConnectedThread.write("0");
        }

        counter++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        song3.release();
    }
}
