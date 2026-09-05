import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //For n num of rows and colums
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        for (int i=1;i<=row;i++){
//            for (int j=1;j<=col ;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //2
//        int n= sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

        //3
//        int a = sc.nextInt();
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=a;j++){
//                System.out.print((char) ('A' + j-1) + " ");
//
//            }
//            System.out.println();
//        }

        //4
//        int a = sc.nextInt();
//        for (int i=1;i<=a;i++){
//            for (int j=1;j<=a;j++){
//                System.out.print((char) ('a' + j-1) + " ");
//
//            }
//            System.out.println();
//        }

        //5
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }

        //6
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print((char) ('A'+ i-1)+ " ");
//            }
//            System.out.println();
//        }

        //7
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print((char) ('a'+ i-1)+ " ");
//            }
//            System.out.println();
//        }

        //8
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)('A'+ j-1)+" ");
//            }
//            System.out.println();
//        }

        //9
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)('A'+ i-1)+" ");
//            }
//            System.out.println();
//        }

        //10
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if (i%2==0) {
//                    System.out.print((char) ('A' + j - 1) + " ");
//                }else {
//                    System.out.print(j+ " ");
//                }
//            }
//            System.out.println();
//        }

        //11
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char) ('A'+ j-1)+ " ");
//            }
//            System.out.println();
//        }

        //12
//        int n =sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j = 1; j <= n - i + 1; j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        // or
//        int n =sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        //13
//        int n =sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j = 1; j <= n - i + 1; j++){
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }

        //14
//        int n= sc.nextInt();
//        int a=n;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=a;j++){
//                System.out.print("* ");
//            }
//            a--;
//            System.out.println();
//        }

        //15
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        for (int i=1;i<=row;i++){
//            for (int j=1;j<=col ;j++){
//                if (i==1 || i==row || j==1 || j==col){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //16
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==3 || j==3){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //17
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == j || i + j == n + 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//
//        }

        //18
//        int n=sc.nextInt();
//        int a=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(a++ +" ");
//            }
//            System.out.println();
//        }

        //19
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if ((i+j)%2==0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        //20
//        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            int a=1;
//            for (int j=1;j<=i;j++){
//                System.out.print(a +" ");
//                a=a+2;
//
//            }
//
//            System.out.println();
//        }

        //vertically flipped triangle
        //21
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i+j>n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //22
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            int a =1;
//            for (int j=1;j<=n;j++){
//                if (i+j>n){
//                    System.out.print(a+ " ");
//                    a++;
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //23
//        int n = sc.nextInt();
//
//        char a = 'A';
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n; j++) {
//
//                if (i + j > n) {
//                    System.out.print(a + " ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            a++;
//            System.out.println();
//        }

        //24
//        int n =sc.nextInt();
//        for (int i=1;i<=n;i++){
//
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //25
//        int n =sc.nextInt();
//        for (int i=1;i<=n;i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //26
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("  ");
//            }
//
//            for (int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        //27
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n; j++) {
//
//                if (j < i) {
//                    System.out.print("- ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//
//            System.out.println();
//        }

        //pyramid
        //28
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            // stars
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


        //practice
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if ((i+j)%2==0){
//                    System.out.print("1");
//                }else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        int n=sc.nextInt();
//        int a=1;
//        for (int i=1;i<=n;i++){
//
//            for (int j=1;j<=i;j++){
//                System.out.print(a+ " ");
//                a++;
//
//            }
//
//            System.out.println();
//        }


        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }



    }
}