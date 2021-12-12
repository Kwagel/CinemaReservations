package controllers;

import models.Film;

import java.util.ArrayList;

public class FilmsController {
	 static public ArrayList<Film> films = new ArrayList<>();
	 
	public FilmsController() {
		films.add(new Film("Harry Potter", 167, 5, new String[]{"IMAX", "Standard"}));
		films.add(new Film("Spider-Man: No Way Home", 180, 12, new String[]{"IMAX", "Standard", "4DX"}));
		films.add(new Film("Venom: Let There Be Carnage", 97, 15, new String[]{"IMAX", "Standard", "4DX"}));
		films.add(new Film("King Richard", 147, 12, new String[]{"IMAX", "Standard"}));

	}
	
	static ArrayList<Film> getFilms(){
		return films;
	}
	
	public Film getRandomFilm() {
		int random = (int) (Math.random() * films.size() );
		return films.get(random);
	}
	
	public void displayFilms(int index){
		System.out.println(films.get(index).getFilmName() + " (" +  films.get(index).getAgeRating() + "+) : " + films.get(index).getFilmLength() + " minutes ");
	}
	public void displayFilms() {
		for (int i = 0; i < films.size(); i++) {
			System.out.println(films.get(i).getFilmName() + " (" + films.get(i).getAgeRating() + "+) : " + films.get(i).getFilmLength() + " minutes ");
		}
	}
}
