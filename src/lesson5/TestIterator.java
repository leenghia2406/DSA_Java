package lesson5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
	public static void main(String[] args) {
		String[]students = {"Vo Tac Thien", "Duong Minh Hoang", 
				"Luong Son Ba"};
		Iterator<String>iter = Arrays.asList(students).iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.next());
		ListIterator<String>iterlist = Arrays.asList(students).listIterator();
		System.out.println(iterlist.next());
		System.out.println(iterlist.next());
//		previous: trở lại vị trí ban đầu 1 step
		System.out.println(iterlist.previous());
	}
}
