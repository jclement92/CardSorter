/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardsorter;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Chris
 */
public final class Deck {
    private final ArrayList<Card> deck;
    
    private final static String SPADE = "Spade";
    private final static String CLUB = "Club";
    private final static String HEART = "Heart";
    private final static String DIAMOND = "Diamond";
    
    Deck() {        
        deck = new ArrayList<>(52);
        
        for(int i = 2; i < 15; i++) {
            deck.add(new Card(i, SPADE) {});
            deck.add(new Card(i, CLUB) {});
            deck.add(new Card(i, HEART) {});
            deck.add(new Card(i, DIAMOND) {});
        }
        shuffle();
    }
    
    public Card top() {
        return deck.remove(0);
    }
    
    // TO BE DELETED
    public int size() {
        return deck.size();
    }
    
    public void shuffle() {
        Random rand = new Random();
        int num;
        for(int i = 0; i < deck.size(); i++) {
            num = 1+rand.nextInt(deck.size()-1);
            Card cardToSwap = deck.get(num);
            
            // This snippet of code is based on
            // the following post from StackOverFlow:
            // https://stackoverflow.com/a/15963622
            Card temp = deck.get(i);
            deck.set(i, cardToSwap);
            deck.set(num, temp);
        }
    }
}
