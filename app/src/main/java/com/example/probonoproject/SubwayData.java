package com.example.probonoproject;

public class SubwayData {
    private String number;
    private int photo;
    public SubwayData(int photo, String number) {
        this.number = number;
        this.photo = photo;
    }
    public String getNumber()
    {
        return this.number;
    }

    public int getPhoto()
    {
        return this.photo;
    }
}
