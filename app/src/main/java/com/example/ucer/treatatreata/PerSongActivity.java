package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PerSongActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView persongsss,persongddd,per1,per2,per3,per4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_song);
        if (BTActivity.mConnectedThread != null) //First check to make sure thread created
            BTActivity.mConnectedThread.write("0");

        //set reference to every card
        persongsss = (ImageView) findViewById(R.id.persongsss_id);
        persongddd = (ImageView) findViewById(R.id.persongddd_id);
        per1 = (ImageView) findViewById(R.id.per1_id);
        per2 = (ImageView) findViewById(R.id.per2_id);
        per3 = (ImageView) findViewById(R.id.per3_id);
        per4 = (ImageView) findViewById(R.id.per4_id);
        //set click
        persongsss.setClickable(true);
        persongddd.setClickable(true);
        per1.setClickable(true);
        per2.setClickable(true);
        per3.setClickable(true);
        per4.setClickable(true);
        //add click listener
        persongsss.setOnClickListener(this);
        persongddd.setOnClickListener(this);
        per1.setOnClickListener(this);
        per2.setOnClickListener(this);
        per3.setOnClickListener(this);
        per4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.persongsss_id : i = new Intent(this, PerActivity.class); startActivity(i) ; break;
            case R.id.persongddd_id : i = new Intent(this, HelpActivity.class); startActivity(i) ; break;
            case R.id.per1_id : i = new Intent(this, VastActivity.class); startActivity(i) ; break;
            case R.id.per2_id : i = new Intent(this, Vast2Activity.class); startActivity(i) ; break;
            case R.id.per3_id : i = new Intent(this, Vast3Activity.class); startActivity(i) ; break;
            case R.id.per4_id : i = new Intent(this, Vast4Activity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
