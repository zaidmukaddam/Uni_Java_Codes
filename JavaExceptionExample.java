public class JavaExceptionExample {
    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");
        try {
            // code that may raise exception
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}