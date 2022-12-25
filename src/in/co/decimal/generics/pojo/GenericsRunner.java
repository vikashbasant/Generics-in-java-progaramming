package in.co.decimal.generics.pojo;

public class GenericsRunner {
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);
		System.out.println("Element at index 0 in list: " + value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(10));
		Integer number = list2.get(0);
		System.out.println("Element at index 0 in list2: " + number);
	}
}
