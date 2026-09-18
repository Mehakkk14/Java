package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50,60};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }
    public static void change(int[] y){
        y[3] = 69;
    }
}
