package SlidingWindow;

public class LongestSubarrayOf1sAfterDeletingOneElement {

    public static int longestSubarray(int[] nums) {
        int count = 0;
        int zeros = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros == 2) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            count = Math.max(count, (right - left));
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[] {1,1,0,1}));
    }
}
