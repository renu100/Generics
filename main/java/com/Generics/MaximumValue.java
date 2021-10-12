package com.Generics;

public class MaximumValue<T extends Comparable<T>> {
	T[] values;

	// create a parameterized constructor
	public MaximumValue(T[] values) {
		this.values = values;
	}

	// create a method which take a multiple value
	public static <T extends Comparable<T>> T testMaximum(T... values) {
		T max = values[0];
		for (T t : values) {
			if (t.compareTo(max) > 0)
				max = t;
		}
		printMax(max); //calling printMax method
		return max;

	}

	public T findMax() {
		return MaximumValue.testMaximum(values);
	}

	// method to print the maximum value
	public static <E> void printMax(E e) {
		System.out.println(" Maximum Value is" + e);
	}
}
