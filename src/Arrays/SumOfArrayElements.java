package Arrays;
import java.util.Scanner;

public class SumOfArrayElements{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);

        //OR

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        int sum2 =0;

        for (int i =0; i<n2; i++){
            arr2[i]= sc.nextInt();
            sum2 += arr2[i];
        }

        System.out.println(sum2);


    }
}
