/**
 * class uses import directive to ensure that the Random class
 * is available in this file. 
 * 
 * Random is a class made available in the JDK. However, it is
 * not automatically available -> hence we need the import directive
 * to tell the computer that we want to use it
 * 
 * some are automatically available (ie String)
 * 
 * package com.wealthie.cardgame;
 */


 import java.util.Random;

public class Card
{
    private int value;
    private String suit;
    
    public Card()
    {
        Random random = new Random();
        int val = 1 + (Math.abs(random.nextInt()) % 11);
        setValue(val);
        int suit = Math.abs(random.nextInt() % 4);
    }
}