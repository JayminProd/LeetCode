package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int highestCandyAmount = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies > highestCandyAmount);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        List<Boolean> list = kidsWithCandies(candies, 3);
        System.out.println(list);
    }
}
