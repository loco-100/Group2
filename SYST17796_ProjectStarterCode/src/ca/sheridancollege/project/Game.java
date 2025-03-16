/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {
    private final Player player1;
    private final Player player2;
    private final GroupOfCards deck;

    public Game() {
        deck = new GroupOfCards();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        distributeCards();
    }

    private void distributeCards() {
        List<Card> allCards = deck.getCards();
        for (int i = 0; i < allCards.size(); i++) {
            if (i % 2 == 0) {
                player1.addCard(allCards.get(i));
            } else {
                player2.addCard(allCards.get(i));
            }
        }
    }

    public void play() {
        while (player1.hasCards() && player2.hasCards()) {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getRank() > card2.getRank()) {
                System.out.println(player1.getName() + " wins the round!\n");
            } else if (card1.getRank() < card2.getRank()) {
                System.out.println(player2.getName() + " wins the round!\n");
            } else {
                System.out.println("It's a tie! WAR!\n");
            }
        }
        declareWinner();
    }

    public void declareWinner() {
        if (player1.hasCards()) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println(player2.getName() + " wins the game!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}   