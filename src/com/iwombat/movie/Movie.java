package com.iwombat.movie;

/**
 * Created by Andreea on 02.11.2014.
 *
 * This is the abstract Movie class
 */
public abstract class Movie {

    /* The movie title and it's rating */
    private String title;
    private int rating;

    /**
     * The default constructor that initializes the movie with the given title and rating
     */
    public Movie(String title, int rating){
        this.title = title;
        this.rating = rating;
    }
    /**
     * Gets the title of the movie
     */
    public String getTitle() {
        return title;
    }
    /**
     * Gets the rating of the movie
     */
    public int getRating() {
        return rating;
    }

    /**
     * This method must be overwritten by all the subclasses
     */
    public abstract boolean freshMovie(int releaseYear);
}
