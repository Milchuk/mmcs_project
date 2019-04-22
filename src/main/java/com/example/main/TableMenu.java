package com.example.main;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class TableMenu extends AppCompatActivity {

    Spinner mSpinnerChoice;
    Spinner mSpinnerMix;
    Spinner mSpinnerSizeOfTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_menu);

    }

    public void onCLick(View view) {

        mSpinnerChoice = findViewById(R.id.spinner_choice_digits);
        mSpinnerMix = findViewById(R.id.spinner_3);
        mSpinnerSizeOfTable = findViewById(R.id.spinner_sizeoftable);


        String selected = mSpinnerSizeOfTable.getSelectedItem().toString();

        if (selected.equals("4 X 4")) {
            Intent intent = new Intent(TableMenu.this, TableFourOnFourActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("5 X 5")) {
            Intent intent = new Intent(TableMenu.this, TableFiveOnFiveActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("6 X 6")) {
            Intent intent = new Intent(TableMenu.this, TableSixOnSixActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("7 X 7")) {
            Intent intent = new Intent(TableMenu.this, TableSevenOnSevenActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }
    }
}
