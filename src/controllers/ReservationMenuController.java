package controllers;

import views.ReservationMenuView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReservationMenuController {
    
    public static void main(String[] args) {
        LocalDateTime timeDate = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("EEEE d MMMM H:m");
        System.out.println(timeDate.format(formattedDate));
        
        
        Date date = new Date();
        System.out.println(date);
        
        ReservationMenuView rMenuView = new ReservationMenuView();
        rMenuView.displayMainMenu();
    }
    
    public void parseChoice(int choice) {
        switch (choice) {
            
            case 1:
                NewReservationController newRC = new NewReservationController();
                newRC.newReservation();
                break;
            case 2:
//                viewReservation();
                break;
            case 3:
//                editReservation();
                break;
            case 4:
//                deleteReservation();
                break;
            case 5:
                System.out.println("Thank you for using K Cinema's! Please come again!");
                break;
            default:
                System.out.println("Invalid choice, please retry");
            
        }
        
    }
    
}
