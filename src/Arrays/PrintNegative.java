package Arrays;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Myself

//        int[] arr3 = {10,-9,7,-4,34,-2};
//        for (int i = 0; i< arr3.length; i++){
//            if (arr3[i]<=0){
//                System.out.println(arr3[i]+" ");
//            }
//        }

        //OR
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr4 = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i=0;i<n;i++){
            arr4[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            if (arr4[i]<0){
                System.out.print(arr4[i]+" ");
            }
        }


    }
}
