package rename;

public class Main {
	public static void main(String[] args){
		
	
	Stratege str = new Stratege();
	
	BubbleSort bubblesort = new BubbleSort();
	SelectionSort selectionsort = new SelectionSort();
	QuickSort quicksort = new  QuickSort(); 
	
	str.doSort(quicksort);
	
	
	}
}
