package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {10,54,78,3,-2,99,14,6,117};
        int max = arr[0];  //Integer.MIN_VALUE;
        int max2 = arr[0];

        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
//        System.out.println(max);

        for(int i =0;i<arr.length;i++){

//            if (arr[i] == max) {
//                continue;
//            }
//
//            if (arr[i]>max2){
//                max2 = arr[i];
//            }
            //OR

            if (arr[i]>max2 && arr[i]!=max){
                max2 = arr[i];
            }

        }

        System.out.println(max2);








    }
}
