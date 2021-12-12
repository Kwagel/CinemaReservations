package models;



public class Screen {
    private static int previousScreenNumber= 0;
    private final int screenNum;
    private Film filmShowing;
    private final int MaxCapacity;
    private String screenQuality;
    
    
    public Screen( Film filmShowing) {
        this.screenNum = ++previousScreenNumber;
        this.filmShowing = filmShowing;
        MaxCapacity = 80;
        this.screenQuality = addRandomResolution(filmShowing);
    }
    private String addRandomResolution(Film film){
        String []randomRes = film.getViewingRes();
        return randomRes[(int) (Math.random() * filmShowing.getViewingRes().length )];
    }
    public String getScreenQuality() {
        return screenQuality;
    }
    public int getScreenNum() {
        return screenNum;
    }
    private int incrementScreenNum() {
       previousScreenNumber++;
       return previousScreenNumber;
    }
    
    public Film getFilmShowing() {
        return filmShowing;
    }
    public void changeShowing(Film film){
    this.filmShowing = film;
    }
    
    public int getMaxCapacity() {
        return MaxCapacity;
    }
    

    
    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }
}
