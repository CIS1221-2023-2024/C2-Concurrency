import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DivideAndSortArray {
	
	public List<Integer> divideAndSort(List<Integer> inputArray) throws InterruptedException, ExecutionException {
        // Base case: if the array has 1 or 0 elements, it's already sorted
        if (inputArray.size() <= 1) {
            return inputArray;
        }

        //  Recursive case: divide the array into halves
        int midIndex = inputArray.size() / 2;
        List<Integer> leftHalf = inputArray.subList(0, midIndex); // Get the left half of the array
		List<Integer> rightHalf = inputArray.subList(midIndex, inputArray.size()); // Get the right half of the array

        // Create a process pool executor
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<List<Integer>> futureLeftHalf = executor.submit(() -> sortList(leftHalf));
        Future<List<Integer>> futureRightHalf = executor.submit(() -> sortList(rightHalf));

        // Wait for both halves to finish sorting and get the results
        List<Integer> sortedLeftHalf = futureLeftHalf.get();
        List<Integer> sortedRightHalf = futureRightHalf.get();

        executor.shutdown();
        
        // Merge the sorted halves using the merge_sorted_arrays function
        return new MergeArray().mergeSortedArrays(sortedLeftHalf, sortedRightHalf);

    }

	private List<Integer> sortList(List<Integer> array) {
		//array.sort(Integer::compareTo);
        return new BubbleSortFunction().bubbleSort(array);
	}
}
