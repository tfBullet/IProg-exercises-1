package Aufgaben04;
/** Definieren Sie eine Klasse Person,
 * die es Ihnen erlaubt, Personen- Objekte zu erzeugen.
 * Beim Erzeugen eines Personen-Objektes (innerhalb des
 * Konstruktors also) sollen interaktiv (vom Programmanwender)
 * der Name, der Beruf, eine Lieblingsfarbe und ein Lieblingstier
 * der Person ermittelt und in dem Objekt gespeichert werden.
 * Weiterhin soll es eine Methode toString() geben, welche als
 * Return-Wert alle relevanten Informationen über eine Person als
 *  einen String herausgibt. Entwerfen, implementieren und testen
 *  Sie die Klasse.  (Erzeugen Sie also erst mehrere Personen-Objekte
 *  und geben Sie anschließend deren Daten auf den Bildschirm aus.)
 *   @author Laura Lohmann
 *   **/
public class Person {

    private String name;
    private String beruf;
    private String lieblingsfarbe;
    private String lieblingstier;
    static InteractiveIO eingabe =  new InteractiveIO();

    /** Klasse InteractiveIO bzw. mittlerweile eingabe wird aufgerufen, um Text von Tastaur einzulesen.
     * Es werden vier verschiedene Fragen an den Nutzer gestellt, welche
     * anschließend dem Nutzer übersichtlich ausgegeben werden.
     */

    public Person() throws Exception {
        eingabe.write("Bitte lege eine neue Person an.");
        name = eingabe.promptAndRead("Bitte gebe den Namen der Person ein.");
        beruf = eingabe.promptAndRead("Bitte gebe den Beruf der Person ein.");
        lieblingsfarbe = eingabe.promptAndRead("Bitte gebe die Lieblingsfarbe der Person ein.");
        lieblingstier = eingabe.promptAndRead("Bitte gebe das Lieblingstier der Person ein");
    }

    /** Methode gestaltet die vom Nutzer eingegebenen Daten übersichtlich
     */

    public String toString(){
        return name + " ist von Beruf "  + beruf + " seine/ihre Lieblingsfarbe ist " + lieblingsfarbe + " und seine/ihr Lieblingstier ist ein/e "  + lieblingstier;
    }

    /**Main-Methode erzeugt zwei Objekte der Klasse Person
     */
    public static void main(String[] args) throws Exception  {
        Person eins, zwei;
        eins = new Person();
        zwei = new Person();
        eingabe.write("Erste Person: \n" + eins +"\n\n" + eins.toString());
        eingabe.write("\nZweite Person: \n" + zwei);
    }
}
