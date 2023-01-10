import java.util.ArrayList;

//Player class
public class Player {

    private final String vem;

    private final ArrayList<Card> hand;

    public Player(String vem) {
        this.vem = vem;
        this.hand = new ArrayList<Card>();
    }

    public String getVem() {
        return vem;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandSum() {
        int handSum = 0;
        for (Card card : hand) {
            handSum += card.getFace().getValue();
        }
        return handSum;
    }

    public String getHandAsString(boolean b) {
        StringBuilder sb = new StringBuilder();
        sb.append(vem); //'s'\
        sb.append('\n');
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && b) {
                sb.append('\n');
            } else {
                sb.append(hand.get(i));
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}