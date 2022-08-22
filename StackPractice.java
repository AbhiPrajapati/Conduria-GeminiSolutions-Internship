import java.util.Stack;

public class StackPractice {
   public static void main(String[] args) {
	int sum = 0;
	Stack<Integer> stack = new Stack<>();
	stack.add(50);
	stack.add(20);
	stack.add(30);
	stack.add(10);
	stack.add(30);
	stack.add(50);
	
	System.out.println(stack);
	for(int i =0 ; i< stack.size() ; i++)
	{
		sum += stack.get(i);
	}
	System.out.println("Sum of 6 no's in stack is : "+ sum);
	
	System.out.println("Popped element : " + stack.pop());
	System.out.println("Popped element : " + stack.pop());
	System.out.println(stack);
}
}
