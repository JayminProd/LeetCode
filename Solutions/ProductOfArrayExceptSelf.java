package Solutions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] calculated = new int[nums.length];
        for (int i = 0; i < calculated.length; i++) {
            calculated[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    calculated[j] = calculated[j] * nums[i];
                }
            }
        }
        return calculated;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int[] calc = new ProductOfArrayExceptSelf().productExceptSelf(input);
        System.out.println(calc);
    }}
