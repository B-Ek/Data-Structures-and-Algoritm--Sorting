import java.io.*;
import java.util.*;

class RouteSort implements Comparable<RouteSort> {
	String source;
	String destination;

	public RouteSort(String x, String y) {
		this.source = x;
		this.destination = y;
	}

	public String toString() {
		return source + " " + destination;
	}

	@Override
	public int compareTo(RouteSort a) {
//        // if the string are not equal
//        if (this.source.compareTo(a.source) != 0) {
//            return this.source.compareTo(a.source);
//        }
//        else {
//            // we compare lastName if firstNames are equal
//            return this.destination.compareTo(a.destination);
//        }
		int biggest = a.source.length();
		if (a.source.length() < this.source.length()) {
			biggest = this.source.length();
		}
		for (int i = 0; i < biggest; i++) {
			if (this.source.charAt(i) < a.source.charAt(i))
				return -1;
			else if (this.source.charAt(i) > a.source.charAt(i))
				return 1;

		}
		 biggest = a.destination.length();
		if (a.destination.length() < this.destination.length()) {
			biggest = this.destination.length();
		}
		for (int i = 0; i < biggest; i++) {
			if (this.destination.charAt(i) < a.destination.charAt(i))
				return -1;
			else if (this.destination.charAt(i) > a.destination.charAt(i))
				return 1;

		}
		return 0;
	}
}

public class GNG {
	public static void main(String[] args) {

		RouteSort a1 = new RouteSort("Ankara", "Antalya");
		RouteSort a2 = new RouteSort("Ankara", "Istanbul");
		RouteSort a3 = new RouteSort("Istanbul", "Antalya");
		RouteSort a4 = new RouteSort("Antalya", "Izmir");
		RouteSort a5 = new RouteSort("Izmir", "Antalya");
		RouteSort a6 = new RouteSort("Izmir", "Ankara");
		RouteSort a7 = new RouteSort("Antalya", "Ankara");
		RouteSort a8 = new RouteSort("Ankara", "Izmir");
		RouteSort a9 = new RouteSort("Istanbul", "Izmir");
		RouteSort a10 = new RouteSort("Istanbul", "Ankara");
		
		int n = 10;
		RouteSort arr[] = new RouteSort[n];

		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;
		arr[3] = a4;
		arr[4] = a5;
		arr[5] = a6;
		arr[6] = a7;
		arr[7] = a8;
		arr[8] = a9;
		arr[9] = a10;

		QuickSort quick = new QuickSort();

		quick.sort(arr);

		// Sorting the array
		//
		// printing the
		// Pair array
		print(arr);
	}

	public static void print(RouteSort[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
