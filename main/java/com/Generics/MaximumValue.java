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
		System.out.println("Maximum value is " + max);
		return max;
	}

	public T findMax() {
		return MaximumValue.testMaximum(values);
	}
}
