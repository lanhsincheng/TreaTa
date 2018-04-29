package com.example.ucer.treatatreata;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static int SPLASH_TIME_OUT = 3000;
    //private TextView welcome;
    private ImageView a;
    private ImageView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set reference to every card
        start = (ImageView) findViewById(R.id.start_id);

        //set click
        start.setClickable(true);

        //add click listener
        start.setOnClickListener(this);


        //welcome = (TextView) findViewById(R.id.welcome_id);
        a = (ImageView) findViewById(R.id.a_id) ;
        /*Animation anim = AnimationUtils.loadAnimation(this,R.anim.transition);
        welcome.startAnimation(anim);
        logo.startAnimation(anim);*/


        //welcome page delay handler
        //new Handler().postDelayed(new Runnable() {
          //  @Override
            //public void run() {
              //  Intent homeIntent = new Intent(MainActivity.this,HelpActivity.class);
                //startActivity(homeIntent);
                //finish();
            //}
        //} , SPLASH_TIME_OUT);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch ( view.getId()) {
            case R.id.start_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
