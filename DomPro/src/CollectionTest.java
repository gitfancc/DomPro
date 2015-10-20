import java.util.ArrayList;
import java.util.LinkedHashSet;


public class CollectionTest {
	
	public static void arrayTest(){
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		if (!list.contains("b")) {
			list.clear();
			list.add("a");
		}
	
		System.out.println(list.size());
		list.trimToSize();
		System.out.println("to trim:"+list.size());
	}

	public static void setTest(){
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add(null);
		list.add("a");
		list.add(null);
		System.out.println(list.size());
	}
	public static void main(String[] args){
		CollectionTest.setTest();
	}
}
