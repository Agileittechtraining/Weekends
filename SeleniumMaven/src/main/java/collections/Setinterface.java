package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs = new HashSet();
hs.add("Hello");
hs.add("Hello");
hs.add("Hi");
hs.add("How are you");
System.out.println(hs);
Iterator i = hs.iterator();
System.out.println(i.next());
System.out.println(i.next());
System.out.println(i.next());

	}

}
