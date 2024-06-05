public class Blackjack {

    public int parseCard(String card) {
        int value = 0;
        switch (card) {
            case "ace":
                value = 11;
            case "two":
                value = 2;
            case "three":
                value = 3;
            case "four":
                value = 4;
            case "five":
                value = 5;
            case "six":
                value = 6;
            case "seven":
                value = 7;
            case "eight":
                value = 8;
            case "nine":
                value = 9;
            case "ten": case "jack": case "queen": case "king":
                value = 10;
            case "other":
                value = 0;
        
            default:
                break;
        }

        return value;
    }

    public boolean isBlackjack(String card1, String card2) {
        throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
