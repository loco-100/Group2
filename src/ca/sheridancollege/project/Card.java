/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


import java.util.*;

/**
 * SYST 17796 Project - War Card Game
 * Authors: Rajanpreet Kaur, Abhishek Kumar, Gazalpreet, Ayush Shailesbhai Patel
 * Date: 09-02-2025
 */

// Card class representing a playing card
class Card {
    private final String suit;
    private final int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}




