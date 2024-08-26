package Solutions;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = nums.length - 1; i >= index; i--) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {2,1};
        moveZeroes.moveZeroes(nums);
        System.out.println(nums);
    }
}
