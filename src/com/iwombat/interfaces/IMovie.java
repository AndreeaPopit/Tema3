package com.iwombat.interfaces;

import com.iwombat.exceptions.PopularityException;

/**
 * Created by Andreea on 02.11.2014.
 *
 * This is the interface for all the movies that are popular
 *
 */
public interface IMovie {
    public void isPopular() throws PopularityException;
    public void titleLength() throws  PopularityException;
}
