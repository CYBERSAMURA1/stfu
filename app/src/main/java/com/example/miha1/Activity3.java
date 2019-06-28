package com.example.miha1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Activity3 extends AppCompatActivity {

ImageButton btnNextPage, btnPrevPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView)findViewById(R.id.number);
        number.setText("3");

        RelativeLayout background = (RelativeLayout)findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.thrd));

        btnNextPage = (ImageButton)findViewById(R.id.next);
        btnPrevPage = (ImageButton)findViewById(R.id.prev);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this,Activity4.class);
                startActivity(intent);
            }
        });

        btnPrevPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

//    public void nextpage(View v) {
//        Intent intent = new Intent(this,Activity4.class);
//        startActivity(intent);
//    }
//
//    public void prevpage(View v){
//        this.finish();
//    }
}