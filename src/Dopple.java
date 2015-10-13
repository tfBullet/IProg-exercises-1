/** @author Markus Moser    */

public class Dopple {
    public static void main(String[] args) {
        String str = "Das ist ein Test";

        System.out.print("doppel(" + str + ") --> ");
        System.out.println(doppel(str));
    }

    private static String doppel(String str) {
        return str.length() <= 0 ? str : "" + str.charAt(0) + str.charAt(0) + doppel(str.substring(1));
    }
}
