import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class MeasurePerformance {
	
	/**
	 * Measure the time and memory usage of sorting function
	 * @param array to be sorted
	 */
	public void measureTimesBubble(List<Integer> array) {
		long t, t1, t2;
		
		t1 = System.currentTimeMillis();
		System.out.println(new BubbleSortFunction().bubbleSort(array).toString());
		t2 = System.currentTimeMillis();
		t = t2 - t1;
		
		System.out.println("Time taken for bubbleSort(): " + t + "ms");
		
		long totalMemory, freeMemory, usedMemory;
		
		totalMemory = Runtime.getRuntime().totalMemory();
        freeMemory = Runtime.getRuntime().freeMemory();
        usedMemory = totalMemory - freeMemory;

        System.out.println("Memory used for bubbleSort(): " + usedMemory + " bytes");
        
	}
	
	/**
	 * Measure the time and memory usage of sorting function
	 * @param array to be sorted
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public void measureTimesDivideAndSort(List<Integer> array) throws InterruptedException, ExecutionException {
		long t, t1, t2;
		
		t1 = System.currentTimeMillis();
		System.out.println(new DivideAndSortArray().divideAndSort(array).toString());
		t2 = System.currentTimeMillis();
		t = t2 - t1;
		
		System.out.println("Time taken for divideAndSort(): " + t + "ms");
		
		long totalMemory, freeMemory, usedMemory;
		
		totalMemory = Runtime.getRuntime().totalMemory();
        freeMemory = Runtime.getRuntime().freeMemory();
        usedMemory = totalMemory - freeMemory;

        System.out.println("Memory used for divideAndSort(): " + usedMemory + " bytes");
        
	}

	public void measureTimesQuickSort(List<Integer> array) {
		long t, t1, t2;
	
		t1 = System.currentTimeMillis();
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
        QuickSort task = new QuickSort(array);
        List<Integer> sortedData = commonPool.invoke(task);
        System.out.println(sortedData);
		t2 = System.currentTimeMillis();
		t = t2 - t1;
		
		System.out.println("Time taken for quickSort(): " + t + "ms");
		
		long totalMemory, freeMemory, usedMemory;
		
		totalMemory = Runtime.getRuntime().totalMemory();
        freeMemory = Runtime.getRuntime().freeMemory();
        usedMemory = totalMemory - freeMemory;

        System.out.println("Memory used for quickSort(): " + usedMemory + " bytes");
	}

}
