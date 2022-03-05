package collections;

import java.util.ArrayList;
import java.util.List;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List al = new ArrayList();
al.add("Hello");//0
al.add("hi"); //1
al.add("hello"); //2
System.out.println(al);
System.out.println(al.get(1));
System.out.println(al.get(2));
System.out.println(al.size());
	}

}
