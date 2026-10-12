package ArrayString;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int left = i == 0 ? 0 : flowerbed[i - 1];
            int right = i == flowerbed.length - 1 ? flowerbed[flowerbed.length - 1] : flowerbed[i + 1];
            int mid = flowerbed[i];
            if ((left + mid + right) == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    }
}
