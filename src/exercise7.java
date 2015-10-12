/**
 * Created by Markus M. on 12.10.15.
 */
public class exercise7 {
    public static void main(String[] args) {
        String a = "Hang";
        String b = "Loose";
        String c = "Locker";

        System.out.print("TriZip(" + a + ", "+ b + ", " + c + ") --> ");
        System.out.println(TriZip(a, b, c));
    }

    private static String TriZip(String a, String b, String c) {
        return a.length() + b.length() + c.length() <= 3 ? a+b+c :
                "" + a.charAt(0) + b.charAt(0) + c.charAt(0) + TriZip(a.substring(1), b.substring(1), c.substring(1));
    }
}
