/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cardsorter;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Tester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean choice = false;
        Scanner scan = new Scanner(System.in);
        String input;

        Hand hand;

        while(!choice) {
            hand = new Hand();
            hand.fill();
            // TODO #1: Convert to JOptionPane
            System.out.println("Here is your hand: ");
            System.out.println(hand.toString());
            System.out.println("Would you like to see another? (Type Yes/No)");
            input = scan.next();
            if(input.equalsIgnoreCase("No")) {
                choice = true;
            }
        }
        
    }
}
