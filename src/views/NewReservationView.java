package views;

import controllers.ShowingsMenuController;
import controllers.Library;

public class NewReservationView {
    public void displayNewRMenu() {
        System.out.println("New Reservation");
        System.out.println("---------");
        System.out.println("Please enter your name for the booking ");
        Library lib = new Library();
        String bookingName = lib.scanName();
        System.out.println("Please enter your age :) ");
        int bookingAge = lib.scanInt();
        System.out.println(" Finally, please enter the number of Tickets");
        int bookingTicketsNum = lib.scanInt();
        System.out.println("Please choose a film now :)");
        ShowingsMenuController filmMC = new ShowingsMenuController();
        filmMC.displayFilms();
       

    }
}
