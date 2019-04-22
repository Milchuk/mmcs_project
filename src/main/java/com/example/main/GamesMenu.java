package com.example.main;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_menu);
        findViewById(R.id.button4).setEnabled(false);

        Typeface face = Typeface.createFromAsset(this.getAssets(), "fonts/13059.otf");
        Button bv = (Button)findViewById(R.id.button);
        bv.setTypeface(face);

        Button bv2 = (Button)findViewById(R.id.button3);
        bv2.setTypeface(face);

        Button bv3 = (Button)findViewById(R.id.button2);
        bv3.setTypeface(face);

    }

    public void MosaicOnClick(View view) {
        Intent intent = new Intent(GamesMenu.this, Mosaic.class);
        startActivity(intent);
    }

    public void MonstersOnClick(View view) {
        Intent intent2 = new Intent(GamesMenu.this, MonstersModeMenu.class);
        startActivity(intent2);

    }

    public void TableOnClick(View view) {
        Intent intent3 = new Intent(GamesMenu.this, TableMenu.class);
        startActivity(intent3);
    }
}
