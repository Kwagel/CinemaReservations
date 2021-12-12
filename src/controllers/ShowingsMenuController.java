package controllers;


import models.Film;
import models.Screen;
import models.Showing;
import views.ShowingsMenuView;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class ShowingsMenuController {
	ArrayList<Showing> showings = new ArrayList<>();
	
	private void populateTimetable() {
		ScreensController sC = new ScreensController();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
		LocalDateTime startDate = LocalDateTime.parse("2021 12 12 08:00", formatter);
		LocalDateTime cDatePlus7Days = startDate.plusDays(1);
		LocalTime after8am = LocalTime.parse("08:01:00");
		LocalTime before10pm = LocalTime.parse("22:00:00");
//		loop through all created screens
		for (Screen s : sC.screens) {
// create for a limited number of days to test
			for (LocalDateTime now = startDate; now.isBefore(cDatePlus7Days); now = now.plusMinutes(s.getFilmShowing().getFilmLength())) {
//			if its between opening times
				if (now.toLocalTime().isAfter(after8am) && now.toLocalTime().isBefore(before10pm.minusMinutes(s.getFilmShowing().getFilmLength()))) {
					showings.add(new Showing(s, now));
//					make it so any dupes are pushed along
					checkDupes(now);
				}
				
//				give 20 mins between each film for cinema staff to clean up
				now = now.plusMinutes(20);
			}
		}
		viewTimetable();
	}
	
	private void checkDupes(LocalDateTime now) {
//		compare all entries to each entry
		for (int i = 0; i < showings.size() - 1; i++) {
			for (int j = i + 1; j < showings.size() - 1; j++) {
//				if the film, time and res are identical, it pushes the time forward by 20 minutes
				if (showings.get(j).getScreen().getFilmShowing().getFilmName().equals(showings.get(i).getScreen().getFilmShowing().getFilmName()) && showings.get(j).getTime().equals(showings.get(i).getTime()) && showings.get(j).getScreen().getScreenQuality().equals(showings.get(i).getScreen().getScreenQuality())) {
					showings.get(j).setTime(now.plusMinutes(20));

				}
			}
		}
	}
	
	private void viewTimetable() {
		ArrayList<Film> filmlist = FilmsController.getFilms();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("SHOWINGS");
		System.out.println("-----------");
//		loop through list of available films
		for (int i = 0; i < filmlist.size(); i++) {
			boolean hasShowings = false;
//			print current film name
			String res = "";
//			loop through all resolutions
			for (int j = 0; j < filmlist.get(i).getViewingRes().length; j++) {
//				add current resolution to print string
				String[] viewingResols = filmlist.get(i).getViewingRes();
				res += viewingResols[j] + " ";
				
				ArrayList<LocalDateTime> times = new ArrayList<>();
				for (Showing s : showings) {

//					if both name and resolution match, concatonate to string
					if (filmlist.get(i).getFilmName().equals(s.getScreen().getFilmShowing().getFilmName()) && viewingResols[j].equals(s.getScreen().getScreenQuality())) {
						hasShowings = true;
						times.add(s.getTime());
						
					}
					
				}
//				sort the times in an arraylist
				times.sort(Comparator.naturalOrder());
//				repopulate the string that we will print
				for (LocalDateTime time : times
				) {
					res += " " + time.format(formatter);
				}
//				add a new line between each resolution
				res += "\n";
			}
//			on print movie name if it has showings for that day
			if (hasShowings) {
				System.out.println(filmlist.get(i).getFilmName());
//				if it haas zero showings, won't just past the resolutions
				if (res.contains(":")) {
					System.out.println(res);
				}
			}
		}
	}
	
	public void displayShowings() {
		populateTimetable();
		ShowingsMenuView filmMC = new ShowingsMenuView();
		filmMC.displayShowings();
	}
}
