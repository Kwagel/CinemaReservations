package models;

public class Film {
    private String filmName;
    private int filmLength;
    private int ageRating;
    private String[] viewingRes;
    
    public Film(String filmName, int filmLength, int ageRating, String[] viewingRes) {
        this.filmName = filmName;
        this.filmLength = filmLength;
        this.ageRating = ageRating;
        this.viewingRes = viewingRes;
    }
    
    public String getFilmName() {
        return filmName;
    }
    
    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
    
    public String[] getViewingRes() {
        return viewingRes;
    }
}
