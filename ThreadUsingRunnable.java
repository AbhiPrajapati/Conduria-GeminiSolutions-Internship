
class NewThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello All : "+ Thread.currentThread().getName());
	}
	
}
public class ThreadUsingRunnable {
    public static void main(String[] args) {
//		Runnable newThread = new NewThread();
    	Thread t1 = new Thread(new NewThread());
    	Thread t2 = new Thread(new NewThread());
    	Thread t3 = new Thread(new NewThread());
    	Thread t4 = new Thread(new NewThread());
    	Thread t5 = new Thread(new NewThread());
    	t1.start();
    	t2.start();
    	t3.start();
    	t4.start();
    	t5.start();
		
	}
}
