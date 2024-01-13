## INTRODUCTION
Concurrency allows programs executing multiply task simultaneously, improving the efficiency and capacity of the systems. Nowadays, considering how important is the velocity and the efficiency processing, concurrency emerges as a fundamental pillar for the development of robust and scalable software.

Concurrency’s importance implies decompose complex problems into more manageable tasks that can be executed independently. This allows an optimal utilization of hardware resources and improves the user experience giving fast responses in online environments and real-time applications. Concurrency has become an essential in several areas such as processing of large data sets, design of distributed systems or web servers.

In our project we want to prove how the concurrency improves the process performance and for that we have used two sorting algorithms: Bubble Sort and Quick Sort. We have implemented both algorithms in Java and in Python to make meaningful comparisons.

To ensure consisting results, we have designed the program to operate on separate copies of a randomly generated array, whose length is determined by the user. The output of the system will give the result of the sorted array, the time used for each algorithm and the corresponding memory usage. 

The results are expected to highlight how the concurrency can make a difference in performance, especially when working with sizable data sets.


## CONCURRENCY BY JAVA
As we have explained previously, we have developed in a concurrently way the Quick Sort algorithm. For that, we have used the “RecursiveTask” class which is given by the “java.util.concurrent” package. It allows us to divide the problem into smaller sub-task which will be executed concurrently using the “ForkJoinPool” and “invokeAll”.

QuickSort() class uses the list of numbers “data” that is going to be divided into smaller parts. For that, we override the compute() method which do the partition of the list in smaller, equal and bigger elements than a pivot, creating new instances of QuickSort() for smaller and bigger partitions. Then, both tasks will be invoked concurrently using invokeAll() and then be joined. Finally, the results will be combined.

In the other side, the BubbleSort() class has been developed sequentially. The algorithm realizes comparations and swaps in a for loop sorting the elements one by one. This algorithm is simpler but it has a worse performance.

We can see this clearly in the obtained data. With bubbleSort() the execution times grow significantly when the size of the array grown, indicating a quadratic temporal complexity. However, the quicksort() show more efficient executing times for all the array’s sizes, thanks to its concurrent design.

![image](https://github.com/CIS1221-2023-2024/C2-Concurrency/assets/124080941/bba60585-3a37-4303-9a1f-953cd5306003)


