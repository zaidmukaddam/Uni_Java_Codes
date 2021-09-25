public class FinallyExample {
    public static void main(String args[]) {
        FinallyExample obj = new FinallyExample();
        System.out.println("K039/Zaid Mukaddam");

        try {
            System.out.println("Inside try block");
            // below code throws divide by zero exception
            int data = 25 / 0;
            System.out.println(data);
        }
        // handles the Arithmetic Exception / Divide by zero exception
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        }
        // executes regardless of exception occurred or not
        finally {
            System.out.println("Hashcode is: " + obj.hashCode());
            obj = null;
            // calling the garbage collector using gc()
            System.gc();
            System.out.println("End of the garbage collection");
            System.out.println("finally block is always executed");
        }
    }

    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}