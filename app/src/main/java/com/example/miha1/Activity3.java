package com.example.miha1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

    }

    public void nextpage(View v) {
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }

    public void prevpage(View v){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}