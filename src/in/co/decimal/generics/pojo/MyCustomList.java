package in.co.decimal.generics.pojo;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public void printList() {
		for (T ele : this.list) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "MyCustomList [list=" + this.list + "]";
	}

	public T get(int index) {
		return this.list.get(index);
	}
}
