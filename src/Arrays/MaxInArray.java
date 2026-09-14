package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr = {10,54,78,3,-2,99,14,6,117};

        int max = 0;

        for (int i =0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
