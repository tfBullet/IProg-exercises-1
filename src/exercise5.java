/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise5 {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";

        System.out.print("ZipInvert(" + a + ", "+ b + ") --> ");
        System.out.println(ZipInvert(a, b));
    }
    private static String ZipInvert(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b :
                "" + a.charAt(0) + b.charAt(b.length() - 1) + ZipInvert(a.substring(1), b.substring(0, b.length() - 1));
    }
}
