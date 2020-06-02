package com.data_structures.algorithms;

import java.util.Arrays;

public class ArraysProcessing {
	public static void main(String[] args) {

		int array[] = new int[] { 5, 2, 7, 9, 24, 790, 1 };

		// searching for max value
			int max = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > max)
					max = array[i];
			}
			System.out.println("max value: " + max);

		// searching for average value
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			int mid = sum / array.length;
			System.out.println("average value: " + mid);

		// copy values to external array
			int external[] = new int[array.length];
			for (int i = 0; i < array.length; i++) {
				external[i] = array[i];
			}
			System.out.println("copy: " + Arrays.toString(external));

		// reverse order
			int reverse[] = array;
			for (int i = 0; i < reverse.length / 2; i++) {
				int temp = reverse[i];
				reverse[i] = reverse[reverse.length - 1 - i];
				reverse[reverse.length - 1 - i] = temp;
			}
			System.out.println("reverse: " + Arrays.toString(reverse));
			System.out.println("reverse: " + Arrays.toString(array)); // This situation is known as aliasing
	}
}
