package com.data_structures.algorithms;

// implement a classic algorithm known as binary search
public class BinarySearch {
	public static void main(String[] args) {
		System.out.println(rank(9, new int []{-1,0,3,5,9,12}));
	}

	// binary search
	public static int rank(int key, int[] a) {
		// Preparation. Declare and initialize lowest and highest indexes of array
		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			// Searching for value of index in the middle (between lowest and highest):
			int mid = lo + (hi - lo) / 2;
			
			//Comparing value mid with a:
			if (key < a[mid])
				//Move to the left:
				hi = mid - 1;
			else if (key > a[mid])
				//Move to the right:
				lo = mid + 1;
			else
				//Done
				return mid;
		}
		return -1;
	}
}
