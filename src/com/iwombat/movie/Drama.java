package com.iwombat.movie;
import java.io.*;
import com.iwombat.exceptions.PopularityException;
import com.iwombat.interfaces.IMovie;

/**
 * Created by Andreea on 02.11.2014.
 *
 * This is the class for a drama movie
 */
public class Drama extends Movie implements IMovie {

    public Drama(String title, int rating){
        super(title,rating);
    }

    public boolean freshMovie(int releaseYear){
        return releaseYear <= 2014 && releaseYear > 2013;
    }

    public void isPopular() throws  PopularityException{
        if (getRating() <= 0)
            throw new PopularityException("Wrong rating!");
        if (getRating() >= 8)
            System.out.println("Worth seeing!");
    }

    public void titleLength() throws  PopularityException{
        if (getTitle().length() <= 0){
            throw new PopularityException("Wrong title!");
        }
        else
            System.out.println("Worth seeing!");
    }
}
