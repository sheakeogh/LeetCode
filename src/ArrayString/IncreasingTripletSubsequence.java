package ArrayString;

public class IncreasingTripletSubsequence {

    /**
     *
     * @param nums integer array
     * @return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]
     */
    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i > mid) {
                return true;
            }

            if (i <= min) {
                min = i;
            }
            else {
                mid = i;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[] {20, 100, 10, 12, 5, 13}));
    }
}
