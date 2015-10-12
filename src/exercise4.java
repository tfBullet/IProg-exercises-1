/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise4 {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";

        System.out.print("Zip(" + a + ", "+ b + ") --> ");
        System.out.println(Zip(a, b));
    }
    private static String Zip(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b : "" + a.charAt(0) + b.charAt(0) + Zip(a.substring(1), b.substring(1));
    }
}
