package Arrays;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {10,-2,45,76,6,-7};

        int min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
