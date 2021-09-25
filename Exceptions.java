public class Exceptions {
    public void finalize() throws Throwable {
        System.out.println("Object garbage collected.");
    }

    public static void main(String[] args) throws Exception {
        final int a = 0;
        int b = 1;
        System.out.println("Jeet, K023");
        Exceptions obj = new Exceptions();
        obj = null;
        System.gc();
        try {
            System.out.println(b / a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution complete");
        }
    }
}