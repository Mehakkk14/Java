package TwoPointer;

public class TwoSum {
    public static void main(String[] args) {
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
