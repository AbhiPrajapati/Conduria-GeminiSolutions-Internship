import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePractice {
   public static void main(String[] args) {
	   int sum = 0;
	   PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		
		System.out.println(queue);
		Iterator iter = queue.iterator();
		while(iter.hasNext())
		{
			String val = iter.next().toString();
			sum += Integer.parseInt(val);
		}
		System.out.println("Sum of all 6 elements is : " + sum);
		
		System.out.println("removed element : " + queue.poll()); //1st element is removed
		System.out.println("removed element : " + queue.poll()); // 2nd element is removed
		
		System.out.print("After Removing two elements from the Queue : ");
		System.out.println(queue);
}
}