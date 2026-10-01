package Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {

        //Brute force for sorted or unsorted array
        int[] nums = {3, 8, 5, 2, 7};
        int target = 10;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + "," + nums[j]);
                }
            }
        }

        //2 Pointer for sorted array

        int[] arr = {2, 7, 11, 15};
        int aim = 9;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == aim) {
                System.out.println("Found at index: " + left + " and " + right);
                break;
            } else if (sum > aim) {
                right--;
            } else {
                left++;
            }
        }
    }
}
