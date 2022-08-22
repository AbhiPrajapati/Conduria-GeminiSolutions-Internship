import java.util.HashSet;

public class HashSet2Practice {
    public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(30);
		hs.add(50);
		hs.add(30); // dublicate value
		System.out.println(hs); // Storing only unique value..
	}
}
