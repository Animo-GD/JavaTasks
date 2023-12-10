public class fullDeck {
    public Cards[] cards;
    public fullDeck(Cards[] cards){
        this.cards = cards;
    }

    public void displayCards(){
        for (Cards card : cards) {
            System.out.printf("The Card is %s %s\n", card.rank, card.suit);

        }
    }

    public static void main(String[] args) {
        Cards[] cards = {
          new Cards("1","Spades"),
          new Cards("2","Spades"),
          new Cards("3","Heart"),
          new Cards("4","Clubs"),
          new Cards("5","Spades"),
          new Cards("6","Heart"),
          new Cards("7","Diamond"),
          new Cards("8","Diamond"),
          new Cards("9","Heart"),
          new Cards("10","Spades"),
          new Cards("K","Diamond"),
          new Cards("J","Heart"),
          new Cards("Q","Clubs")
        };
        fullDeck bicycle = new fullDeck(cards);
        bicycle.displayCards();
    }
}

