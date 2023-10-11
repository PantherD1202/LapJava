import java.util.Random;
import java.util.Scanner;

public class AlgorithmInsertionSort {

	private static Scanner sc = new Scanner(System.in);

	// create function check input integer
	private static int checkInputInteger() {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;

			} catch (NumberFormatException e) {
				System.out.print("Please input integer ");
				System.out.print("Enter again: ");
			}
		}
	}

	// allow user input value of array
	private static int inputValueOfArray() {
		System.out.print("Enter number of array: ");
		int n = checkInputInteger();
		return n;
	}

	private static int[] randomValueOfArray(int n, int min, int max) {
		int[] a = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(max - min + 1) + min;
			a[i] = randomNumber;
		}

		return a;
	}

	private static void sortArrayByInsertionSort(int[] a) {
		System.out.println("Unsorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		System.out.println();
	}

	private static void print(int[] a) {
		System.out.println("Sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputValueOfArray();
		int[] a = randomValueOfArray(n, 1, 100);
		sortArrayByInsertionSort(a);
		print(a);

	}
// array 7 -5 2 16 4
}
