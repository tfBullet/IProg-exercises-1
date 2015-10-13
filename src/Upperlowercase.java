/**
 * Created by Markus M. on 12.10.15.
 */
public class Upperlowercase {
    public static void main(String[] args) {
        String str = "Das ist ein Test";

        System.out.print("upperLowercase(" + str + ") --> ");
        System.out.println(upperLowercase(str));
    }
    private static String upperLowercase(String str) {
        return str.length() <= 1 ? str :
               "" + Character.toUpperCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1)) + upperLowercase(str.substring(2));
    }
}
