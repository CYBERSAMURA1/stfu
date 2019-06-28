package com.example.miha1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextpage = (ImageButton) findViewById(R.id.next);

        TextView number = (TextView)findViewById(R.id.number);
        number.setText("1");

        RelativeLayout background = (RelativeLayout)findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.fst));

        ImageButton prevpage =(ImageButton)findViewById(R.id.prev);
        prevpage.setVisibility(View.INVISIBLE);


        nextpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
    }
}




