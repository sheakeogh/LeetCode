package TwoPointers;

public class MoveZeroes {

    /**
     *
     * @param nums integer array
     * Move all the zeroes in the array to the end of the array
     */
    public static void moveZeroes(int[] nums) {
        int prevNonZero = -1;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != 0) {
                prevNonZero++;

                int tmp = nums[prevNonZero];
                nums[prevNonZero] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {0, 1, 0, 3, 12});
    }
}
