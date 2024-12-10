package TwoPointers;

public class ContainerWithMostWater {

    /**
     *
     * @param height integer array
     * @return the maximum amount of water a container can store
     */
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            int area = (Math.min(height[left], height[right]) * (right - left));
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] arg) {
        System.out.println(maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
