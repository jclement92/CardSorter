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
        
        Deck deck = new Deck();
        deck.shuffle();
//        System.out.println("Card on top: " + deck.top());
        
//        System.out.println("Cards in deck: ");
//        deck.forEach((i) -> System.out.println(i));

        Hand hand = new Hand();
        hand.fill(deck);
        System.out.println(hand.toString());
        
        
        
    }
    
}
