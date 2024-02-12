Concurrency Program Report

General:

In this project two programs were created where the concept of concurrency was implemented through the use of two different programming languages which are Java and Python. The way this was done was by using two sorting algorithms which are the quick sort algorithm and the bubble sort algorithm. Results such as the sorted array, the time taken, and the memory usage are obtained. The results obtained by both of these algorithms are compared. As a challenger I gave suggestions on how to improve the solution for both the python solution and the java solution from which I received very good feedback from the team.

Python:

arrayGenerator.py:

List comprehension was replaced with the random.sample() function so that any iterations to check if the integers generated are unique are avoided as this function generates only unique numbers from a given range. 

Code is also made more concise, easier to understand and reduces execution time.

bubbleSortFunction.py:

A Boolean variable to check if there was a swap with each pass was added so that if the array inputted is already sorted the function finishes executing earlier. 

The last swapped index is also noted so that there are no comparisons between the sorted parts as they would be pointless. These adjustments reduce execution time and make the program more efficient.

Java:

ArrayGenerator.java:

The size of the arraylist is specified beforehand to avoid having to resize the array every time a new element is added to the list.

BubbleSortFunction.java:

A Boolean variable to check if there was a swap with each pass was added so that if the array inputted is already sorted the function finishes executing earlier. 

The inner loop was changed to iterate only up till array.size()-i so that there are no unnecessary comparisons.

MergedArray.java:

The addAll() function replaced the while loop which was used to merge the arrays. This made the code shorter and more concise. It is also more efficient as it takes longer to complete the iterations necessary compared to using the addAll() function. 

The size of the merged arraylist is also specified beforehand just like the arraylist inside the ArrayGenerator.java.

Main.java:

It was suggested that a do while loop should be implemented inside the readSizeFromConsole() method were it is checked if the input given by the user is valid.

Conclusion:

Overall these suggestions given, which were mostly implemented correctly made the code more concise and easier to understand, made it more efficient as it reduced execution time and it also introduced various checks to check if the data inputted by the user is valid.
