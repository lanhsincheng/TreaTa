package com.example.ucer.treatatreata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //set reference to every card
        bt = (ImageView) findViewById(R.id.bt_id);

        //set click
        bt.setClickable(true);

        //add click listener
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch ( view.getId()) {
            case R.id.bt_id : i = new Intent(this, HomeActivity.class); startActivity(i) ; break;
            default: break;
        }
    }
}
