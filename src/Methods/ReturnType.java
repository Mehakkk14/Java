package Methods;

public class ReturnType {
    public static int work(){
        System.out.println("Hello Hi");
        System.out.println("How r u?");

        return 10;     //End of method
    }

    public static void main(String[] args) {
        System.out.println("Hello Boss");
        work();

        System.out.println(3+work());

//        int x=work();
//        System.out.println(7+x);

//        work();                  //Stand Alone call
    }
}
