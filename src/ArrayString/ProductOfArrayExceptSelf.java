package ArrayString;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /**
     *
     * @param nums integer array
     * @return Array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] answer = new int[nums.length];

        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        suffixProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefixProduct[i] * suffixProduct[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {-1, 1, 0, -3, 3})));
    }
}
