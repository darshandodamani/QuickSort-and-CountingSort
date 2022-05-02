package Assignment_1;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // User input
		System.out.println("Enter the size of an array: ");
		int l = s.nextInt();

		System.out.println("Enter the elements of the array: ");
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the max range of an array");
		int m = s.nextInt();
		int c = a.length;
		int[] count = new int[m + 1]; // Creating an array of zeroes
		int[] b = new int[c];
		x(c, count, a); // calling function
		y(m, count);
		z(c, a, b, count);

	}

	public static void x(int c, int count[], int a[]) {
		for (int i = 0; i < c; i++) {
			count[a[i]]++; // Counting the no of elements of input array
			System.out.println(Arrays.toString(count));
		}
	}

	public static void y(int m, int count[]) {
		for (int i = 1; i <= m; i++) {
			count[i] = count[i] + count[i - 1]; // By adding previous value incrementing the count
			System.out.println(Arrays.toString(count));
		}
	}

	public static void z(int c, int a[], int b[], int count[]) {
		for (int i = c - 1; i >= 0; i--) {
			b[--count[a[i]]] = a[i]; // Sorting of elements
			System.out.println(Arrays.toString(b));
		}
	}
}