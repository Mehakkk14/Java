package Methods;

public class Syntax {
    //EX 1
//    public static void main(String[] args) {
//        System.out.println("This is main method/function and this is the primary function");
//        mahak();
//    }
//
//    public static void mahak(){
//        System.out.println("This is the secondary method created by user");
//    }

    //Ex2

    public static void shravan() {
        karan();
        System.out.println("Khushi");
    }

    public static void main(String[] args) {
        riyanshi();
    }

    public static void karan() {
        System.out.println("YASHVIKAS");
    }

    public static void riyanshi() {
        System.out.println("Ajay");
        shravan();
    }
}
