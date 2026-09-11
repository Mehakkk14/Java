package Methods;
import java.util.Scanner;

public class PermutationAndCombination {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nr = n-r;
//
//        int nFact = 1;
//        for (int i=1;i<=n;i++){
//            nFact *=i;
//        }
//
//        int rFact = 1;
//        for (int i=1;i<=r;i++){
//            rFact *=i;
//        }
//
//        int nrFact = 1;
//        for (int i=1;i<=nr;i++){
//            nrFact *=i;
//        }
//
//        int Factorial = nFact/(rFact*nrFact);
//
//        System.out.println(Factorial);
//
//
//
//    }


    //OR

    public static int fact(int num){
        int fact = 1;
        for (int i =1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int Factorial = fact(n)/(fact(r)*fact(n-r));
        System.out.println(Factorial);
    }
}
