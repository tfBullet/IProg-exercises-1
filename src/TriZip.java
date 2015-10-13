/** @author Markus Moser    */

public class TriZip {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";
        String c = "Locker";

        System.out.print("triZip(" + a + ", "+ b + ", " + c + ") --> ");
        System.out.println(triZip(a, b, c));
    }

    private static String triZip(String a, String b, String c) {
        return a.length() + b.length() + c.length() <= 3 ? a+b+c :
                "" + a.charAt(0) + b.charAt(0) + c.charAt(0) + triZip(a.substring(1), b.substring(1), c.substring(1));
    }
}
