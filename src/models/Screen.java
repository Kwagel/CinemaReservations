package models;

import models.Film;

public class Screen {
    private int screenNum;
    private Film filmShowing;
    private int MaxCapacity;
    private String screenQuality;
    
    
    public Screen(int screenNum, Film filmShowing, int maxCapacity) {
        this.screenNum = screenNum;
        this.filmShowing = filmShowing;
        MaxCapacity = maxCapacity;
        String randomRes[] = filmShowing.getViewingRes();
        this.screenQuality = randomRes[(int) (Math.random() * filmShowing.getViewingRes().length + 1)];
    }
}
