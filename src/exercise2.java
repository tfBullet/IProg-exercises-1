/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise2 {
    static int counter;

    public static void main(String[] args) {
        counter = 0;
        String str = "HangLoose";

        System.out.print("shiftRight(" + str + ") --> ");
        System.out.println(shiftRight(str));
    }


    private static String shiftRight(String str) {
        counter++;
        return counter == str.length() + 1 ? str : shiftRight(str.substring(str.length() - 1)) + str.substring(0,str.length() - 1);
    }
}
