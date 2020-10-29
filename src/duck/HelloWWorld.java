package duck;
import java.util.ArrayList;
import java.util.HashMap;

public class HelloWWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
		System.out.println("Hello Java World");
		}
		var j = 5;
		boolean b = true;
		Integer B = null;
		String s = "Mark";
		int[] ints = new int[] {1,2,3,4,5};
		int[] big = new int[10];
		//equivalent to List<int>
		ArrayList<Integer> ints2 = new ArrayList<Integer>();
		ints2.add(j);
		//Equivalent to dictionary
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Dog");
		var sum = 0;
		for(var k:ints) {
			sum+= k;
		}
		System.out.println("sum is " + sum);
	}

}
