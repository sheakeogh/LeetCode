package ArrayString;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    /**
     *
     * @param candies an integer array where each candies[i] represents the number of candies the ith kid has
     * @param extraCandies an integer denoting the number of extra candies that you have
     * @return boolean array of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> outcomeList = new ArrayList<>();

        for (int i : candies) {
            maxCandies = Math.max(maxCandies, i);
        }

        for (int i : candies) {
            outcomeList.add((i + extraCandies) >= maxCandies);
        }

        return outcomeList;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
    }
}
