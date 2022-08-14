
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo implements Runnable{
   private int val ;
   
   //Constructor
   ThreadDemo(int val)
   {
	   this.val = val;
   }
   
	@Override
	public void run() {
		
		//Can print 1 - 10 with for loop too... But only one Thread is going to work So instead of working with for loop 
		//Demonstrating with passing single values to different Threads
		System.out.println(val + " : "+ Thread.currentThread().getName());
		
	}
	
}
public class ThreadPoolPractice {
    public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//Thread Pool of fixed size 5
		//Making Different Threads to Demonstrate how Thread pool Works..
		// Runnable process = new ThreadDemo(1);
		// executor.execute(process);
		// executor.execute(new ThreadDemo(2));
		// executor.execute(new ThreadDemo(3));
		// executor.execute(new ThreadDemo(4));
		// executor.execute(new ThreadDemo(5));
		// executor.execute(new ThreadDemo(6));
		// executor.execute(new ThreadDemo(7));
		// executor.execute(new ThreadDemo(8));
		// executor.execute(new ThreadDemo(9));
		// executor.execute(new ThreadDemo(10));

		for(int i =0 ; i< 10 ; i++)
		{
			executor.execute(new ThreadDemo(i+1));
		}
		executor.shutdown();
	}
}
