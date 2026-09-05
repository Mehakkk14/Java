import java.util.Scanner;

public class pattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the values of row and col: ");

        //1
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        for (int i=1;i<=row; i++){
//            for (int j=1;j<=col;j++){
//                System.out.print("@");
//            }
//            System.out.println();
//        }

        //2
//        int n = sc.nextInt();
//        for (int i=1;i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        //3
//        int n = sc.nextInt();
//        for (int i=1;i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print((char) (j+64) +" ");    //65 for A and 97 for a
//            }
//            System.out.println();
//        }


        //OR
//        int n = sc.nextInt();
//        for (int i=1;i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print((char)('a' + j - 1)+ " ");
//            }
//            System.out.println();
//        }

        //4
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n; j++){
//                System.out.print((char) ('A'+i-1)+" ");
//            }
//            System.out.println();
//        }

        //5
//        for (int i = 1; i <= 4; i++) {
//
//            for (int j = 1; j <= 4; j++) {
//
//                if (i == 1 || i == 3) {
//                    System.out.print((char) ('a' + i-1) + " ");
//                } else {
//                    System.out.print((char)('A' + i - 1) + " ");
//                }
//
//            }
//
//            System.out.println();
//        }

        //Triangles
        //1
//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //2
//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//        }

        //3
//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
//        }

        //4
//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)('A' + j - 1) + " ");
//
//            }
//            System.out.println();
//        }

        //5
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print((char) ('A'+i-1)+" ");
//            }
//            System.out.println();
//        }


        //6
//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if (i==1 || i==3 || i==5){
//                    System.out.print(j+ " ");
//                }else {
//                    System.out.print((char) ('A' + j - 1) + " ");
//                }
//
//            }
//            System.out.println();
//        }

        //7 horizontal traingle
//        int n = sc.nextInt();
//        for (int i=n; i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //8
//        int n = sc.nextInt();
//        for (int i=n; i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print((char) ('a' + j-1) + " ");
//
//            }
//            System.out.println();
//        }

        //9
        //Special patterns - Hollow rectangle

//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        for (int i=1; i<=n; i++){
//            for (int j=1;j<=m; j++){
//                if (i==1 || i==5|| j==1|| j==7){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //9  Star plus

//        int row= sc.nextInt();
//        int col= sc.nextInt();
//
//        for ( int i=1; i<=row;i++){
//            for (int j=1; j<=col; j++){
//                if (i==3 || j==3){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //10 diagnal X
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==j || i+j==n+1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //11 floyd's traingle

//        int n = sc.nextInt();
//        int a = 1;
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(a++ + " ");
//
//            }
//            System.out.println();
//        }

        //12 binary triangle

//        int n = sc.nextInt();
//        for (int i=1; i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if ((i+j)%2 == 0){
//                    System.out.print("1 ");
//                }else {
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }

        //13 odd number triangle

//        int n = sc.nextInt();
//        int a = 1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(a);
//            }
//            System.out.println();
//        }











    }
}
