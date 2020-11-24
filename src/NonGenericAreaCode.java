import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NonGenericAreaCode<T extends Runnable> {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("sandeep");
		m1(al);
		System.out.println(al);
	}

	private static void m1(ArrayList al) {
		al.add(1);
		al.add(10.3);
		ArrayList a = new ArrayList<String>();
		a.add(10);
		a.add("sa");
	}
	
	 public void ArrayList(Collection<? extends E> c) {
	        elementData = c.toArray();
	        if ((size = elementData.length) != 0) {
	            // c.toArray might (incorrectly) not return Object[] (see 6260652)
	            if (elementData.getClass() != Object[].class)
	                elementData = Arrays.copyOf(elementData, size, Object[].class);
	        } else {
	            // replace with empty array.
	            this.elementData = EMPTY_ELEMENTDATA;
	        }
	    }

}
