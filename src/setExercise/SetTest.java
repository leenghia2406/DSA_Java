package setExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		String element1 = "AAA";
		String element2 = "Aaa";
		String element3 = "AAa";
		String element4 = "aaa";
//		Test time
		
//		Hash dựa trên hashcode
		long beginHash = System.nanoTime();
		hashSet.add(element1);
		hashSet.add(element2);
		hashSet.add(element3);
		hashSet.add(element4);
		long endHash = System.nanoTime();
		System.out.println(hashSet);
		System.out.println("Time process " + (endHash - beginHash));
		long beginLinkedHash = System.nanoTime();
		linkedHashSet.add(element1);
		linkedHashSet.add(element2);
		linkedHashSet.add(element3);
		linkedHashSet.add(element4);
		long endLinkedHash = System.nanoTime();
		System.out.println(linkedHashSet);
		System.out.println("Time process: " + (endLinkedHash - beginLinkedHash));
//		Tree set sắp xếp dựa trên hàm compareTo của chuỗi
		long beginTree = System.nanoTime();
		treeSet.add(element1);
		treeSet.add(element2);
		treeSet.add(element3);
		treeSet.add(element4);
		long endTree = System.nanoTime();
		System.out.println(treeSet);
		System.out.println("Time process: " + (endTree - beginTree));
	}
}
