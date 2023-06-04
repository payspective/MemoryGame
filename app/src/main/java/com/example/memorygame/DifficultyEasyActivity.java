package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Configuration;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifficultyEasyActivity extends AppCompatActivity {

    TextView    player1, player2, winnerText;

    ImageView   image1, image2, image3, image4,
            image5, image6, image7, image8,
            image9, image10, image11, image12,
            image13, image14, image15, image16;

    List<ImageView> tilesList;

    List<Integer> imageList;

    int clickNumber = 1;
    int click1Value = 0;
    int click2Value = 0;

    int counter = 0;
    Button returnButton;


    int currentPlayer = 1;

    //points

    int player1Points = 0;
    int player2Points = 0;

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
        setContentView(R.layout.activity_difficulty_easy);

        returnButton = findViewById(R.id.returnButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Schließt die aktuelle Activity und kehrt zur MainActivity zurück
            }
        });


        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        winnerText = findViewById(R.id.winnerText);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);

        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);

        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);

        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);

        tilesList = new ArrayList<>();

        tilesList.add(image1);
        tilesList.add(image2);
        tilesList.add(image3);
        tilesList.add(image4);

        tilesList.add(image5);
        tilesList.add(image6);
        tilesList.add(image7);
        tilesList.add(image8);

        tilesList.add(image9);
        tilesList.add(image10);
        tilesList.add(image11);
        tilesList.add(image12);

        tilesList.add(image13);
        tilesList.add(image14);
        tilesList.add(image15);
        tilesList.add(image16);

        //images
        imageList = new ArrayList<>();

        imageList.add(R.drawable.burger);
        imageList.add(R.drawable.sausage);
        imageList.add(R.drawable.pepper);
        imageList.add(R.drawable.marshmallow);

        imageList.add(R.drawable.ketchup);
        imageList.add(R.drawable.hotdog);
        imageList.add(R.drawable.chips);
        imageList.add(R.drawable.fire);

        imageList.add(R.drawable.burger);
        imageList.add(R.drawable.sausage);
        imageList.add(R.drawable.pepper);
        imageList.add(R.drawable.marshmallow);

        imageList.add(R.drawable.ketchup);
        imageList.add(R.drawable.hotdog);
        imageList.add(R.drawable.chips);
        imageList.add(R.drawable.fire);


        //start the game - shuffle the images

        Collections.shuffle(imageList);

        //enable all the tiles
        for (ImageView imageView : tilesList) {
            imageView.setEnabled(true);
        }

        //clicks

        image1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image1, 0);
            }
        });

        image2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image2, 1);
            }
        });

        image3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image3, 2);
            }
        });

        image4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image4, 3);
            }
        });

        image5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image5, 4);
            }
        });

        image6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image6, 5);
            }
        });

        image7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image7, 6);
            }
        });

        image8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image8, 7);
            }
        });

        image9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image9, 8);
            }
        });

        image10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image10, 9);
            }
        });

        image11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image11, 10);
            }
        });

        image12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image12, 11);
            }
        });

        image13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image13, 12);
            }
        });

        image14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image14, 13);
            }
        });

        image15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image15, 14);
            }
        });

        image16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                buttonClick(image16, 15);
            }
        });
    }

    private void buttonClick(ImageView image, int number) {
        if (clickNumber == 1) {
            image.setImageResource(imageList.get(number));
            clickNumber = 2;
            click1Value = number +1;
        } else if (clickNumber == 2) {
            image.setImageResource(imageList.get(number));
            clickNumber = 1;
            click2Value = number +1;

            compareTiles();
        }
    }

    private void switchPlayer() {
        if (currentPlayer==1) {
            currentPlayer = 2;

            player1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.grey));
            player2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
        } else if (currentPlayer ==2) {
            currentPlayer = 1;

            player1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            player2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.grey));
        }
    }


    private void compareTiles() {

        //disable all the tiles
        for (ImageView imageView : tilesList) {
            imageView.setEnabled(false);
        }
        if (imageList.get(click1Value-1).equals(imageList.get(click2Value-1))) {
            //same images

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //remove tiles
                    tilesList.get(click1Value-1).setVisibility(View.INVISIBLE);
                    tilesList.get(click2Value-1).setVisibility(View.INVISIBLE);

                    //points
                    if (currentPlayer == 1) {
                        player1Points++;
                        player1.setText("Player1: "+player1Points);
                    } else if (currentPlayer == 2) {
                        player2Points++;
                        player2.setText("Player2: "+player2Points);
                    }

                    //game finished??
                    counter++;
                    if (counter == 8) {
                        showWinner();
                    }

                    //enable all the tiles
                    for (ImageView imageView : tilesList) {
                        imageView.setEnabled(true);
                    }
                }
            }, 1000);
        } else {
            //different images
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //flip tiles
                    tilesList.get(click1Value-1).setImageResource(R.drawable.questionmark);
                    tilesList.get(click2Value-1).setImageResource(R.drawable.questionmark);

                    switchPlayer();

                    //enable all the tiles
                    for (ImageView imageView : tilesList) {
                        imageView.setEnabled(true);
                    }
                }
            }, 1000);
        }
    }

    private void showWinner() {
        // Disable all the tiles
        for (ImageView imageView : tilesList) {
            imageView.setEnabled(false);
        }

        // Show the winner based on points
        if (player1Points > player2Points) {
            winnerText.setText("Player 1 wins!");
        } else if (player2Points > player1Points) {
            winnerText.setText("Player 2 wins!");
        } else {
            winnerText.setText("It's a tie!");
        }

        winnerText.setVisibility(View.VISIBLE);
    }
}