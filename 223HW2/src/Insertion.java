import java.util.Arrays;

public class Insertion  { 
	/*public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        insertionSort(A);
        System.out.println("\nAfter Sorting: ");
        printArray(A);
    }*/

    /**
     * This method will sort the integer array using insertion sort algorithm
     */
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int valueToSort = a[i];
            int j = i;
            while (j > 0 && a[j - 1] < valueToSort) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = valueToSort;
        }
    }
    
    public static void insertionSort2(double[] a) {
        for (int i = 1; i < a.length; i++) {
            double valueToSort = a[i];
            int j = i;
            while (j > 0 && a[j - 1] < valueToSort) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = valueToSort;
        }
    }

    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }

    
    public static void printArray2(double[] B) {
        System.out.println(Arrays.toString(B));
    }
}



