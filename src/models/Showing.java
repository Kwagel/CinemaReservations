package models;

import java.sql.Date;
import java.time.LocalDateTime;

public class Showing {
	private Screen screen;
	private LocalDateTime time;
	private int Attendees;
	
	public Showing(Screen screen, LocalDateTime time) {
		this.screen = screen;
		this.time = time;
		Attendees = 0;
	}
	
	//	public void changeShowing(Booking booking, Screen screen, Date time){
//		for (int i = 0 ; i < timetable.size(); i++){
//			if (timetable.get(i).getFilm().equals(film) && timetable.get(i).getScreen().equals(film) && timetable.get(i).getTime().equals(time) ) {
//				this.film = film;
//				this.screen = screen;
//				this.time = time;
//				removeAttendees(booking);
//			}
//		}
//	 }
	

	
	public Screen getScreen() {
		return screen;
	}
	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	public void removeAttendees(Booking booking) {
		this.Attendees += booking.getTickets();
	}
	
	public void addAttendees(Booking booking) {
		this.Attendees += booking.getTickets();
	}
}
