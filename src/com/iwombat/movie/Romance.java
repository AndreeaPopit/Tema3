package com.iwombat.movie;

/**
 * Created by Andreea on 02.11.2014.
 *
 *  This is the class for a romance movie
 */
public class Romance extends Movie{

    public Romance(String title, int rating){
        super(title,rating);
    }
    public boolean freshMovie(int releaseYear){
        return releaseYear <= 2014 && releaseYear > 2013;
    }
}
