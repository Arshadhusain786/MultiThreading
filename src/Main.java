public class Main {
   static class Rohit{
        public void run()
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Rohit");

            }
        }
   }
    //Single thread application...
    //here main is thread
    public static void main(String[] args) throws InterruptedException {
      Rohit r=new Rohit();
      r.run();

      for(int i=0;i<5;i++)
      {
          System.out.println("virat");
          Thread.sleep(2000);  // CPU so jaega 2 sec k liye aur virat ko
          // 2 sec break kr kr ke print krega
      }
        //thread is a inbuilt class in java

    }
}