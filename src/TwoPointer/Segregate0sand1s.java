package TwoPointer;

public class Segregate0sand1s {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,0,1,1};

        int left = 0;
        int right = arr.length-1;

        while (left < right) if (arr[left] == 0) {
            left++;
        } else if (arr[right] == 1) {
            right--;
        } else {
            swap(arr, left, right);
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];

        arr[left] = arr[right];

        arr[right] = temp;
    }
}
