package com.example.miha1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Activity7 extends AppCompatActivity {

    ImageButton prevpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView)findViewById(R.id.number);
        number.setText("7");

        RelativeLayout background = (RelativeLayout)findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.svnth));

        prevpage = (ImageButton) findViewById(R.id.prev);

        prevpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}