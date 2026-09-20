package Arrays;
import java.util.Arrays;

public class ShalowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] x = arr;      // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);

        int[] deep = Arrays.copyOf(arr,arr.length);  // Deep copy of arr or brand new array as it is
        deep[0] = 90;
        System.out.println(deep[0]);
        System.out.println(arr[0]);

    }
}
