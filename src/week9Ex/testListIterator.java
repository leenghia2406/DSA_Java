package week9Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class testListIterator {
	
	public static int getPreviousOfElement(ListIterator<Integer>li, int target) {
		int result = -1;
		while (li.hasNext()) {
			int temp = li.next();
			if (temp == target) {
				li.previous();
			}
			result = li.previous();
		}
		return result;
	}
//	public static ArrayList<Integer> getElementOfOddPosition(ListIterator<Integer>li){
//		
//	}
	public static void main(String[] args) {
		    int[] array = {1, 3, 5, 7, 9};
		    List<Integer> list = new ArrayList<>();
		    for (int num : array) {
		        list.add(num);
		    }
		    ListIterator<Integer> li = list.listIterator();
		    System.out.println(li.hasNext()); // trả về true
		    System.out.println(li.next()); // trả về 1
		    System.out.println(li.next()); // trả về 3
		    System.out.println(li.previous()); // trả về 3
		    System.out.println(li.previous()); // trả về 1
	}
}

