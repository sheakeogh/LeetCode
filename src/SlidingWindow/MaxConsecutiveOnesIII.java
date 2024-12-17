package SlidingWindow;

public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }

            right++;

            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
        }
        
        return right - left;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }
}