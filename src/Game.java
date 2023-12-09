//Niko Madriz 12/7/23
//Blackjack 21
import java.util.Scanner;
public class Game {
    //Variables used to create the cards
    String[] ran = {"A", "2","3","4","5","6","7","8","9","J","Q","K"};
    String[] sui = {"Diamonds", "Clover","Spades","Hearts"};
    int[] values = {1,2,3,4,5,6,7,8,9,10,10,10};
    //variable used to keep track of the player's score
    int total = 0;


    public void printInstructions() {
        //prints the welcome message of the game.
        System.out.println("Welcome to blackjack! The objective of the game is to gain a hand of cards" +
                " and get closest to 21 without going over. For example, if your cards equal the value " +
                "16 and you gain a 6, you lose since your card values went over 21. In this version of " +
                "the game, aces count for 11 or 1 and will be automatically set based on your card value." +
                " Good luck!");
    }

    public void playGame() {
        //keeps the game running until the player stands or loses
        boolean gameStatus = true;
        Deck deck = new Deck(ran,sui,values);
        //Constructs the player
        Player p = new Player("Player 1", 0);
        while (gameStatus) {
            //shuffles deck every new turn
            deck.shuffle();
            //CHECK FOR ACES
            if (deck.get(0).getRank() == "A" ) {
                if (total + 11 <= 21) {
                    deck.get(0).setPoints(11);
                }
            }
            deck.deal();
            //Displays the current game info to the player
            System.out.println("Card pulled: " + p.hand.get(0));
            System.out.print("Current hand: ");
            System.out.println(p.toString());
            //adds to the player's score
            for (int i = 0; i < p.hand.size(); i++) {
                total += p.hand.get(i).getPoints(i);
            }
            //if hand value is > 21, end game and print lose message
            if (total > 21) {
                System.out.println("BUSTED! Your hand value went over 21!");
                System.out.println(p.toString());
                gameStatus = false;
            }
            //asks user to continue or end
            System.out.print(deck.toString() + " Do hit or stand? ");
            Scanner prompt = new Scanner(System.in);
            //if hand value is <= 21, continue/end game and print win message
            if (prompt.equals("stand")) {
                System.out.println("End game results: ");
                System.out.println(p.toString());
                gameStatus = false;
            }
        }
    }
    public static void main(String[] args) {
        //runs the game
        Game g = new Game();
        g.printInstructions();
        g.playGame();
    }
}