/** @author Markus Moser    */

public class ZipInvert {
    public static void main(String[] args) {
        String str = "Loose";

        System.out.print("zipInvert(" + str + ", "+ str + ") --> ");
        System.out.println(zipInvert(str, str));
    }

    private static String zipInvert(String a, String b) {
        return a.length() + b.length() <= 2 ? a+b : "" + a.charAt(0) + b.charAt(b.length() - 1) + zipInvert(a.substring(1), b.substring(0, b.length() - 1));
    }
}
