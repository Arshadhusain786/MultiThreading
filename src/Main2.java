//Now we have two thread main and Rohit

public class Main2
{
    static class Rohit extends Thread  {
        @Override
        public void run() { //run is behave like a main function for rohit class
            for(int i = 0 ; i < 5; i++)
            {
                System.out.println("Rohit");
                try
                {
                    Thread.sleep(1);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) throws  InterruptedException
    {
        Rohit r=new Rohit();
        r.start();

        // start keyword use to call run function of thread class Rohit
        // At this point we face two threads
        //Rohit dont get the CPU immediately and tilled that time our for loop runs
        // which is taking very less time O(1) will  be executed.

        for(int i=0;i<5;i++)
        {
            System.out.println("virat");
            Thread.sleep(1);


          //  Thread.sleep(10); // if we allow delay in running for loop
            //using sleep or greater time complexity then rohit will execute first
            //on the basis of time slice.


        }

    }
}
