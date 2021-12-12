package controllers;

import models.Film;
import models.Screen;

import java.util.ArrayList;

public class ScreensController {
	public ArrayList<Screen> screens = new ArrayList<>();

	public ScreensController(){
		createScreens(12);
	}
	public void createScreens(int numberOfScreens){
		FilmsController fC = new FilmsController();
		for (int i = 0; i < numberOfScreens; i++) {
			screens.add(new Screen(fC.getRandomFilm()));
		}
		System.out.println(screens);
	}
	
	public Screen getRandomScreen() {
		int random = (int) (Math.random() * screens.size() );
		return screens.get(random);
	}
}
