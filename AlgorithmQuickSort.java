import java.util.Random;
import java.util.Scanner;

public class AlgorithmQuickSort {

	final static Scanner sc = new Scanner(System.in);

	private static int checkInputInteger() {
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

	int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {

			// Nếu phần tử hiện tại nhỏ hơn chốt
			if (a[j] < pivot) {
				i++;

				// swap arr[i] và arr[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		// swap arr[i+1] và arr[high] (hoặc pivot)
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;

		return i + 1;
	}

	// arr[] --> Mảng cần được sắp xếp,
	// low --> chỉ mục bắt đầu,
	// high --> chỉ mục kết thúc
	void sort(int a[], int low, int high) {
		if (low < high) {

			// pi là chỉ mục của chốt, arr[pi] vị trí của chốt
			int pi = partition(a, low, high);

			// Sắp xếp đệ quy các phần tử
			// trướcphân vùng và sau phân vùng
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	// In các phần tử của mảng
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

		System.out.println("Unsorted array  ");
		printArray(a);
		AlgorithmQuickSort ob = new AlgorithmQuickSort();
		ob.sort(a, 0, n - 1);
		System.out.println("Sorted array  ");
		printArray(a);
	}

}
