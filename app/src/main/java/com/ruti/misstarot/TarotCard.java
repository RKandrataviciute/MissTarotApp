package com.ruti.misstarot;

public class TarotCard {

    private int mTarotimg;
    private String mTitle;
    private String mDescription;
    private String mAdvice;

    public TarotCard(int mTarotimg, String mTitle, String mDescription, String mAdvice) {
        this.mTarotimg = mTarotimg;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mAdvice = mAdvice;
    }


    public int getmTarotimg() {
        return mTarotimg;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAdvice() {
        return mAdvice;
    }
}
