package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;



public class MainActivity extends AppCompatActivity {
    ImageView marioBlock;
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Überprüfe die aktuelle Bildschirmausrichtung
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Landschaftsausrichtung - Führe die erforderlichen Anpassungen durch
            // ...
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Porträtausrichtung - Führe die erforderlichen Anpassungen durch
            // ...
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marioBlock = findViewById(R.id.marioBlock);
        marioBlock.setImageResource(R.drawable.mario_block);
        Glide.with(marioBlock)
                .asGif()
                .load(R.drawable.mario_block)
                .into(marioBlock);
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
