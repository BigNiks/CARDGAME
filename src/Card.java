public class Card {
    //instance variables
    private String rank;
    private String suit;
    private int points;
    //card constructors
    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        points = value;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank(String rank) {
        return rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit(String suit) {
        return suit;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints(int points) {
        return points;
    }

    public String toString() {
        return rank + " of " + suit;
    }

}
