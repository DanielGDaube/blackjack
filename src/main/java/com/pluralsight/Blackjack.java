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
    }
}
