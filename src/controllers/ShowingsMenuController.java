package controllers;

import models.Film;
import models.Showing;
import views.ShowingsMenuView;

import java.util.ArrayList;

public class ShowingsMenuController {
	public ArrayList<Showing> timetable = new ArrayList<>();
	
	public void ShowingsMenuController() {
		Film HarryPotter = new Film("Harry Potter", 167, 5, new String[]{"IMAX", "standard"});
		Film SpiderMan = new Film("Spider-Man: No Way Home", 180, 12, new String[]{"IMAX", "standard", "4DX"});
		Film Venom = new Film("Venom: Let There Be Carnage", 97, 15, new String[]{"IMAX", "standard", "4DX"});
		Film KingRichard = new Film("King Richard", 147, 12, new String[]{"IMAX", "standard"});
		
		populateTimetable();
	}
	
	private void populateTimetable() {
	
	}
	
	public void displayFilms() {
		ShowingsMenuView filmMC = new ShowingsMenuView();
		filmMC.displayFilmMenu();
	}
}
