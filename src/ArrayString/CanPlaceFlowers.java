package ArrayString;

public class CanPlaceFlowers {

    /**
     *
     * @param flowerbed integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty
     * @param n integer of n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule
     * @return true or false if n flowers can be planted
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            int leftFlower = i == 0 ? 0 : flowerbed[i - 1];
            int rightFlower = i == (flowerbed.length - 1) ? flowerbed[flowerbed.length - 1] : flowerbed[i + 1];

            if ((leftFlower + flowerbed[i] + rightFlower) == 0) {
                flowerbed[i]++;
                count++;
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    }
}
