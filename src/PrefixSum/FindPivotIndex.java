package PrefixSum;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i : nums) {
            totalSum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
    }
}
