import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten
 * Sie soll ein Array cards von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck {
    Card[] cards;

    //Konstruktor
    public Deck(Card[] cards) {
        this.cards = cards;
    }

    // Konstruktor
    public Deck() {
        this.cards = new Card[36];
        int i = 0;
        while (i < 36) {
            for (Suit s : Suit.values()) {
                for (Rank r : Rank.values()) {
                    Card Karte = new Card(r, s);
                    cards[i] = Karte;
                    i++;
                }
            }
        }
    }

    // Getter
    public Card[] getCards() {
        return cards;
    }

    // addCard
    public void addCard(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (card.equals(cards[i])) {
                System.err.println("Diese Karte ist im Deck schon vorhanden.");
                return;
            }
        }
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1] = card;
    }

    // PoP entfernt die Letste Karte eines Decks
    public Card pop() {
        Card karte = cards[cards.length - 1];
        cards = Arrays.copyOf(cards, cards.length - 1);
        return karte;
    }

    // Shuffle
    public void shuffle() {
        int i = 0;
        while (i < 300) {
            Random rand = new Random();
            int randomint = rand.nextInt(35);
            Card card1 = cards[randomint];
            Card card2 = cards[0];
            cards[0] = card1;
            cards[randomint] = card2;
            i++;
        }
    }
}
