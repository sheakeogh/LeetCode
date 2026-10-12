package ArrayString;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, findGcd(str1.length(), str2.length()));
        }

        return "";
    }

    private static int findGcd(int lengthStr1, int lengthStr2) {
        return lengthStr2 == 0 ? lengthStr1 : findGcd(lengthStr2, lengthStr1 % lengthStr2);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
}