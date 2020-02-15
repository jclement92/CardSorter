/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardsorter;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Tester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Card> cards = new ArrayList<>();
        
        for(int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Spade"));
            cards.add(new Card(i, "Club"));
            cards.add(new Card(i, "Heart"));
            cards.add(new Card(i, "Diamond"));
        }
        
        Deck deck = new Deck(cards);
        deck.shuffle();
        System.out.println("Card on top: " + deck.top());
        
        System.out.println("Cards in deck: ");
        cards.forEach((i) -> System.out.println(i));
        
    }
    
}
