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
public class Card {
    private final int rank;
    private final String suit;
    
    Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getRank() {
        return rank;
    }
    
    public String getSuit() {
        return suit;
    }
    
    @Override
    public String toString() {
        char temp = '\u0000';
        
        String rankStr = String.valueOf(rank);
        switch (rank) {
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

        if(suit.equalsIgnoreCase("Spade")) {
            temp = '\u2660';
        } else if(suit.equalsIgnoreCase("Club")) {
            temp = '\u2663';
        } else if(suit.equalsIgnoreCase("Heart")) {
            temp = '\u2665';
        } else if(suit.equalsIgnoreCase("Diamond")) {
            temp = '\u2666';
        }
        
        return rankStr + temp;
    }
    
}
