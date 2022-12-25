package in.co.decimal.generics.puzzle.pojo;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

	// this is generic type method:
	public static <X> X doubleValue(X value) {
		return value;
	}

	// now this method only used for only List: ArrayList, LinkedList, Vector.
	public static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {

		// here we are calling the generic method:
		// means जिस type का value pass करेंगे उसी type का value return करेगा
		String value = (new String());
		Integer value1 = (Integer.valueOf(5));
		ArrayList list1 = (new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
	}
}
