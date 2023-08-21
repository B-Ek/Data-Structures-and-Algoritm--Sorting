import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class MainIn {

	public static void main(String[] args) {
		// see no path
		Scanner rks = new Scanner(System.in);
		System.out.print("Input filename:");
		String Filename = rks.next();

		File file = new File(Filename);
		// scanner = new Scanner(file);

		if (Filename.equalsIgnoreCase("integers.txt")) {
			int numbers[] = readFiles(Filename);
			int n = numbers.length;
			// you need to use Integer[] not int[] in order to use Comparable[]
			Integer[] arr = new Integer[n];
			// filling the array with integers coming from the txt file
			for (int i = 0; i < n; i++) {
				arr[i] = numbers[i];
			}

			Insertion sort1 = new Insertion();

			System.out.println("Integers are reading from the integers.txt file, the array is:" + " ");
			sort1.printArray(numbers);
			// sort the array
			sort1.insertionSort(numbers);
			System.out.println(
					"The array has been sorted in increasing order by using the insertion sort algorithm:" + " ");
			sort1.printArray(numbers);

			// printArray(arr);

		} else if (Filename.equalsIgnoreCase("doubles.txt")) {

			double numbers[] = readFiles2(Filename);
			double n = numbers.length;
			// you need to use Integer[] not int[] in order to use Comparable[]
			Double[] arr = new Double[(int) n];
			// filling the array with integers coming from the txt file
			for (int i = 0; i < n; i++) {
				arr[i] = numbers[i];
			}

			Insertion sort1 = new Insertion();

			System.out.println("Integers are reading from the integers.txt file, the array is:" + " ");
			sort1.printArray2(numbers);
			// sort the array
			sort1.insertionSort2(numbers);
			System.out.println(
					"The array has been sorted in increasing order by using the insertion sort algorithm:" + " ");
			sort1.printArray2(numbers);

		}
	}

	private static int[] readFiles(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while (s.hasNextInt()) {
				n++;
				s.nextInt();
			}
			int S[] = new int[n];

			Scanner s1 = new Scanner(f);

			for (int i = 0; i < S.length; i++)
				S[i] = s1.nextInt();

			return S;

		} catch (Exception e) {
			return null;
		}
	}

	private static double[] readFiles2(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while (s.hasNextDouble()) {
				n++;
				s.nextDouble();
			}
			double[] S = new double[n];

			Scanner s1 = new Scanner(f);

			for (int i = 0; i < S.length; i++)
				S[i] = s1.nextDouble();

			return S;

		} catch (Exception e) {
			return null;
		}
	}

	public static void printArray(Integer[] arr)

	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
