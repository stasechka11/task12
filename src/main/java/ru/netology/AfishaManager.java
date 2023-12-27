package ru.netology;

public class AfishaManager {
    private Movie[] moviesArray = new Movie[0];
    private int moviesLimit;

    public AfishaManager() {
        moviesLimit = 5;
    }

    public AfishaManager(int moviesLimit) {
        this.moviesLimit = moviesLimit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[moviesArray.length + 1];
        for (int i = 0; i < moviesArray.length; i++) {
            tmp[i] = moviesArray[i];
        }
        tmp[tmp.length - 1] = movie;
        moviesArray = tmp;
    }

    public Movie[] findAll() {
        return moviesArray;
    }


}
