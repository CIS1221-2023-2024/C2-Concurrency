## Introduction
Concurrency allows programs executing multiply task simultaneously, improving the efficiency and capacity of the systems. Nowadays, considering how important is the velocity and the efficiency processing, concurrency emerges as a fundamental pillar for the development of robust and scalable software.

Concurrency’s importance implies decompose complex problems into more manageable tasks that can be executed independently. This allows an optimal utilization of hardware resources and improves the user experience giving fast responses in online environments and real-time applications. Concurrency has become an essential in several areas such as processing of large data sets, design of distributed systems or web servers.

In our project we want to prove how the concurrency improves the process performance and for that we have used two sorting algorithms: Bubble Sort and Quick Sort. We have implemented both algorithms in Java and in Python to make meaningful comparisons.

To ensure consisting results, we have designed the program to operate on separate copies of a randomly generated array, whose length is determined by the user. The output of the system will give the result of the sorted array, the time used for each algorithm and the corresponding memory usage. 

The results are expected to highlight how the concurrency can make a difference in performance, especially when working with sizable data sets.

## Concurrency
Concurrency is a trait allowing the parallel processing of tasks or provides the illusion of simultaneous execution. This allows for certain desirable traits which are difficult to achieve linear programming such as resource optimization and increased responsiveness. This is done through running on multiple processors or on a single processor through interleaved execution, creating the illusion of tasks executing simultaneously.
Key methods which are used to achieve concurrency include but are not limited to the following; Multi-Threading, Multiprocessing, Asynchronous Programming. These versatile tools each have their own mechanisms with unique advantages which one can employ and leverage dependent on the resource constraints, the task at hand, and the level of concurrency required.

Multi-Threading allows the same program to execute concurrently across multiple threads. This is permitted by threads being lightweight and sharing the same memory space yet can execute independently. Generally, they are well-rounded at improving the efficiency of a piece of software without increasing the resource demand as substantially as other methods.
Multiprocessing provides concurrent execution across multiple programs where each is allotted its own space in memory. As the processes are running independently, communication of them must be mediated through an inter-process communication. IPCs as such play a critical role allowing for communication, thus concurrency, through message passing, shared memory or signals such as handling interrupts. This type of method is optimized within multi-core environments as each core can handle a unique process allowing for better system efficiency.
Asynchronous Programming deviates from the other methods by allowing concurrent execution without the need for synchronous waiting. This method is particularly useful when processes are required to wait on other tasks with an unpleasant and undesirable delay, such as with non-blocking I/O programs. This implementation of concurrency allows for better responsiveness within real-time processing and where user downtime is to be kept to a minimum. 
From any of these implementations one can view the advantages of implementing concurrency within a program. Particular reference can be made to computationally intensive programs which substantially benefit from concurrency. Multi-core environments also benefit from this significantly allowing for the resources to be better utilized. For any applications handling user interactions, a desired system responsiveness is achieved. This is a highly sought for trait given the competitive nature of numerous markets, preventing users’ attention from being lost due to slow responsiveness of one’s product.

The implementation of Concurrency however does not come without difficulties one must consider. Issues such as starvation and deadlock arise, these being the program being unable to continue executing or resources are denied. Thus, one must have proper management for the implementation of concurrency and be aware of the resources available. As such, a stable structure and understanding of the program being built is a pillar for a sound concurrent program.

## Concurrency within Python
Concurrency within python is typically achieved through a module such as concurrent.futures. This introduces an abstract class called an executor allowing methods which can call asynchronously. It’s two main subclasses are ThreadPoolExecutor and ProcessPoolExecutor. The first utilizing a pool of threads whilst the second utilizes multiple processes.

Our quicksort algorithm makes use of the ThreadPoolExecutor. The list is divided into smaller sub lists based on a less and greater pivot and then sorts these sub lists concurrently. The quicksortfunction is sent to the executor for each sub list, which then schedules the function to be executed, thus, returning a future representation.

Upon examining the performance of both algorithms, a significant observation may be found. Despite the improvement suggested by the challenger to make the bubble sort have a time complexity of O(n) in the best-case scenario, it still is insufficient on larger lists. A significant speedup is presented with the quicksort algorithm which has the complexity of O(n log n) thus being more efficient for larger lists. Given ideal factors, which includes available cores and overhead for creating and managing threads, we are further able to see a significant time reduction with the concurrency introduction.

## Concurrency within Java
As we have explained previously, we have developed in a concurrently way the Quick Sort algorithm. For that, we have used the “RecursiveTask” class which is given by the “java.util.concurrent” package. It allows us to divide the problem into smaller sub-task which will be executed concurrently using the “ForkJoinPool” and “invokeAll”.

QuickSort() class uses the list of numbers “data” that is going to be divided into smaller parts. For that, we override the compute() method which do the partition of the list in smaller, equal and bigger elements than a pivot, creating new instances of QuickSort() for smaller and bigger partitions. Then, both tasks will be invoked concurrently using invokeAll() and then be joined. Finally, the results will be combined.

In the other side, the BubbleSort() class has been developed sequentially. The algorithm realizes comparations and swaps in a for loop sorting the elements one by one. This algorithm is simpler but it has a worse performance.

We can see this clearly in the obtained data. With bubbleSort() the execution times grow significantly when the size of the array grown, indicating a quadratic temporal complexity. However, the quicksort() show more efficient executing times for all the array’s sizes, thanks to its concurrent design.

![image](https://github.com/CIS1221-2023-2024/C2-Concurrency/assets/124080941/bba60585-3a37-4303-9a1f-953cd5306003)


