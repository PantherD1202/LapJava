import java.util.Random;
import java.util.Scanner;

public class AlgorithmMergeSort {

	private static Scanner sc = new Scanner(System.in);

	// Create function check
	private static int checkInput() {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input integer");
				System.out.print("Enter again: ");
			}
		}

	}

	// Create function input allow user input value of array
	private static int inputValueOfArray() {
		System.out.println("Enter number of array: ");
		int n = checkInput();
		return n;
	}

	// Create function random number input from keyboard
	private static int[] randomValueOfArray(int n, int min, int max) {
		int[] a = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(max - min + 1) + min;
			// *note nếu mãng a[i] đặt sau thì mãng sẽ = 0.
			a[i] = randomNumber;

		}

		return a;
	}

	void sort(int[] a, int left, int right) {
		if (left < right) {
			// find middle root
			int mid = (left + right) / 2;
			// ham de quy tiep tuc chia doi
			sort(a, left, mid);
			sort(a, mid + 1, right);

			merge(a, left, mid, right);

		}
	}

	void merge(int[] a, int left, int mid, int right) {
		// tim size cua 2 mang con de merge
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// tao mang tam
		int[] L = new int[n1];
		int[] R = new int[n2];

		// copy data vao mang tam
		for (int i = 0; i < n1; ++i)
			L[i] = a[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[mid + 1 + j];

		// merge cac mang tam
		// chi muc ban dau cua 2 mang con
		int i = 0, j = 0;
		// chi muc ban dau cua mang phu dc merge
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}

	}

	static void printArray(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + "  ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputValueOfArray();
		int a[] = randomValueOfArray(n, 1, 100);
		System.out.println("Unsorted array: ");
		printArray(a);
		AlgorithmMergeSort obj = new AlgorithmMergeSort();
		obj.sort(a, 0, a.length - 1);
		System.out.println("Sorted array: ");
		printArray(a);
	}

}
