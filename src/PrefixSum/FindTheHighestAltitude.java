package PrefixSum;

public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int i : gain) {
            altitude += i;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-5, 1, 5, 0, -7}));
    }
}