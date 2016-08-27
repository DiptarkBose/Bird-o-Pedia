package com.example.android.bird_o_pedia;

/**
 * Created by MAHE on 8/7/2016.
 */
public class BirdDescription {

    private String BirdType;
    private String population;
    private int ImageResourceID;
    public BirdDescription(String birdNameEnglish, String birdNameLatin, int imgRes){
        BirdType = birdNameEnglish;
        population = birdNameLatin;
        ImageResourceID = imgRes;
    }
    public String getNameOfTheBirdEnglish(){
        return BirdType;
    }
    public String getNameofTheBirdLatin(){
        return population;
    }
    public int getImageResourceID(){
        return ImageResourceID;
    }

}