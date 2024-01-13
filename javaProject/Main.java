import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// Ask the user for the size of the array
		int size = readSizeFromConsole();
		
		// Generate random array
		List<Integer> inputArray = new ArrayGenerator().getRandomArray(size);
		
		// Show the array
		System.out.println("Your array is: " + inputArray.toString());
		
		// Create a copy of the array for the second sort
		List<Integer> inputArrayCopy = new ArrayList<>(inputArray);
		List<Integer> inputArrayCopy2 = new ArrayList<>(inputArray);
	
		MeasurePerformance mP =  new MeasurePerformance();
		
		// Measure the time and memory usage of the bubbleSort function
		mP.measureTimesBubble(inputArray);
			
		// Measure the time and memory usage of the divideAndSort function
		//mP.measureTimesDivideAndSort(inputArrayCopy);
		
		// Measure the time and memory usage of the quickSort function
		mP.measureTimesQuickSort(inputArrayCopy2);
	}
	
	
	/**
	 * Reads a number from the console
	 * @return int
	 */
	private static int readSizeFromConsole() {
		Scanner scanner = new Scanner(System.in); 
		int num;
		        	do {
		      		System.out.print("Enter a positive integer for the array size: ");
		            		while (!scanner.hasNextInt()) {
		                		System.out.print("Invalid input. Please enter a positive integer: ");
		                		scanner.next(); // consume the invalid input
		            		}
		            		num = scanner.nextInt();
		            		if (num <= 0) {
		                		System.out.println("Please enter a positive integer for the array size.");
		            		}
		        	} while (num <= 0);
		        	scanner.close();
		        	return num;

	}
}
