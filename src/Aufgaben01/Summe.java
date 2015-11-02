package Aufgaben01;

/** @author Markus Moser    */

public class Summe {
    public static void main(String[] args) {
        int i = 6511; /*Ab 6500 ca. wird es knapp, spätestens wenn man das Programm zwei mal kurz nacheinander
                      / ausführt kommt (vermutlich die garbage collection) nicht mehr hinterher und der stack läuft voll
                      / das kann aber stark schwanken, vor allem wenn man der JVM mehr RAM (fest) zuweißt. So weit ich weiß
                      / erweitert sich der die JVM sogar selbst den speicher wenn sie braucht, oder lagert zumindest
                      / auf die Festplatte aus, aber so schnell(exponentiell) wie der speicherverbrauch steigt,
                      / geht das halt doch nicht ;P
                      / PS.: Passiert auf Android übrigens auch, wenn man versucht SEHR große Bilder zu laden ^^  */

        System.out.print("summe(" + i + ") --> ");
        System.out.println(summe(i));
    }

    private static long summe(int i){
        return i <= 1 ? i : i + summe(i - 1);
    }
}

