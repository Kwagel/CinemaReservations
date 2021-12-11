package controllers;

import views.NewReservationView;

public class NewReservationController {
    public void newReservation() {
        NewReservationView newRV = new NewReservationView();
        newRV.displayNewRMenu();
    }
}
