package Aufgaben04;

/** Schreiben Sie ein Programm Ggt, welches den
 * größten gemeinsamen Teiler (ggT) zweier eingelesener
 * positiver Zahlen x und y bestimmt und kommentiert
 * ausgibt. Dies soll wiederholt werden, bis eine leere
 *  Eingabe erfolgt.
 * Hinweis: Der ggT von x und y ist gleich y, wenn der
 * Rest r der ganzzahligen Division von x durch y gleich 0 ist.
 * Andernfalls ist der ggT gleich dem ggT von y und eben diesem Rest r.
 * **/


public class Ggt {

    /** größter gemeinsamer Teiler wird mit Rekursion ermittelt;
     * **/

    public static int ggt(int eins,int zwei){
        return zwei == 0 ? eins : ggt(zwei, eins%zwei);
    }

    /**Objekt InteractiveIo wird erzeugt, um Text von Tastatur einzulesen
     **/

    public static void main(String[] args)throws Exception {
        int eins;
        int zwei;
        InteractiveIO eingabe;
        eingabe = new InteractiveIO();
        eingabe.write("Größter gemeinsamer Teiler(ggT) zweier Zahlen ermitteln: \n");

        String a = eingabe.promptAndRead("Bitte gebe die erste Zahl ein. \n" + "Für Beenden drücke Return");

        if (a.length() != 0 && !a.isEmpty()) {
            eins = Integer.parseInt(a.trim()); //wandelt String in int um
            a = eingabe.promptAndRead("Bitte geben Sie eine zweite Zahl an.");
            if (a.length() != 0 && !a.isEmpty()) {
                zwei = Integer.parseInt(a.trim());
                int ergebnis = ggt(eins, zwei);
                eingabe.write("Der größte gemeinsame Teiler von " + eins + " und " + zwei + " ist " + ergebnis);
                //a = eingabe.promptAndRead("\nFür einen weiteren ggT bitte neue erste Zahl eingeben.\nFür Beenden drücke Return.");
            }
        }
    }
}


