/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise3 {
    public static void main(String[] args) {
        String str = "Das ist ein Test";

        System.out.print("UpperLowercase(" + str + ") --> ");
        System.out.println(UpperLowercase(str));
    }
    private static String UpperLowercase(String str) {
        return str.length() <= 1 ? str :
               "" + Character.toUpperCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1)) + UpperLowercase(str.substring(2));
    }
}
