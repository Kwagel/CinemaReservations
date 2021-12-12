package controllers;

import views.ReservationMenuView;

public class ReservationMenuController {

	public static void main(String[] args) {
		ShowingsMenuController sMC = new ShowingsMenuController();
		sMC.displayShowings();
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
