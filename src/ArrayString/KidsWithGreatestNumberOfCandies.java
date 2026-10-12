package ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int nums : candies) {
            if (extraCandies + nums < max) {
                result.add(false);
            }
            else {
                result.add(true);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    }
}
