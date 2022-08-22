import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0 ; i< 10 ; i++)
		{
			arr.add(i+10);
		}
		System.out.println(arr);
	}
}