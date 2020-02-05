package com.ruti.misstarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class TarotAdviceActivity extends AppCompatActivity {


    private ImageView mCardImage;
    private TextView mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarot_advice);

        final ArrayList <TarotCard> tarotDeck = CreateDeck();


        mCardImage = findViewById(R.id.card_image);
        mTitle = findViewById(R.id.card_title);

        mCardImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Random randomindex = new Random();
                int i=randomindex.nextInt(79);

                mCardImage.setImageResource(tarotDeck.get(i).getmTarotimg());
                mTitle.setText(tarotDeck.get(i).getmTitle());

                //more cards you shall not get
                mCardImage.setEnabled(false);
            }
        } );
    }








    private ArrayList CreateDeck() {


        ArrayList<TarotCard> tarotDeck = new ArrayList<>();


        //The Major Arcana

        tarotDeck.add(new TarotCard(R.drawable.thefool, "The Fool", "", R.string.fool_advice));
        tarotDeck.add(new TarotCard(R.drawable.themagician, "The Magician", "",R.string.magician_advice ));
        tarotDeck.add(new TarotCard(R.drawable.thehighpriestess, "The High Priestess", "", R.string.high_priestess_advice));
        tarotDeck.add(new TarotCard(R.drawable.thempress, "The Empress", "", R.string.empress_advice));
        tarotDeck.add(new TarotCard(R.drawable.themperor, "The Emperor", "", R.string.emperor_advice));
        tarotDeck.add(new TarotCard(R.drawable.thelovers, "The Lovers", "", R.string.lovers_advice));
        tarotDeck.add(new TarotCard(R.drawable.thehierophant, "The Hierophant", "", R.string.hierophant_advice));
        tarotDeck.add(new TarotCard(R.drawable.thechariot, "The Chariot", "", R.string.chariot_advice));
        tarotDeck.add(new TarotCard(R.drawable.strength, "Strength", "", R.string.strenght_advice));
        tarotDeck.add(new TarotCard(R.drawable.thehermit, "The Hermit", "", R.string.hermit_advice));
        tarotDeck.add(new TarotCard(R.drawable.thewheeloffortune, "The Wheel of Fortune", "", R.string.wheel_of_fortune_advice));
        tarotDeck.add(new TarotCard(R.drawable.justice, "Justice", "", R.string.justice_advice));
        tarotDeck.add(new TarotCard(R.drawable.thehangedman, "The Hanged Man", "", R.string.hanged_man_advice));
        tarotDeck.add(new TarotCard(R.drawable.death, "Death", "", R.string.death_advice));
        tarotDeck.add(new TarotCard(R.drawable.temperance, "Temperance", "", R.string.temperance_advice));
        tarotDeck.add(new TarotCard(R.drawable.thedevil, "The Devil", "", R.string.devil_advice));
        tarotDeck.add(new TarotCard(R.drawable.thetower, "The Tower", "", R.string.tower_advice));
        tarotDeck.add(new TarotCard(R.drawable.thestar, "The Star", "", R.string.star_advice));
        tarotDeck.add(new TarotCard(R.drawable.themoon, "The Moon", "", R.string.moon_advice));
        tarotDeck.add(new TarotCard(R.drawable.thesun, "The Sun", "", R.string.sun_advice));
        tarotDeck.add(new TarotCard(R.drawable.judgement, "Judgement", "", R.string.judgment_advice));
        tarotDeck.add(new TarotCard(R.drawable.theworld, "The World", "", R.string.world_advice));


        //The Minor Arcana

        //Wands



        tarotDeck.add(new TarotCard(R.drawable.aceofwands, "Ace of Wands","",R.string.wands_ace_advice));
        tarotDeck.add(new TarotCard(R.drawable.twoofwands, "Two of Wands","",R.string.wands_two_advice));
        tarotDeck.add(new TarotCard(R.drawable.threeofwands, "Three of Wands","",R.string.wands_three_advice));
        tarotDeck.add(new TarotCard(R.drawable.fourofwands, "Four of Wands","",R.string.wands_four_advice));
        tarotDeck.add(new TarotCard(R.drawable.fiveofwands, "Five of Wands","",R.string.wands_five_advice));
        tarotDeck.add(new TarotCard(R.drawable.sixofwands, "Six of Wands","",R.string.wands_six_advice));
        tarotDeck.add(new TarotCard(R.drawable.sevenofwands, "Seven of Wands","",R.string.wands_seven_advice));
        tarotDeck.add(new TarotCard(R.drawable.eightofwands, "Eight of Wands","",R.string.wands_eight_advice));
        tarotDeck.add(new TarotCard(R.drawable.nineofwands, "Nine of Wands", "", R.string.wands_nine_advice));
        tarotDeck.add(new TarotCard(R.drawable.tenofands, "Ten of Wands", "", R.string.wands_ten_advice));
        tarotDeck.add(new TarotCard(R.drawable.pageofands, "Page of Wands", "", R.string.wands_page_advice));
        tarotDeck.add(new TarotCard(R.drawable.knightofwands, "Knight of Wands", "", R.string.wands_knight_advice));
        tarotDeck.add(new TarotCard(R.drawable.queenofwands, "Queen of Wands", "", R.string.wands_queen_advice));
        tarotDeck.add(new TarotCard(R.drawable.kingofwands, "King of Wands", "", R.string.wands_king_advice));


        //Pentacles


        tarotDeck.add(new TarotCard(R.drawable.aceofentacles, "Ace of Pentacles", "", R.string.pentacles_ace_advice));
        tarotDeck.add(new TarotCard(R.drawable.twoofpentacles, "Two of Pentacles", "", R.string.pentacles_two_advice));
        tarotDeck.add(new TarotCard(R.drawable.threeofentacles, "Three of Pentacles","",R.string.pentacles_three_advice));
        tarotDeck.add(new TarotCard(R.drawable.fourofpentacles, "Four of Pentacles","",R.string.pentacles_four_advice));
        tarotDeck.add(new TarotCard(R.drawable.fiveofpentacles, "Five of Pentacles","",R.string.pentacles_five_advice));
        tarotDeck.add(new TarotCard(R.drawable.sixofpentacles, "Six of Pentacles","",R.string.pentacles_six_advice));
        tarotDeck.add(new TarotCard(R.drawable.sevenofpentacles, "Seven of Pentacles","",R.string.pentacles_seven_advice));
        tarotDeck.add(new TarotCard(R.drawable.eightofpentacles, "Eight of Pentacles","",R.string.pentacles_eight_advice));
        tarotDeck.add(new TarotCard(R.drawable.nineofpentacles, "Nine of Pentacles", "", R.string.pentacles_nine_advice));
        tarotDeck.add(new TarotCard(R.drawable.tenofpentacles, "Ten of Pentacles", "", R.string.pentacles_ten_advice));
        tarotDeck.add(new TarotCard(R.drawable.pageofpentacles, "Page of Pentacles", "", R.string.pentacles_page_advice));
        tarotDeck.add(new TarotCard(R.drawable.knightofpentacles, "Knight of Pentacles", "", R.string.pentacles_knight_advice));
        tarotDeck.add(new TarotCard(R.drawable.queenofpentacles, "Queen of Pentacles", "", R.string.pentacles_queen_advice));
        tarotDeck.add(new TarotCard(R.drawable.kingofpentacles, "King of Pentacles", "", R.string.pentacles_king_advice));

        //Cups


        tarotDeck.add(new TarotCard(R.drawable.aceofcups, "Ace of Cups", "", R.string.cups_ace_advice));
        tarotDeck.add(new TarotCard(R.drawable.twoofcups, "Two of Cups", "", R.string.cups_two_advice));
        tarotDeck.add(new TarotCard(R.drawable.threeofcups, "Three of Cups","",R.string.cups_three_advice));
        tarotDeck.add(new TarotCard(R.drawable.fourofcups, "Four of Cups","",R.string.cups_four_advice));
        tarotDeck.add(new TarotCard(R.drawable.fiveofcups, "Five of Cups","",R.string.cups_five_advice));
        tarotDeck.add(new TarotCard(R.drawable.sifofcups, "Six of Cups","",R.string.cups_six_advice));
        tarotDeck.add(new TarotCard(R.drawable.sevenofcups, "Seven of Cups","",R.string.cups_seven_advice));
        tarotDeck.add(new TarotCard(R.drawable.eightofcups, "Eight of Cups","",R.string.cups_eight_advice));
        tarotDeck.add(new TarotCard(R.drawable.nineofcups, "Nine of Cups", "", R.string.cups_nine_advice));
        tarotDeck.add(new TarotCard(R.drawable.tenofcups, "Ten of Cups", "", R.string.cups_ten_advice));
        tarotDeck.add(new TarotCard(R.drawable.pageofcups, "Page of Cups", "", R.string.cups_page_advice));
        tarotDeck.add(new TarotCard(R.drawable.knightofcups, "Knight of Cups", "", R.string.cups_knight_advice));
        tarotDeck.add(new TarotCard(R.drawable.queenofcups, "Queen of Cups", "", R.string.cups_queen_advice));
        tarotDeck.add(new TarotCard(R.drawable.kingofcups, "King of Cups", "", R.string.cups_king_advice));


        //Swords

        tarotDeck.add(new TarotCard(R.drawable.aceofcups, "Ace of Swords", "", R.string.swords_ace_advice));
        tarotDeck.add(new TarotCard(R.drawable.twoofcups, "Two of Swords", "", R.string.swords_two_advice));
        tarotDeck.add(new TarotCard(R.drawable.threeofcups, "Three of Swords","",R.string.swords_three_advice));
        tarotDeck.add(new TarotCard(R.drawable.fourofcups, "Four of Swords","",R.string.swords_four_advice));
        tarotDeck.add(new TarotCard(R.drawable.fiveofcups, "Five of Swords","",R.string.swords_five_advice));
        tarotDeck.add(new TarotCard(R.drawable.sifofcups, "Six of Swords","",R.string.swords_six_advice));
        tarotDeck.add(new TarotCard(R.drawable.sevenofcups, "Seven of Swords","",R.string.swords_seven_advice));
        tarotDeck.add(new TarotCard(R.drawable.eightofcups, "Eight of Swords","",R.string.swords_eight_advice));
        tarotDeck.add(new TarotCard(R.drawable.nineofcups, "Nine of Swords", "", R.string.swords_nine_advice));
        tarotDeck.add(new TarotCard(R.drawable.tenofcups, "Ten of Swords", "", R.string.swords_ten_advice));
        tarotDeck.add(new TarotCard(R.drawable.pageofcups, "Page of Swords", "", R.string.swords_page_advice));
        tarotDeck.add(new TarotCard(R.drawable.knightofcups, "Knight of Swords", "", R.string.swords_knight_advice));
        tarotDeck.add(new TarotCard(R.drawable.queenofcups, "Queen of Swords", "", R.string.swords_queen_advice));
        tarotDeck.add(new TarotCard(R.drawable.kingofcups, "King of Swords", "", R.string.swords_king_advice));





        return tarotDeck;

    }
}
