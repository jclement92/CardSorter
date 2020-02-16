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
    
    Hand() {
        hand = new ArrayList<>(13);
    }
    
    public void fill(Deck deck) {
        // Should work
        ArrayList<Card> spade = new ArrayList<>();
        ArrayList<Card> club = new ArrayList<>();
        ArrayList<Card> heart = new ArrayList<>();
        ArrayList<Card> diamond = new ArrayList<>();
        
        Card card;
        
        loop:
        for(int i = 0; i < 13; i++) {
            card = deck.top();
            switch (card.getSuit()) {
                case "Spade":
                    if(spade.isEmpty()) {
                        spade.add(0, card);
                    } else {
                        for(int j = 0; j < spade.size(); j++) {
                            if(card.getRank() < spade.get(j).getRank()) {
                                spade.add(j, card);
                                continue loop;
                            }
                        }
                        spade.add(card);
                    }   break;
                case "Club":
                    if(club.isEmpty()) {
                        club.add(0, card);
                    } else {
                        for(int j = 0; j < club.size(); j++) {
                            if(card.getRank() < club.get(j).getRank()) {
                                club.add(j, card);
                                continue loop;
                            }
                        }
                        club.add(card);
                    }   break;
                case "Heart":
                    if(heart.isEmpty()) {
                        heart.add(0, card);
                    } else {
                        for(int j = 0; j < heart.size(); j++) {
                            if(card.getRank() < heart.get(j).getRank()) {
                                heart.add(j, card);
                                continue loop;
                            }
                        }
                        heart.add(card);
                    }   break;
                case "Diamond":
                    if(diamond.isEmpty()) {
                        diamond.add(0, card);
                    } else {
                        for(int j = 0; j < diamond.size(); j++) {
                            if(card.getRank() < diamond.get(j).getRank()) {
                                diamond.add(j, card);
                                continue loop;
                            }
                        }
                        diamond.add(card);
                    }   break;
                default:
                    break;
            }
        }
        
        spade.forEach((k) -> hand.add(k));
        club.forEach((k) -> hand.add(k));
        heart.forEach((k) -> hand.add(k));
        diamond.forEach((k) -> hand.add(k));
        
//        hand.add(deck.top());
//        System.out.println("Top element of hand: " + hand.get(0));
//
//        System.out.println("Current size of deck: " + deck.size());
//        
//        for(int i = 1; i < 13; i++) {
//            Card card = deck.top();
//            String cardSuit = card.getSuit();
//            for(int j = 0; j < hand.size(); j++) {
//                if(!hand.get(j).getSuit().equals(cardSuit)) {
//                    hand.add(hand.size(), card);
//                    break;
//                } else {
//                    for(int k = j; k < hand.size(); k++) {
//                        if(card.getRank() > hand.get(k).getRank()) {
//                            hand.add(k, card);
//                        }
//                    }
//                }
//            }
//        }
    }
    
    @Override
    public String toString() {
        String cardsInHand = "";
        for(int i = 0; i < hand.size(); i++) {
            cardsInHand += hand.get(i).toString() + "\n";
        }
        return cardsInHand;
    }
}
