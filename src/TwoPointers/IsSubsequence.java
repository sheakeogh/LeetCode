package TwoPointers;

public class IsSubsequence {

    /**
     *
     * @param s String
     * @param t String
     * @return true if s is a subsequence of t, or false otherwise
     */
    public static boolean isSubsequence(String s, String t) {
        int count = s.length();
        int j = 0;

        if (s.isEmpty() && !t.isEmpty()) {
            return true;
        }
        else if (!s.isEmpty() && t.isEmpty()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                count--;
                j++;
                if (count == 0) {
                    break;
                }
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }
}
