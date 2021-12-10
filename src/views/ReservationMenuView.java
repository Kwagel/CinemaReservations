package views;

import controllers.ReservationMenuController;
import models.Film;

import java.util.Scanner;

public class ReservationMenuView {
    public void ReservationMenuView(){
        Film HarryPotter = new Film();
    }
    public void displayResMenu() {
        System.out.println("Menu");
        System.out.println("---------");
        System.out.println("1 - New Reservation");
        System.out.println("2 - View Reservations");
        System.out.println("3 - Edit Reservation");
        System.out.println("4 - Delete Reservation");
        System.out.println("5 - Exit");
        ReservationMenuController rMC = new ReservationMenuController();
        rMC.parseChoice(Integer.parseInt(new Scanner(System.in).nextLine()));
    }
    
}
