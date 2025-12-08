/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {
    Rank wert;
    Suit farbe;

    // Konstruktor
    public Card(Rank wert, Suit farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (wert != other.wert)
            return false;
        if (farbe != other.farbe)
            return false;
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "Card [Wert=" + wert + ", Farbe=" + farbe + "]";
    }

}
