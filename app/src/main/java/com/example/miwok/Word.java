package com.example.miwok;

public class Word {
    private String english;
    private String miwok;

    public Word(String eng, String miw){
        this.english = eng;
        this.miwok = miw;
    }


    public String getEnglish() {
        return english;
    }

    public String getMiwok() {
        return miwok;
    }
}
