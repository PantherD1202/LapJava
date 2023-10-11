import java.util.Random;
import java.util.Scanner;

public class AlgorithmBubbleSort {

	private static Scanner sc = new Scanner(System.in);

	// check user input a number integer
	private static int checkInputInt() {
		// loop until user input correct
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input number: ");
				System.out.println("Enter again: ");
			}
		}
	}

	// allow user input number of array
	private static int inputSizeOfArray() {
		System.out.println("Enter number of array: ");
		int n = checkInputInt();
		return n;
	}

	// allow user input value of array
//	private static int[] inputValueOfArray(int n) {
//		int[] a = new int[n];
//		for (int i = 0; i < n; i++) {
//			System.out.print("Enter a[" + i + "]: ");
//			a[i] = checkInputInt();
//		}
//		return a;
//	}

	//
	private static int[] randomValueOfArray(int n, int min, int max) {
		int[] a = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(max - min + 1) + min;
			a[i] = randomNumber;
		}

		return a;
	}

	// swap 2 number
	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("hello");
	}

	// sort array by bubble sort
	private static void sortArrayByBubbleSort(int[] a) {
		System.out.println("Unsorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println();
	}

	// display array after sort
	private static void print(int[] a) {
		System.out.println("Sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputSizeOfArray();
		// int[] a = inputValueOfArray(n);
		int[] a = randomValueOfArray(n, 1, 100);

		sortArrayByBubbleSort(a);
		print(a);

	}

}
