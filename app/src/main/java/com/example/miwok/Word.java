package com.example.miwok;

public class Word {
    private String english;
    private String miwok;
    private int audioResourceId;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param eng is the english word
     * @param miw is the miwok translation of the english word
     */
    public Word(String eng, String miw, int audioResourceId){
        this.english = eng;
        this.miwok = miw;
        this.audioResourceId = audioResourceId;
    }

    /** The second constructor
     *
     * @param eng is the english word
     * @param miw is the miwok translation of the english word
     * @param imageRes is the image resource ID for the image asset
     */
    public Word(String eng, String miw, int imageRes,int audioResourceId){
        this.miwok = miw;
        this.english = eng;
        this.imageResourceId = imageRes;
        this.audioResourceId = audioResourceId;
    }


    //the getter for the english word
    public String getEnglish() {
        return english;
    }

    public String getMiwok() {
        return miwok;
    }



    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * returns whether or not there is an image
     * @return
     */
    public boolean hasImage(){

        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "english='" + english + '\'' +
                ", miwok='" + miwok + '\'' +
                ", audioResourceId=" + audioResourceId +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
