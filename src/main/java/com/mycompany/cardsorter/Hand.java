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
public class Hand {
    private final ArrayList<Card> hand;
    
    Hand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    
    public void fillHand() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
