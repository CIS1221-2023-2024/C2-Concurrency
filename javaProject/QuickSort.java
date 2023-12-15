import java.util.concurrent.RecursiveTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * QuickSort class that extends RecursiveTask for concurrent processing.
 */
public class QuickSort extends RecursiveTask<List<Integer>> {
    
	private static final long serialVersionUID = 1L;
	private List<Integer> data;

    /**
     * Constructor for QuickSort class.
     * @param data The data to be sorted.
     */
    public QuickSort(List<Integer> data) {
        this.data = data;
    }

    /**
     * The compute method is overridden from RecursiveTask.
     * This method performs the quicksort algorithm.
     * @return The sorted list.
     */
    @Override
    protected List<Integer> compute() {
        if (data.size() <= 1) {
            return data;
        }

        int pivot = data.get(data.size() / 2);
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        // Partition the data.
        for (Integer i : data) {
            if (i < pivot) {
                less.add(i);
            } else if (i > pivot) {
                greater.add(i);
            } else {
                equal.add(i);
            }
        }

        // Create new tasks for the 'less' and 'greater' partitions.
        QuickSort lessTask = new QuickSort(less);
        QuickSort greaterTask = new QuickSort(greater);

        // Invoke all tasks and wait for them to complete.
        invokeAll(lessTask, greaterTask);

        // Join the results.
        less = lessTask.join();
        greater = greaterTask.join();

        // Combine the results.
        less.addAll(equal);
        less.addAll(greater);
        return less;
    }

    /**
     * The main method that creates a ForkJoinPool and a QuickSort task,
     * invokes the task, and prints the sorted data.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        List<Integer> data = List.of(3, 6, 2, 9, 7); // replace with your data
        QuickSort task = new QuickSort(data);
        List<Integer> sortedData = commonPool.invoke(task);
        System.out.println(sortedData);
    }
}
