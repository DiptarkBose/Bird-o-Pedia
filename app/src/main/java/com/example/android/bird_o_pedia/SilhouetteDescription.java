package com.example.android.bird_o_pedia;

/**
 * Created by MAHE on 8/7/2016.
 */
public class SilhouetteDescription {

    private String BirdType;
    private String population;
    private int ImageResourceID;
    public SilhouetteDescription(String birdSpeciesName, String varietynumber, int imgRes){
        BirdType = birdSpeciesName;
        population = varietynumber;
        ImageResourceID = imgRes;
    }
    public String getNameOfTheBirdEnglish(){
        return BirdType;
    }
    public String getPopulation(){
        return population;
    }
    public int getImageResourceID(){
        return ImageResourceID;
    }

}
