package models;

import models.Film;

public class Screen {
    private int screenNum;
    private Film filmShowing;
    private int MaxCapacity;
    private int Attendees;
    private String screenQuality;
    
    public void addAttendees(int ticketNum) {
        this.Attendees += ticketNum;
    }
    
}
