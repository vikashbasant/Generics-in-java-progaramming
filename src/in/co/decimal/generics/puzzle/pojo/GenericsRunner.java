package in.co.decimal.generics.puzzle.pojo;

public class GenericsRunner {



	public static void main(String[] args) {



		// MyCustomList is only work for Number type: Integer, Long, Double, Byte,
		// Float, Short

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(10));
		Integer number = list2.get(0);
		System.out.println("Element at index 0 in list2: " + number);

		MyCustomList<Double> list = new MyCustomList<>();
		list.addElement(Double.valueOf(5.9));
		list.addElement(Double.valueOf(10.7));
		Double number1 = list.get(0);
		System.out.println("Element at index 0 in list2: " + number1);
	}
}
