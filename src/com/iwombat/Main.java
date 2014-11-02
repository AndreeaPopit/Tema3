package com.iwombat;

import com.iwombat.exceptions.PopularityException;
import com.iwombat.interfaces.IMovie;
import com.iwombat.movie.Drama;
import com.iwombat.movie.Movie;
import com.iwombat.movie.Romance;

/**
 * Created by Andreea on 02.11.2014.
 *
 *
 */
public class Main {

    /**
     * The entry point to the project
     *
     */
    public static void main(String[] args) {
        IMovie dramaMovie = new Drama("The Pursuit of Happiness",0);
        Movie romanceMovie = new Romance("The Fault in Our Stars",8);

        try {
            dramaMovie.isPopular();
        }catch (PopularityException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
