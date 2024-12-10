package ArrayString;

public class ReverseWordsOfString {

    /**
     *
     * @param s String
     * @return A string of the words in reverse order concatenated by a single space.
     */
    public static String reverseWords(String s) {
        String newS = "";
        String[] arr = s.split("\\s+");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                newS += arr[i] + " ";
            }
        }

        return newS.substring(0, newS.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
