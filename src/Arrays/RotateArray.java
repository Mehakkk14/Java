package Arrays;

public class RotateArray{
    public static void main(String[] args) {

        //Rotate left by d
        int[] arr = {4,5,2,6,14,2,9,7,3};
        int d = 3;
        int n = arr.length;

        reverse(arr, 0 , d-1);

        reverse(arr, d , n-1);

        reverse(arr, 0 , n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int[] arr ,int left, int right){

        while (left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
}