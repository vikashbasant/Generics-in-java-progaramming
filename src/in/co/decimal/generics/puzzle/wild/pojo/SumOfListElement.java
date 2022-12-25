package in.co.decimal.generics.puzzle.wild.pojo;

import java.util.ArrayList;
import java.util.List;

public class SumOfListElement {

	// here "extends" are called upper bounded wildCards.
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// here this is called lower bound wildcards.
	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);

	}
	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

		System.out.println(sumOfNumberList(List.of(1.9, 2.8, 3.0, 4.1, 5.4)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l)));
	}
}
