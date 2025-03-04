package stream_learnings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5};
		//IntStream c = Arrays.stream(ar);
		//c = c.sorted();
		//System.out.println(c.count());
		
		Arrays.stream(ar).sorted().forEach(no -> System.out.println(no));
		

	}

}
