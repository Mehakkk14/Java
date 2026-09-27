package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        //Simple approach
//        int[] arr = {2,6,14,5,9,7,3,1};
//
//        for (int i= arr.length - 1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }

        //Two pointer approach

        int[] arr = {4,5,2,6,14,2,9,7,3};

        int left = 0;
        int right = arr.length-1;

        while (left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = arr[temp];

            left++;
            right--;
        }

        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
