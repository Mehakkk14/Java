package Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 2, 7};
        int target = 10;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
