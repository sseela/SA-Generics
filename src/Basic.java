import java.util.ArrayList;
import java.util.Collection;

public class Basic {
	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		c.add("one");
		c.add(1);
		
		String s = (String)c.get(0);	//1. Compulsory we have to use type casting while retrieving elements.
		String s2 = (String)c.get(1);	//2. As heterogenous elements can be added to collections, hence in case of retrieval there can
											//be problem at runtime if we don't typecast the object properly.
		
		System.out.println(c);
	}
}
