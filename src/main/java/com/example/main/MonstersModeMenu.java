package com.example.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MonstersModeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters_mode_menu);
    }

    public void EasyStartOnClick(View view) {
        Intent intent = new Intent(MonstersModeMenu.this, Monsters.class);
        startActivity(intent);
    }

    public void MediumStartOnClick(View view) {
        Intent intent = new Intent(MonstersModeMenu.this, Monsters2.class);
        startActivity(intent);
    }

    public void HardStartOnClick(View view) {
        Intent intent3 = new Intent(MonstersModeMenu.this, Monsters3.class);
        startActivity(intent3);
    }
}
