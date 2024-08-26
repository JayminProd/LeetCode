package Solutions;

import java.util.Arrays;

public class MaxNumbersOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) {
                if (nums[i] < nums[j]) {
                    j--;
                } else {
                    i++;
                }
            } else {
                if (nums[i] < nums[j]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int result = new MaxNumbersOfKSumPairs().maxOperations(nums, 2);
        System.out.println(result);

    }
}
