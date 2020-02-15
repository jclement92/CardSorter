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
public class Deck {
    private final ArrayList<Card> deck;
    
    Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }
    
    public Card top() {
        return deck.get(deck.size()-1);
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
