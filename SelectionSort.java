package SortingComparisons;
public class SelectionSort{
	public static void selectionSort(int[] x) {
		for(int i = 0; i < x.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < x.length; j++) {
				if(x[j] < x[minIndex]) {
					minIndex = j;
				}
			}

			int temp = x[i];
			x[i] = x[minIndex];
			x[minIndex] = temp;
		}
	}
}