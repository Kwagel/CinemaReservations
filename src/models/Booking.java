package models;

import java.sql.Time;

public class Booking {
    private String bookingName;
    private int age;
    private int numTickets;
    private Showing showing;
    
    public Booking(String bookingName, int age, int numTickets, Showing showing) {
        this.bookingName = bookingName;
        this.age = age;
        this.numTickets = numTickets;
        this.showing = showing;
    }
    
    public String getBookingName() {
        return bookingName;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getTickets() {
        return numTickets;
    }
    
    public Showing getShowing() {
        return showing;
    }
}
