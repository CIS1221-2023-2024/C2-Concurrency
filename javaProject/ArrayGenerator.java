import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayGenerator {
	
	/**
	 * Generate an array of random integers
	 * 
	 * @param size of the array
	 * @return List<Integer> of random integers between 0 and 10000 
	 */
	public List<Integer> getRandomArray(int size) {
		// Input validation
		if (size < 0) {
			throw new IllegalArgumentException("Array size must be a non-negative number");
		}
		
		List<Integer> elements = new ArrayList<>(size);
		Random r = new Random();
		
		// Generate random elements
		for(int i = 0; i < size; i++) {
			elements.add(r.nextInt(10001));
		}
		
		return elements;
	}
}
