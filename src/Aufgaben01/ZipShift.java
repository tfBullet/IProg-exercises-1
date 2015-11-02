package Aufgaben01;

/** @author Markus Moser    */

public class ZipShift {
    static int counter;

    public static void main(String[] args) {
        counter=0;
        String a = "Hang";
        String b = "Loose";

        System.out.println("ShiftRight(" + b + ") --> " + shiftRight(b));
        System.out.print("zipShift(" + a + ", "+ shiftRight(b) + ") --> ");
        System.out.println(zipShift(a, shiftRight(b))); //Ich hoffe die Aufgabe war so gemeint, sonst kann ich sie nochmal machen :)
    }

    private static String zipShift(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b :
                "" + a.charAt(0) + b.charAt(0) + zipShift(a.substring(1), b.substring(1));
    }

    private static String shiftRight(String str) {
        counter++;
        return counter == str.length() + 1 ? str : shiftRight(str.substring(str.length() - 1)) + str.substring(0,str.length() - 1);
    }
}
