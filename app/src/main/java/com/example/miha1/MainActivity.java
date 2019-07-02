package com.example.miha1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String KEY_NUMBER = "number";

    ImageButton btnNextPage, btnPrevPage;

    Button btnStart;

    TextView pageNumber;

    RelativeLayout background;

    int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextPage = findViewById(R.id.next);
        btnPrevPage = findViewById(R.id.prev);

        btnStart = findViewById(R.id.start);

        pageNumber = (TextView) findViewById(R.id.number);


        final int keyNumber = getIntent().getIntExtra(KEY_NUMBER, 1); //здесь ты должен тоже получить инт по ключу KEY_NUMBER
        //это значение будет в том случае если  getIntent().getIntExtra(KEY_NUMBER,1) будет нулл , тоесть при первом запуске активити будет нулл
        // тк мы еще никуда не нажимали чтоб получать даннык
        a = keyNumber;

        pageNumber.setText(String.format("%d", keyNumber));

//теперь тебе надо получить данные по ключу ключ у тебя "number" - это константа лучше вынеси ее

//       name  - String slishish men


        background = findViewById(R.id.background);
        background.setBackgroundColor(getRandBackgroundColor());

        if (keyNumber == 1) {
            btnPrevPage.setVisibility(View.INVISIBLE);
        }

        if (keyNumber == 7) {
            btnNextPage.setVisibility(View.INVISIBLE);
        }

        if(keyNumber > 1) {
            btnStart.setVisibility(View.INVISIBLE);
        }

        btnNextPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (keyNumber <= 6) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    intent.putExtra(KEY_NUMBER, a + 1);//вот здесь ты ложишь в интент значение а+1 - эот интейджр
                    startActivity(intent);
                }

            }
        });

        btnPrevPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        background.setBackgroundColor(getRandBackgroundColor());
    }


    private int getRandBackgroundColor() {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        return color;
    }
}

//крч давай сейчас сделай чтоб на первом активити была кнопка старт и открывалось другое активити новое, создай его

//вот точно исправь ее

