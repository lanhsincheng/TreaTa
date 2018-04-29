package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RaceActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView racethird,racesss,raceddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race);

        //set reference to every card
        racethird = (ImageView) findViewById(R.id.racethird_id);
        racesss = (ImageView) findViewById(R.id.racesss_id);
        raceddd = (ImageView) findViewById(R.id.raceddd_id);
        //set click
        racethird.setClickable(true);
        racesss.setClickable(true);
        raceddd.setClickable(true);
        //add click listener
        racethird.setOnClickListener(this);
        racesss.setOnClickListener(this);
        raceddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch ( view.getId()) {
            case R.id.racethird_id : i = new Intent(this, RaceSongActivity.class); startActivity(i) ; break;
            case R.id.racesss_id : i = new Intent(this, HomeActivity.class); startActivity(i) ; break;
            case R.id.raceddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            default: break;
        }

    }
}
