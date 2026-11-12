package com.pluralsight;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to blackjack");
        System.out.println("Enter first players name: ");
        String player1 = scanner.nextLine();
        System.out.println("Enter Second players name: ");
        String player2 = scanner.nextLine();

        Deck deck = new Deck();
        deck.shuffle();

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        hand1.deal(deck.deal());
        hand2.deal(deck.deal());

        hand1.deal(deck.deal());
        hand2.deal(deck.deal());

        System.out.println(player1 + "'s hand:");
        hand1.print();

        System.out.println(player2 + "'s hand:");
        hand2.print();

       /* System.out.println(player1 + "'s score: " + hand1.getValue());
        System.out.println(player2 + "'s score: " + hand2.getValue());*/

        int player1score = hand1.getValue();
        int player2score = hand2.getValue();


        if (player1score > 21 && player2score > 21) {
            System.out.println("Both players busted! No winner.");
        } else if (player1score > 21) {
            System.out.println(player2 + " wins!");
        } else if (player2score > 21) {
            System.out.println(player1 + " wins!");
        } else if (player1score > player2score) {
            System.out.println(player1 + " wins!");
        } else if (player2score > player1score) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }



    }
}
