package ru.mmcsproject.tablefiveonfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.view.WindowManager;

public class Firsttactivity extends AppCompatActivity {

    Spinner mSpinnerChoice ;
    Spinner mSpinnerMix;
    Spinner mSpinnerSizeOfTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttactivity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

    }

    public void onCLick(View view) {

        mSpinnerChoice = findViewById(R.id.spinner_choice_digits);
        mSpinnerMix = findViewById(R.id.spinner_mixing);
        mSpinnerSizeOfTable = findViewById(R.id.spinner_sizeoftable);


        String selected = mSpinnerSizeOfTable.getSelectedItem().toString();

        if (selected.equals("4 X 4")) {
            Intent intent = new Intent(Firsttactivity.this, TableFourOnFourActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("5 X 5")) {
            Intent intent = new Intent(Firsttactivity.this, MainActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("6 X 6")) {
            Intent intent = new Intent(Firsttactivity.this, TableSixOnSixActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }

        if (selected.equals("7 X 7")) {
            Intent intent = new Intent(Firsttactivity.this, TableSevenOnSevenActivity.class);
            intent.putExtra("value", mSpinnerChoice.getSelectedItem().toString());
            intent.putExtra("mixing",mSpinnerMix.getSelectedItem().toString());
            startActivity(intent);
        }
    }
}
