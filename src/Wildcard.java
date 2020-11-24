import java.util.ArrayList;
import java.util.List;

public class Wildcard {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		m1(l);
		
	}

	private static void m1(List<? extends Integer> l) {
		l.add(null);
		System.out.println(l);
		
	}
}
