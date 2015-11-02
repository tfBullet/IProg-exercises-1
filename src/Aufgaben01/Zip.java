package Aufgaben01;

/** @author Markus Moser    */

public class Zip {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";

        System.out.print("zip(" + a + ", "+ b + ") --> ");
        System.out.println(zip(a, b));
    }

    private static String zip(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b : "" + a.charAt(0) + b.charAt(0) + zip(a.substring(1), b.substring(1));
    }
}
