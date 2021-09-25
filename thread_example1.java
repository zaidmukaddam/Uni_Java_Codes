public class thread_example1 implements Runnable {
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        System.out.println("K039/Zaid Muakddam");
        Thread guruthread1 = new Thread();
        guruthread1.start();
        try {
            guruthread1.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        guruthread1.setPriority(1);
        int gurupriority = guruthread1.getPriority();
        System.out.println(gurupriority);
        System.out.println("Thread Running");
    }
}
