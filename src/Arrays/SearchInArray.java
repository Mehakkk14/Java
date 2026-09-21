package Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        boolean found = false;

        int[] arr = {12,22,45,69,6,14};


        for (int i=0;i< arr.length;i++) {
            if (arr[i]==element){
                System.out.print("Element exist at index "+ i);
                found = true;
                break;
            }

            if (found = false){
                System.out.print("Element not exist");
            }
        }

    }
}
