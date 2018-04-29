package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity  implements View.OnClickListener{
     private  ImageView first,second,third,sss,ddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //set reference to every card
        first = (ImageView) findViewById(R.id.first_id);
        second = (ImageView) findViewById(R.id.second_id);
        third = (ImageView) findViewById(R.id.third_id);
        sss = (ImageView) findViewById(R.id.sss_id);
        ddd = (ImageView) findViewById(R.id.ddd_id);
        //set click
        first.setClickable(true);
        second.setClickable(true);
        third.setClickable(true);
        sss.setClickable(true);
        ddd.setClickable(true);
        //add click listener
        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        sss.setOnClickListener(this);
        ddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       Intent i;

        switch ( view.getId()) {
            case R.id.first_id : i = new Intent(this, PerActivity.class); startActivity(i) ; break;
            case R.id.second_id : i = new Intent(this, CoActivity.class); startActivity(i) ; break;
            case R.id.third_id : i = new Intent(this, RaceActivity.class); startActivity(i) ; break;
            case R.id.sss_id : i = new Intent(this, MainActivity.class); startActivity(i) ; break;
            case R.id.ddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
