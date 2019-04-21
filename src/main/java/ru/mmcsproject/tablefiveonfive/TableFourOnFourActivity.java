package ru.mmcsproject.tablefiveonfive;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;



public class TableFourOnFourActivity extends AppCompatActivity {

    private Chronometer mChronometer;
    private Button mButton;
    private TextView mTextView;
    private Button[] buttons = new Button[16];
    private int k = 1;
    long StartTime;
    private String value;
    private String mixing;
    private ArrayList<Integer> list = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_table_four_on_four);
        mButton = findViewById(R.id.button26);
        mTextView = findViewById(R.id.textView);
        mChronometer = findViewById(R.id.chronometer);
        Intent intent = getIntent();
        value = intent.getStringExtra("value");
        mixing = intent.getStringExtra("mixing");

    }



    public void onClickRandm4(View view) {
        String text = ((Button) view).getText().toString();

        if (value.equals("Арабские цифры") && mixing.equals("Да") && text.equals(Integer.toString(k)) && (k != 16)) {
            list = new ArrayList<>();
            for (int i = 1; i < 17; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(list.get(i).toString());
            }
        }
        if (value.equals("Арабские цифры")) {
            if (text.equals(Integer.toString(k))) {
                mTextView.setText("Найдите " + Integer.toString(k + 1));
                k++;
            }
        }


        if (value.equals("Русские буквы") && mixing.equals("Да") && text.equals(FromDigitsToLetters(Integer.toString(k))) && (k != 16)) {
            list = new ArrayList<>();
            for (int i = 1; i < 17; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromDigitsToLetters(list.get(i).toString()));
            }
        }
        if (value.equals("Русские буквы")) {
            if (text.equals(FromDigitsToLetters(Integer.toString(k)))) {
                mTextView.setText("Найдите " + FromDigitsToLetters(Integer.toString(k + 1)));
                k++;
            }
        }

        if (value.equals("Римские цифры") && mixing.equals("Да") && text.equals(FromRomansDigitsToLetters(Integer.toString(k))) && (k != 16)) {
            list = new ArrayList<>();
            for (int i = 1; i < 17; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromRomansDigitsToLetters(list.get(i).toString()));
            }
        }
        if (value.equals("Римские цифры")) {
            if (text.equals(FromRomansDigitsToLetters(Integer.toString(k)))) {
                mTextView.setText("Найдите " + FromRomansDigitsToLetters(Integer.toString(k + 1)));
                k++;
            }
        }

        if (value.equals("Английские буквы") && mixing.equals("Да") && text.equals(FromDigitsToEnglishLetters(Integer.toString(k))) && (k != 16)) {
            list = new ArrayList<>();
            for (int i = 1; i < 17; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromDigitsToEnglishLetters(list.get(i).toString()));
            }
        }
        if (value.equals("Английские буквы")) {
            if (text.equals(FromDigitsToEnglishLetters(Integer.toString(k)))) {
                mTextView.setText("Найдите " + FromDigitsToEnglishLetters(Integer.toString(k + 1)));
                k++;
            }
        }

        if (k==17) {
            mChronometer.stop();
            long elapsedTimeMills = System.currentTimeMillis() - StartTime;
            final long sec = elapsedTimeMills / 1000;
            final int min = (int)(sec % 3600)/60;
            final int seconds = (int)sec % 60;
            mTextView.setText(String.format("    Игра окончена! \n Ваше время: %02d:%02d", min, seconds));
            mChronometer.setVisibility(View.INVISIBLE);
            k++;
        }
    }

    public void onClicck4(View view) {
        k = 1;
        buttons[0] = findViewById(R.id.button);
        buttons[1] = findViewById(R.id.button2);
        buttons[2] = findViewById(R.id.button3);
        buttons[3] = findViewById(R.id.button4);
        buttons[4] = findViewById(R.id.button6);
        buttons[5] = findViewById(R.id.button7);
        buttons[6] = findViewById(R.id.button8);
        buttons[7] = findViewById(R.id.button9);
        buttons[8] = findViewById(R.id.button11);
        buttons[9] = findViewById(R.id.button12);
        buttons[10] = findViewById(R.id.button13);
        buttons[11] = findViewById(R.id.button14);
        buttons[12] = findViewById(R.id.button16);
        buttons[13] = findViewById(R.id.button17);
        buttons[14] = findViewById(R.id.button18);
        buttons[15] = findViewById(R.id.button19);


        for (int i = 0; i < 16; i++) {
            buttons[i].setVisibility(View.VISIBLE);
        }
        mTextView.setVisibility(View.VISIBLE);
        mChronometer.setVisibility(View.VISIBLE);

        list = new ArrayList<>();
        for (int i = 1; i < 17; i++) {
            list.add(new Integer(i));
        }

        if (value.equals("Арабские цифры")) {
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(list.get(i).toString());
            }

            mTextView.setText("Найдите 1");
        }

        if (value.equals("Русские буквы")) {
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromDigitsToLetters(list.get(i).toString()));
            }

            mTextView.setText("Найдите А");
        }

        if (value.equals("Римские цифры")) {
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromRomansDigitsToLetters(list.get(i).toString()));
            }

            mTextView.setText("Найдите I");
        }

        if (value.equals("Английские буквы")) {
            Collections.shuffle(list);
            for (int i = 0; i < 16; i++) {
                buttons[i].setText(FromDigitsToEnglishLetters(list.get(i).toString()));
            }

            mTextView.setText("Найдите А");
        }

        mChronometer.setBase(SystemClock.elapsedRealtime());
        mChronometer.start();

        StartTime = System.currentTimeMillis();
    }

    public static String FromDigitsToLetters(String s) {
        String res = "";
        switch (s) {
            case "1":
                res = "А";
                break;
            case "2":
                res = "Б";
                break;
            case "3":
                res = "В";
                break;
            case "4":
                res = "Г";
                break;
            case "5":
                res = "Д";
                break;
            case "6":
                res = "Е";
                break;
            case "7":
                res = "Ё";
                break;
            case "8":
                res = "Ж";
                break;
            case "9":
                res = "З";
                break;
            case "10":
                res = "И";
                break;
            case "11":
                res = "Й";
                break;
            case "12":
                res = "К";
                break;
            case "13":
                res = "Л";
                break;
            case "14":
                res = "М";
                break;
            case "15":
                res = "Н";
                break;
            case "16":
                res = "О";
                break;
        }
        return res;
    }

    public static String FromRomansDigitsToLetters(String s) {
        String res = "";
        switch (s) {
            case "1":
                res = "I";
                break;
            case "2":
                res = "II";
                break;
            case "3":
                res = "III";
                break;
            case "4":
                res = "IV";
                break;
            case "5":
                res = "V";
                break;
            case "6":
                res = "VI";
                break;
            case "7":
                res = "VII";
                break;
            case "8":
                res = "VIII";
                break;
            case "9":
                res = "IX";
                break;
            case "10":
                res = "X";
                break;
            case "11":
                res = "XI";
                break;
            case "12":
                res = "XII";
                break;
            case "13":
                res = "XIII";
                break;
            case "14":
                res = "XIV";
                break;
            case "15":
                res = "XV";
                break;
            case "16":
                res = "XVI";
                break;
        }
        return res;
    }
    public static String FromDigitsToEnglishLetters(String s) {
        String res = "";
        switch (s) {
            case "1":
                res = "A";
                break;
            case "2":
                res = "B";
                break;
            case "3":
                res = "C";
                break;
            case "4":
                res = "D";
                break;
            case "5":
                res = "E";
                break;
            case "6":
                res = "F";
                break;
            case "7":
                res = "G";
                break;
            case "8":
                res = "H";
                break;
            case "9":
                res = "I";
                break;
            case "10":
                res = "J";
                break;
            case "11":
                res = "K";
                break;
            case "12":
                res = "L";
                break;
            case "13":
                res = "M";
                break;
            case "14":
                res = "N";
                break;
            case "15":
                res = "O";
                break;
            case "16":
                res = "P";
                break;
        }
        return res;
    }
}