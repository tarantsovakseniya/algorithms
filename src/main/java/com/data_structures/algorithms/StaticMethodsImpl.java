package com.data_structures.algorithms;

public class StaticMethodsImpl {
	public static void main(String[] args) {
		System.out.println("Absolute int: " + abs(-5));
		System.out.println("Absolute double: " + abs(-5.6));
		System.out.println("Prime number: " + isPrime(4));

		// compute square root for each command line parameter
		System.out.print("Newton's method: ");
		double a[] = new double[] { 5.1, 2.3, 7.8, 9.0, 24.4, 7.5, 1.0 };
		for (int i = 0; i < a.length; i++) {
			double x = sqrt(a[i]);
			System.out.print(x + " ");
		}
		
		System.out.println("\nHarmonic number: " + harmonic(43));
	}

	// get absolute value for int
		public static int abs(int x) {
			if (x < 0)
				return -x;
			else
				return x;
		}

	// get absolute value for double
		public static double abs(double x) {
			if (x < 0.0)
				return -x;
			else
				return x;
		}

	// check for prime number
	// fyi: a prime number is a whole number greater than 1 whose only factors are 1
	// and itself.
		public static boolean isPrime(int x) {
			if (x < 2)
				return false;
			for (int i = 2; i * i <= x; i++)
				if (x % i == 0)
					return false;
	
			return true;
		}

	// return the square root of c, computed using Newton's method
		public static double sqrt(double c) {
			if (c < 0)
				return Double.NaN;
			double EPSILON = 1E-15;
			double t = c;
			while (Math.abs(t - c / t) > EPSILON * t)
				t = (c / t + t) / 2.0;
			return t;
		}

	// harmonic number
		public static double harmonic(int n) {
			double sum = 0.0;
			for (int i = 1; i <= n; i++) {
				sum += 1.0 / i;
			}
			return sum;
		}
}
