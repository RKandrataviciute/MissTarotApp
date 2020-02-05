package com.ruti.misstarot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class BirthCardActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private EditText mBirthdate;
    private TextView mBirthNumberText;
    private TextView mCardsDescription;
    private TextView mCardsDescriptionPersonality;
    private ImageView mSoulCardImage;
    private ImageView mPersonalityCardImage;
    private TextView mSoulAndPersonality;
    private TextView mSoulCard;
    private TextView mPersonalityCard;
    private String mYear;
    private String mMonth;
    private String mDay;


    private int mBirthNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_card);

        mBirthNumberText = findViewById(R.id.birth_number);
        mCardsDescription = findViewById(R.id.soul_personality_card_description); //soul and personality card description or just soul card description
        mCardsDescriptionPersonality = findViewById(R.id.personality_card_description); //Personality card description
        mBirthdate = findViewById(R.id.date_of_birth);
        mSoulCardImage = findViewById(R.id.soul_card_image);
        mPersonalityCardImage = findViewById(R.id.personality_card_image);
        mSoulAndPersonality = findViewById(R.id.soul_and_personality);// Your soul and personality card
        mSoulCard = findViewById(R.id.soul_card); //Your soul card
        mPersonalityCard = findViewById(R.id.personality_card);//Your personality card


        //Setting visibility as gone as it depends on birth card number
        mSoulAndPersonality.setVisibility(View.GONE);
        mSoulCard.setVisibility(View.GONE);
        mPersonalityCard.setVisibility(View.GONE);


        mBirthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDatePickerDialog();


            }
        });











    }

    private String BirthCardCounter() {

        String s = mYear + mMonth + mDay;

        mBirthNumber = Integer.parseInt(s);

        int sum = 0;

        while (mBirthNumber > 22) {

            while (mBirthNumber != 0) {

                sum = sum + mBirthNumber % 10;
                mBirthNumber = mBirthNumber / 10;
            }

            mBirthNumber = sum;
            sum = 0;
        }

        return String.valueOf(mBirthNumber);
    }


    public void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                android.R.style.Theme_Material_Dialog_Alert,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));


        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        mYear = String.valueOf(year);
        mMonth = String.valueOf(month + 1);
        mDay = String.valueOf(dayOfMonth);

        mBirthdate.setText(mYear + " - " + mMonth + " - " + mDay);
        mBirthNumberText.setText(BirthCardCounter());
        ShowBirthCardInfo(mBirthNumber);

    }

    private void setVisibilityForSoulAndPersonality (int cardNumber){

        if (cardNumber<10)
        {
            mSoulCard.setVisibility(View.GONE);
            mPersonalityCard.setVisibility(View.GONE);
            mSoulAndPersonality.setVisibility(View.VISIBLE);
        }
        else
        {
            mSoulAndPersonality.setVisibility(View.GONE);
            mSoulCard.setVisibility(View.VISIBLE);
            mPersonalityCard.setVisibility(View.VISIBLE);
        }
    }


    private void ShowBirthCardInfo (int cardNumber){

        switch (cardNumber) {

            case 2: {

                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehighpriestess);
                mPersonalityCardImage.setImageResource(R.drawable.thehighpriestess);
                mCardsDescription.setText(R.string.high_priestess);
            }
                break;
            case 3: {
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thempress);
                mPersonalityCardImage.setImageResource(R.drawable.thempress);
                mCardsDescription.setText(R.string.empress);
            }
                break;
            case 4: {
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.themperor);
                mPersonalityCardImage.setImageResource(R.drawable.themperor);
                mCardsDescription.setText(R.string.emperor);
            }
                break;
            case 5:{
                mSoulCard.setVisibility(View.GONE);
                mPersonalityCard.setVisibility(View.GONE);
                mSoulAndPersonality.setVisibility(View.VISIBLE);
                mSoulCardImage.setImageResource(R.drawable.thehierophant);
                mPersonalityCardImage.setImageResource(R.drawable.thehierophant);
                mCardsDescription.setText(R.string.hierophant);
            }
                break;
            case 6:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thelovers);
                mPersonalityCardImage.setImageResource(R.drawable.thelovers);
                mCardsDescription.setText(R.string.lovers);
            }
                break;
            case 7:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thechariot);
                mPersonalityCardImage.setImageResource(R.drawable.thechariot);
                mCardsDescription.setText(R.string.chariot);
            }
                break;
            case 8:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.justice);
                mPersonalityCardImage.setImageResource(R.drawable.justice);
                mCardsDescription.setText(R.string.justice);
            }
                break;
            case 9:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehermit);
                mPersonalityCardImage.setImageResource(R.drawable.thehermit);
                mCardsDescription.setText(R.string.hermit);
            }
                break;
            case 10:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.themagician);
                mPersonalityCardImage.setImageResource(R.drawable.thewheeloffortune);
                mCardsDescription.setText(R.string.magician);
                mCardsDescriptionPersonality.setText(R.string.wheel_of_fortune);
            }
                break;
            case 11:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehighpriestess);
                mPersonalityCardImage.setImageResource(R.drawable.strength);
                mCardsDescription.setText(R.string.high_priestess);
                mCardsDescriptionPersonality.setText(R.string.strength);
            }
                break;
            case 12:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thempress);
                mPersonalityCardImage.setImageResource(R.drawable.thehangedman);
                mCardsDescription.setText(R.string.empress);
                mCardsDescriptionPersonality.setText(R.string.hanged_man);
            }
                break;
            case 13:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.themperor);
                mPersonalityCardImage.setImageResource(R.drawable.death);
                mCardsDescription.setText(R.string.emperor);
                mCardsDescriptionPersonality.setText(R.string.death);
            }
                break;
            case 14:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehierophant);
                mPersonalityCardImage.setImageResource(R.drawable.temperance);
                mCardsDescription.setText(R.string.hierophant);
                mCardsDescriptionPersonality.setText(R.string.temperance);
            }
                break;
            case 15:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thelovers);
                mPersonalityCardImage.setImageResource(R.drawable.thedevil);
                mCardsDescription.setText(R.string.lovers);
                mCardsDescriptionPersonality.setText(R.string.devil);
            }
                break;
            case 16:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thechariot);
                mPersonalityCardImage.setImageResource(R.drawable.thetower);
                mCardsDescription.setText(R.string.chariot);
                mCardsDescriptionPersonality.setText(R.string.tower);
            }
                break;
            case 17:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.justice);
                mPersonalityCardImage.setImageResource(R.drawable.thestar);
                mCardsDescription.setText(R.string.justice);
                mCardsDescriptionPersonality.setText(R.string.star);
            }
                break;
            case 18:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehermit);
                mPersonalityCardImage.setImageResource(R.drawable.themoon);
                mCardsDescription.setText(R.string.hermit);
                mCardsDescriptionPersonality.setText(R.string.moon);
            }
                break;
            case 19:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.themagician);
                mPersonalityCardImage.setImageResource(R.drawable.thesun);
                mCardsDescription.setText(R.string.magician);
                mCardsDescriptionPersonality.setText(R.string.sun);
            }
                break;
            case 20:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thehighpriestess);
                mPersonalityCardImage.setImageResource(R.drawable.judgement);
                mCardsDescription.setText(R.string.high_priestess);
                mCardsDescriptionPersonality.setText(R.string.judgement);
            }
                break;
            case 21:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.thempress);
                mPersonalityCardImage.setImageResource(R.drawable.theworld);
                mCardsDescription.setText(R.string.empress);
                mCardsDescriptionPersonality.setText(R.string.world);
            }
                break;
            case 22:{
                setVisibilityForSoulAndPersonality(cardNumber);
                mSoulCardImage.setImageResource(R.drawable.themperor);
                mPersonalityCardImage.setImageResource(R.drawable.thefool);
                mCardsDescription.setText(R.string.emperor);
                mCardsDescriptionPersonality.setText(R.string.fool);
            }
                break;
        }



    }


}
