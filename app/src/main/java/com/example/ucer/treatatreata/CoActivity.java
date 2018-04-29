package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CoActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView cothird,cosss,coddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co);

        //set reference to every card
        cothird = (ImageView) findViewById(R.id.cothird_id);
        cosss = (ImageView) findViewById(R.id.cosss_id);
        coddd = (ImageView) findViewById(R.id.coddd_id);
        //set click
        cothird.setClickable(true);
        cosss.setClickable(true);
        coddd.setClickable(true);
        //add click listener
        cothird.setOnClickListener(this);
        cosss.setOnClickListener(this);
        coddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch ( view.getId()) {
            case R.id.cothird_id : i = new Intent(this, CoSongActivity.class); startActivity(i) ; break;
            case R.id.cosss_id : i = new Intent(this, HomeActivity.class); startActivity(i) ; break;
            case R.id.coddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            default: break;
        }

    }
}
