/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise2 {
    public static void main(String[] args) {
        String str = "Das ist ein Test";

        System.out.print("ShiftRight(" + str + ") --> ");
        System.out.println(ShiftRight(str));
    }
    private static String ShiftRight(String str) {
        return str.length() <= 0 ? str : str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}
