package SlidingWindow;

public class MaximumAverageSubarrayI {

    /**
     *
     * @param nums integer array
     * @param k integer
     * @return double which is the maximum average of a subarray of nums with length k
     */
    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = nums.length == 1 ? nums[0] : Integer.MIN_VALUE;

        for (int i = 0; i < (nums.length - k + 1); i++) {
            int tmpSum = 0;
            for (int j = 0; j < k; j++) {
                tmpSum += nums[i + j];
            }

            if (tmpSum > maxSum) {
                maxSum = tmpSum;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {3}, 1));
    }
}