package Arrays;
import java.util.Arrays;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {10,20,30,44,65,69,72};
        output(arr);
    }

    public static void output(int[] arr){
        for (int i=0;i< arr.length;i++){
            if (i%2 == 0){
                System.out.print(arr[i]+10+" ");
            }else {
                System.out.print(arr[i]*2+" ");
            }
        }
        System.out.println();





    }
}
