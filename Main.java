package SortingComparisons;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter the size of the array: ");
		int size = scan.nextInt();
		int[] data = randomArray(size);
		System.out.println("Array of size " + size + ": ");
		printArray(data);
		
		System.out.println("\nEnter the sorting algorithm you would like to use.");
		System.out.println("m = Merge Sort");
		System.out.println("i = Insertion Sort");
		System.out.println("s = Selection Sort");
		String selection = scan.next();

		if(selection.equals("m")){
			StopWatch timer = new StopWatch();
			timer.start();
			MergeSort.mergeSort(data);
			timer.stop();
			System.out.print("Array sorted: ");
			printArray(data);
			timer.stop();
			System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");
		}
		else if(selection.equals("i")) {
			StopWatch timer = new StopWatch();
			timer.start();
			InsertionSort.insertionSort(data);
			timer.stop();
			System.out.print("Array sorted: ");
			printArray(data);
			timer.stop();
			System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");
		}
		else if(selection.equals("s")) {
			StopWatch timer = new StopWatch();
			timer.start();
			SelectionSort.selectionSort(data);
			timer.stop();
			System.out.print("Array sorted: ");
			printArray(data);
			timer.stop();
			System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");
		}
		else {
			System.out.println("Invalid Input");
		}

		scan.close();

  }

	public static void printArray(int[] x) {
		for(int i = 0; i < x.length; i++) {
				System.out.print(x[i] + " ");
		}
	}

	public static int[] randomArray(int size) {
		int[] array = new int[size];
		int min = 1;
		int max = 100;
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * ((max - min) + 1)) + min;
		}
		return array;
	}
}