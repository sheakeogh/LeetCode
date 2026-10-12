package ArrayString;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());

        for (int i = 0; i < length; i++) {
            mergedWord.append(word1.charAt(i));
            mergedWord.append(word2.charAt(i));
        }

        mergedWord.append(word1.substring(length));
        mergedWord.append(word2.substring(length));

        return mergedWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
