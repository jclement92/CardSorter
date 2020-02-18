/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardsorter;

import org.junit.Test;
import static org.junit.Assert.*;

// TODO #2: Add more tests
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        Card card = new Card(0, "Xyz"){};
        int rank = card.getRank();
        assertEquals(0, rank);
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
    }
    
}
