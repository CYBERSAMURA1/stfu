package com.example.miha1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Activity5 extends AppCompatActivity {

    ImageButton nextpage, prevpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView)findViewById(R.id.number);
        number.setText("5");

        RelativeLayout background = (RelativeLayout)findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.ffth));

        nextpage = (ImageButton) findViewById(R.id.next);
        prevpage = (ImageButton) findViewById(R.id.prev);

        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5.this, Activity6.class);
                startActivity(intent);
            }
        });

        prevpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
