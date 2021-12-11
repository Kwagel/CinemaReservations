package models;

import java.sql.Date;
import java.sql.Time;

public class Showing {
	Film film;
	Screen screen;
	public Date time;
	private int Attendees;
	
	public Showing(Film film, Screen screen, Date time, int attendees) {
		this.film = film;
		this.screen = screen;
		this.time = time;
		Attendees = attendees;
	}
	
//	public void changeShowing(Booking booking, Film film, Screen screen, Date time){
//		for (int i = 0 ; i < timetable.size(); i++){
//			if (timetable.get(i).getFilm().equals(film) && timetable.get(i).getScreen().equals(film) && timetable.get(i).getTime().equals(time) ) {
//				this.film = film;
//				this.screen = screen;
//				this.time = time;
//				removeAttendees(booking);
//			}
//		}
//	 }
	
	public Film getFilm() {
		return film;
	}
	
	public Screen getScreen() {
		return screen;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void removeAttendees(Booking booking) {
		this.Attendees += booking.getTickets();
	}
	public void addAttendees(Booking booking) {
		this.Attendees += booking.getTickets();
	}
}
