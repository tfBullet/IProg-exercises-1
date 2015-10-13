/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise8 {
    public static void main(String[] args) {
        int i = 6511; /*Ab 6500 ca. wird es knapp, spätestens wenn man das Programm zwei mal kurz nacheinander
                      / ausführt kommt (vermutlich die garbage collection) nicht mehr hinterher und der stack läuft voll
                      / das kann aber stark schwanken, vor allem wenn man der JVM mehr RAM (fest) zuweißt. So weit ich weiß
                      / erweitert sich der die JVM sogar selbst den speicher wenn sie braucht, oder lagert zumindest
                      / auf die Festplatte aus, aber so schnell(exponentiell) wie der speicherverbrauch steigt,
                      / geht das halt doch nicht ;P
                      / PS.: Passiert auf Android übrigens auch, wenn man versucht SEHR große Bilder zu laden ^^  */

        System.out.print("Summe(" + i + ") --> ");
        System.out.println(Summe(i));
    }

    private static long Summe(int i){
        return i <= 1 ? i : i + Summe(i - 1);
    }
}

