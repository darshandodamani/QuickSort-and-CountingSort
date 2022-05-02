package Assignment_1;
import java.util.Scanner;

public class QuickSortMiddle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // user inputs

		System.out.println("Enter the size of an array:");
		int l = s.nextInt();

		System.out.println("Enter the elements of the array");
		int[] arr = new int[l];

		for (int i = 0; i < l; i++) {
			arr[i] = s.nextInt();
		}

		int len = arr.length;
		QuickSortMiddle qsm = new QuickSortMiddle();
		qsm.QuickSortMiddleRecursion(arr, 0, len - 1); // Calling QuickSort function
		qsm.printArray(arr);
	}

	int partition(int[] arr, int l, int h) /*
											 * Partition of array elements by considering mean element as reference and
											 * comparing with other elements from left side and right side of reference
											 */
	{
		int ref = arr[(l + h) / 2];
		while (l <= h) {
			while (arr[l] < ref) {
				l++;

			}
			while (arr[h] > ref) {
				h--;

			}
			if (l <= h) {
				int temp = arr[l]; // swapping of elements
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
				h--;

			}
		}

		return l;
	}

	void QuickSortMiddleRecursion(int[] arr, int l, int h) // Recursively sorting subarrays and combining them
	{
		int p = partition(arr, l, h);
		if (l < p - 1)

		{
			QuickSortMiddleRecursion(arr, l, p - 1);
		}
		if (p < h) {
			QuickSortMiddleRecursion(arr, p, h);
		}

	}

	void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}