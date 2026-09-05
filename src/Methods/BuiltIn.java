package Methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Maths builtin methods
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(125));
        System.out.println(Math.abs(165));

        //Print max of three num using math.max()

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3= sc.nextInt();
        int n4=sc.nextInt();

//        int max1 = Math.max(n1,n2);
//        int mainMax = Math.max(max1,n3);

        //OR

        int max = Math.max(Math.max(Math.max(n1,n2),n3),n4);

        System.out.println("The max of these 3 numbers is "+ max);




    }
}
