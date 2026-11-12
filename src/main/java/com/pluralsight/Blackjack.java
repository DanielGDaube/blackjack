package com.pluralsight;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player one's name: ");
        String player1 = scanner.nextLine();
        Hand player1Hand = new Hand();
        System.out.println("Enter player two's name: ");
        String player2 = scanner.nextLine();
        Hand player2Hand = new Hand();

        Deck deck = new Deck();
        deck.shuffle();
        player1Hand.deal(deck.deal());
        player2Hand.deal(deck.deal());

        System.out.println(player1 + "'s hand:");
        player1Hand.print();
        System.out.println("Score:");
        System.out.println(player1Hand.getValue());
        System.out.println(player2 + "'s hand:");
        player2Hand.print();
        System.out.println("Score:");
        System.out.println(player2Hand.getValue());
    }
}
