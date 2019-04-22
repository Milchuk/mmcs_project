package com.example.main;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Monsters2 extends AppCompatActivity {

    private Chronometer mChronometer;
    private Button mButton;
    private TextView mTextView;
    private ImageButton[] buttons = new ImageButton[9];
    private int[] img = new int[10];
    public int ind = 5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters2);
        //инициализация
        buttons[0] = findViewById(R.id.imageButton7);
        buttons[1] = findViewById(R.id.imageButton8);
        buttons[2] = findViewById(R.id.imageButton9);
        buttons[3] = findViewById(R.id.imageButton10);
        buttons[4] = findViewById(R.id.imageButton11);
        buttons[5] = findViewById(R.id.imageButton12);
        buttons[6] = findViewById(R.id.imageButton13);
        buttons[7] = findViewById(R.id.imageButton14);
        buttons[8] = findViewById(R.id.imageButton15);
        img[0] = R.drawable.zombie1;
        img[1] = R.drawable.zombie2;
        img[2] = R.drawable.zombie3;
        img[3] = R.drawable.zombie4;
        img[4] = R.drawable.zombie5;
        img[5] = R.drawable.zombie6;
        img[6] = R.drawable.zombie7;
        img[7] = R.drawable.zombie8;
        img[8] = R.drawable.zombie9;
        img[9] = R.drawable.zombie10;


        //перемешивание
        Random rnd = new Random();
        for (int i = img.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = img[index];
            img[index] = img[i];
            img[i] = a;
        }
        for (int i = 0; i < 9; i++)
        {
            buttons[i].setImageResource(img[i]);
        }

        //установить видимость
        for (int i = 0; i < 9; i++)
        {
            buttons[i].setVisibility(View.VISIBLE);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                for (int i = 0; i < 9; i++)
                {
                    buttons[i].setVisibility(View.INVISIBLE);
                }

                Random rnd = new Random();

                for (int i = 0; i < 9; i++)
                {
                    buttons[i].setImageResource(img[i]);
                }
                ind = rnd.nextInt(8);
                buttons[ind].setImageResource(img[9]);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    public void run() {
                        for (int i = 0; i < 9; i++)
                        {
                            buttons[i].setVisibility(View.VISIBLE);
                        }
                        for (int i =0; i<9; i++)
                            if (i!=ind) buttons[i].setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    for (int i = 0; i < 9; i++)
                                    {
                                        buttons[i].setVisibility(View.INVISIBLE);
                                    }
                                    ImageView iv  =findViewById(R.id.imageView);
                                    iv.setBackgroundColor(getColor(R.color.red));
                                    //iv.setImageResource(R.drawable.incorrect);
                                    //iv.setBackgroundResource(R.color.trans);

                                }
                            });
                            else
                                buttons[i].setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View v)
                                    {
                                        for (int i = 0; i < 9; i++)
                                        {
                                            buttons[i].setVisibility(View.INVISIBLE);
                                        }
                                        ImageView iv  = findViewById(R.id.imageView);
                                        iv.setBackgroundColor(getColor(R.color.red));
                                        //iv.setImageResource(R.drawable.correct);
                                        // iv.setBackgroundResource(R.color.trans);


                                    }
                                });
                    }
                }, 3000);
            }
        }, 5000);



    }
}
