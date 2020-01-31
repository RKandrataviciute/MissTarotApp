package com.ruti.misstarot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView advice = findViewById(R.id.tarot_advice_text);
        final TextView birthCard = findViewById(R.id.birth_card_text);



        advice.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent adviceIntent = new Intent(MainActivity.this, TarotAdviceActivity.class);
                startActivity(adviceIntent);
            }
        });

        birthCard.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent birthCardIntent = new Intent(MainActivity.this, BirthCardActivity.class);
                startActivity(birthCardIntent);
            }
        });
    }
}
