/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardsorter;

/**
 *
 * @author Chris
 */
public abstract class Card {
    private final int RANK;
    private final String SUIT;
    
    Card(int rank, String suit) {
        RANK = rank;
        SUIT = suit;
    }
    
    public int getRank() {
        return RANK;
    }
    
    public String getSuit() {
        return SUIT;
    }
    
    @Override
    public String toString() {
        char temp = '\u0000';
        
        String rankStr = String.valueOf(RANK);
        switch (RANK) {
            case 11:
                rankStr = "J";
                break;
            case 12:
                rankStr = "Q";
                break;
            case 13:
                rankStr = "K";
                break;
            case 14:
                rankStr = "A";
                break;
            default:
                break;
        }

        if(SUIT.equalsIgnoreCase("Spade")) {
            temp = '\u2660';
        } else if(SUIT.equalsIgnoreCase("Club")) {
            temp = '\u2663';
        } else if(SUIT.equalsIgnoreCase("Heart")) {
            temp = '\u2665';
        } else if(SUIT.equalsIgnoreCase("Diamond")) {
            temp = '\u2666';
        }
        
        return rankStr + temp;
    }
    
}
