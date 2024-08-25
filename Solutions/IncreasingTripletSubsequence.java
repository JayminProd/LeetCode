package Solutions;

import java.util.ArrayList;
import java.util.List;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int first = 2147483647;
        int second = 2147483647;
        for (int num : nums) {
            if (num <= first) first = num;
            else if (num <= second) second = num;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        boolean output = new IncreasingTripletSubsequence().increasingTriplet(nums);
        System.out.println(output);

    }
}
