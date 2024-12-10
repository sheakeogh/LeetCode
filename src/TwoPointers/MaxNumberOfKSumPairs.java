package TwoPointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

    /**
     *
     * @param nums integer array
     * @param k integer
     * @return the maximum number of operations you can perform on the array
     */
    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            }
            else if (sum > k) {
                right--;
            }
            else {
                left++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {1, 2, 3, 4}, 5));
    }
}
