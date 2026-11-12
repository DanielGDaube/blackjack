package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hand> playerHands = new ArrayList<>();
        int hands;

        System.out.println("How many people are playing?");
        hands = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= hands; i++) {
            System.out.println("Enter player " + i + "'s name:");
            playerHands.add(new Hand().setName(scanner.nextLine()));
        }

        Deck deck = new Deck();
        deck.shuffle();

        for (Hand hand : playerHands){
            hand.deal(deck.deal());
            System.out.println(hand.getName() + "'s hand:");
            hand.print();
            System.out.println("Score:");
            System.out.println(hand.getValue());
        }

        System.out.println("The winner is:");
        Hand winnerHand = new Hand();
        for (Hand hand : playerHands){
            winnerHand = (hand.getValue() > winnerHand.getValue() && hand.getValue() < 22) ? hand : winnerHand;
        }
        System.out.println(winnerHand.getName() + "!");
    }
}
