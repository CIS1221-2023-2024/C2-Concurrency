import java.util.ArrayList;
import java.util.List;

public class BubbleSortFunction {
	
	/**
	 * Sort an array using the Bubble Sort algorithm
	 * 
	 * @param List<Integer> to sort
	 * @return List<Integer> sorted array
	 */
	public List<Integer> bubbleSort(List<Integer> inputArray) {
		// Input validation
		if (inputArray == null || inputArray.size() < 0) {
			throw new IllegalArgumentException("Invalid input array");
		}
		
		boolean swapped;
		
		// Create a copy of the input array to avoid modifying it
		List<Integer> array = new ArrayList<>(inputArray);
		
		for (int i = 0; i < array.size(); i++) {
			
			// Boolean variable is initialized to false so that it is then checked if there was another swap
			swapped = false;
			
			for (int j = 0; j < array.size() - 1; j++) {
				if (array.get(j) > array.get(j+1)) {
					// Swap array[j] and array[j+1]
					int aux = array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, aux);
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		
		return array;
	}
}
