package ArrayString;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int smallerLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < smallerLength; i++) {
            newWord += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
        }

        return newWord + word1.substring(smallerLength) + word2.substring(smallerLength);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
