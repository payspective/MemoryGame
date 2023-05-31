package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startEasyActivity(View view) {
        Intent intent = new Intent(this, DifficultyEasyActivity.class);
        startActivity(intent);
    }

    public void startHardActivity(View view) {
        Intent intent = new Intent(this, DifficultyHardActivity.class);
        startActivity(intent);
    }
}
