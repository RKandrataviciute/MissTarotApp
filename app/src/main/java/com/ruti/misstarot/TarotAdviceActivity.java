package com.ruti.misstarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class TarotAdviceActivity extends AppCompatActivity {


    private ImageView mCardImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarot_advice);

        final ArrayList <TarotCard> tarotDeck = CreateDeck();


        mCardImage = findViewById(R.id.card_image);

        mCardImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random randomindex = new Random();
                mCardImage.setImageResource(tarotDeck.get(randomindex.nextInt(23)).getmTarotimg());
            }
        } );
    }






    /*mButtonAdd = findViewById(R.id.button_add);
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Open Add Story Activity

                Intent addStoryIntent = new Intent(MainActivity.this, AddStoryActivity.class);
                startActivity(addStoryIntent);
                //addStory();
                // mStories.add(new Story(R.drawable.catadd, "6789595868", "Pilkos kates naujai pridetos", "fhjjhggfffghjhgfgh"));
                //mAdapter.notifyItemInserted(mStories.size()-1);


            } */

    private ArrayList CreateDeck() {


        ArrayList<TarotCard> tarotDeck = new ArrayList<>();


        //The Major Arcana

        tarotDeck.add(new TarotCard(R.drawable.thefool, "The Fool", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.themagician, "The Magician", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thehighpriestess, "The High Priestess", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thempress, "The Empress", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.themperor, "The Emperor", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thelovers, "The Lovers", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thechariot, "The Chariot", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.strength, "Strength", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thehermit, "The Hermit", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thewheeloffortune, "The Wheel of Fortune", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.justice, "Justice", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thehangedman, "The Hanged Man", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.death, "Death", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.temperance, "Temperance", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thedevil, "The Devil", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thetower, "The Tower", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thestar, "The Star", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.themoon, "The Moon", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.thesun, "The Sun", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.judgement, "Judgement", "", ""));
        tarotDeck.add(new TarotCard(R.drawable.theworld, "The World", "", ""));


        //The Minor Arcana



        /*

        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant","",""));


*/


        return tarotDeck;

    }
}
