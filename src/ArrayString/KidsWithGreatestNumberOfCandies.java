package ArrayString;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

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
