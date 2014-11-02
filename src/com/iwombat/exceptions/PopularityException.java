package com.iwombat.exceptions;

/**
 * Created by Andreea on 02.11.2014.
 *
 * This is the exception thrown by the interface IMovie
 */
public class PopularityException extends Exception{
    public PopularityException(String message){
        super(message);
    }
}
