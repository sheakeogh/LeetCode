package SlidingWindow;

public class MaximumNumberOfVowelsInSubstring {

    public static int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }

        }

        int maxCount = count;

        for (int i = k; i < s.length(); i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }

            if ("AEIOUaeiou".indexOf(s.charAt(i - k)) != -1) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }
}
