package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PerActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView perthird,persss,perddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);

        //set reference to every card
        perthird = (ImageView) findViewById(R.id.perthird_id);
        persss = (ImageView) findViewById(R.id.persss_id);
        perddd = (ImageView) findViewById(R.id.perddd_id);
        //set click
        perthird.setClickable(true);
        persss.setClickable(true);
        perddd.setClickable(true);
        //add click listener
        perthird.setOnClickListener(this);
        persss.setOnClickListener(this);
        perddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch ( view.getId()) {
            case R.id.perthird_id : i = new Intent(this, PerSongActivity.class); startActivity(i) ; break;
            case R.id.persss_id : i = new Intent(this, HomeActivity.class); startActivity(i) ; break;
            case R.id.perddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
