/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise1 {
    public static void main(String[] args) {
        String str = "Das ist ein Test";

        System.out.print("Doppel(" + str + ") --> ");
        System.out.println(Dopple(str));
    }
    private static String Dopple(String str) {
        return str.length() <= 0 ? str : "" + str.charAt(0) + str.charAt(0) + Dopple(str.substring(1));
    }
}
