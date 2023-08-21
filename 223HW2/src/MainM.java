import java.io.File;
import java.util.Scanner;

public class MainM {
	public static void main(String args[])
	{
	    MergeSort ob = new MergeSort();
	    
	    Scanner rks = new Scanner(System.in);
		System.out.print("Input filename:");
		String Filename = rks.next();
		
		
		File file = new File(Filename);
		//scanner = new Scanner(file);
		
	    
		int numbers[] = readFiles(Filename);
	    

	    
	    int n = numbers.length;
		// you need to use Integer[] not int[] in order to use Comparable[]
		Integer[] arr = new Integer[n]; 
		//filling the array with integers coming from the txt file
		for(int i=0; i < n; i++)
		{
			arr[i] = numbers[i];
		}
	    
		System.out.println("The original array is:" + " ");
		ob.printArray(numbers,n);
	    ob.mergeSort(numbers,0,n-1);//passing 4-1 because array-index-counting starts from 0
	    System.out.println("\n"+"The array of integer values has been sorted in descending order by using the merge sort"
	    		+ " algorithm is:");
	    ob.printArray(numbers,n);
		
	    
	  
	}
	

private static int[] readFiles(String file) {
	try {
		File f = new File(file);
		Scanner s = new Scanner(f);
		int n = 0;

		while(s.hasNextInt())
		{
			n++;
			s.nextInt();
		}
		int S[] = new int[n];

		Scanner s1 = new Scanner(f);

		for(int i =0; i < S.length; i++)
			S[i] = s1.nextInt();

		return S;

	}
	catch(Exception e) {
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
