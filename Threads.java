class Thread1 extends Thread{
	public void run()
	{
		System.out.println("Hello All : Thread 1");
	}
}

class Thread2 extends Thread{
	public void run()
	{
		System.out.println("Hello All : Thread 2");
	}
}

class Thread3 extends Thread{
	public void run()
	{
		System.out.println("Hello All : Thread 3");
	}
}

class Thread4 extends Thread{
	public void run()
	{
		System.out.println("Hello All : Thread 4");
	}
}

class Thread5 extends Thread{
	public void run()
	{
		System.out.println("Hello All : Thread 5");
	}
}

public class Threads {
    public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
