
public class Main3
{
    static class Rohit implements Runnable
    {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Rohit");
            }
         }

        }
    public static void main(String[] args) throws InterruptedException {
        // Runnable
        Rohit r = new Rohit();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("virat");
            Thread.sleep(1);
        }
    }
}
