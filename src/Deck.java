import java.util.ArrayList;


public class Deck {
    private int temp;
    ArrayList<Card> deck = new ArrayList<Card>();
    public Deck(String[] r, String[] s, int[] v) {
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < s.length; j++) {
                deck.add(new Card(r[i],s[j],v[i]));
            }
        }
        temp = deck.size() - 1;
    }
    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public int getCardsLeft() {
        int size = deck.size();
        return size;
    }

    public Card deal() {
        if (deck.isEmpty()) {
            return null;
        }
        return deck.get(temp);
    }

    public void shuffle() {
        for (int i = deck.size(); i > 0; i--) {
            int r = (int) (Math.random() * (i + 1));
            Card temp = deck.get(r);
            temp = deck.set(i, temp);
            deck.set(r, temp);
        }
    }
}
