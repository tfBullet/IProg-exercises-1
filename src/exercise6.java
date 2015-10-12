/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise6 {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";

        System.out.println("ShiftRight(" + b + ") --> " + ShiftRight(b));
        System.out.print("ZipShift(" + a + ", "+ ShiftRight(b) + ") --> ");
        System.out.println(ZipShift(a, ShiftRight(b))); //Ich hoffe die Aufgabe war so gemeint, sonst kann ich sie nochmal machen :)
    }
    private static String ZipShift(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b :
                "" + a.charAt(0) + b.charAt(0) + ZipShift(a.substring(1), b.substring(1));
    }

    private static String ShiftRight(String str) {
        return str.length() <= 0 ? str : str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}
