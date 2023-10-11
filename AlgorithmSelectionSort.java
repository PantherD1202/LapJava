import java.util.Scanner;

public class AlgorithmSelectionSort {

	private static Scanner in = new Scanner(System.in);

	// check input a number integer
	private static int checkInputInt() {
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				return result;

			} catch (NumberFormatException e) {
				System.out.println("Please input number: ");
				System.out.println("Enter again: ");
			}
		}
	}

	// check input size of array
	private static int inputSizeOfValue() {
		System.out.println("Enter number of array: ");
		int n = checkInputInt();
		return n;
	}

	// check value of array
	private static int[] inputValueOfArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Array a[" + i + "] ");
			a[i] = checkInputInt();
		}
		return a;

	}

	private static void sortArrayBySectionSort(int[] a) {
		int len = a.length;
		System.out.println("Unsorted array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < len - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < len; j++)
				if (a[j] < a[min_idx])
					min_idx = j;
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;

		}
		System.out.println();
	}

	private static void print(int[] a) {
		System.out.println("After Sorted: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputSizeOfValue();
		int[] a = inputValueOfArray(n);
		sortArrayBySectionSort(a);
		print(a);

	}
// 5 1 12 -5 16 2 12 14
}
