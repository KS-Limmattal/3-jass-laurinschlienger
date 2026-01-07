/**
 * Diese Klasse ist die Hauptklasse und enthält die main-Methode
 * In der main-Methode soll eine neues (vollstänidges) Deck erzeugt
 * und gemischt werden. Dann sollen (als Testcode) von diesem Deck 30 Karten entfernt
 * werden und anschliessend das EICHELN ASS hinzugefügt werden
 * Danach sollen alle Karten auf der Konsole ausgegeben werden.
 */
public class Jass {
    static Deck player1 = new Deck(new Card[0]);
    static Deck player2 = new Deck(new Card[0]);
    static Deck player3 = new Deck(new Card[0]);
    static Deck player4 = new Deck(new Card[0]);
    static Deck[] players = {player1, player2, player3, player4};
    static Deck Played= new Deck(new Card[0]);
    int punkte13 = 0;
    int punkte24 = 0;
// Karten verteilen
public static void distributCards(){
Deck deck = new Deck();
deck.shuffle();
for(int i = 0 ; i < 9; i++){
    player1.addCard(deck.pop());
}
for(int i = 0 ; i < 9; i++){
    player2.addCard(deck.pop());
}
for(int i = 0 ; i < 9; i++){
    player3.addCard(deck.pop());
}
for(int i = 0 ; i < 9; i++){
    player4.addCard(deck.pop());
}
}
//Karte ausspielen
public static Card playcard(int p){
Deck playable = players[p].validCards(Played);
int palceofcard = 0;
if (playable.cards.length == 0){
    return players[p].pop();
}
if (playable.cards.length == players[p].cards.length){
    return players[p].pop();
}
for (int i = 0 ; i < players[p].cards.length; i++){
    if (playable.cards[0] == players[p].cards[i]){
        palceofcard = i;
    }
}
Card x;
Card y;
x = players[p].cards[players[p].cards.length-1];
y = players[p].cards[palceofcard];
players[p].cards[players[p].cards.length-1] = y;
players[p].cards[palceofcard]= x;
return players[p].pop();
}


    //Testcode
    public static void main(String[] args) {
        // Deck deck = new Deck();
        // deck.shuffle();
        // for(int i= 0 ; i < 30; i++){
        //     deck.pop();
        // }
        // Card eichelass = new Card(Rank.ASS, Suit.EICHELN);
        // deck.addCard(eichelass);
        // for (int i = 0; i < deck.cards.length;i++){
        // System.out.println(deck.cards[i].toString());}
    
    }
}
