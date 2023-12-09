import java.util.ArrayList;

public class Player {
    //instance variables
    ArrayList<Card> hand = new ArrayList<Card>();
    private int points;
    private String name;

    //player constructors
    public Player(String label, int score) {
        points = score;
        name = label;
    }

    public Player(String label, int score, ArrayList<Card> hand) {
        points = score;
        name = label;
        this.hand = hand;
    }

    public String getName(String name) {
        return name;
    }

    public int getPoints(int points) {
        return points;
    }

    public void addPoints(int num) {
        points += num;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public String toString() {
        return name + " has " + points + "\n" + name +"'s cards: " + hand;
    }
}
