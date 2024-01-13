# Responses to Challenger

## arrayGenerator.py
Thank you for the suggestion. It is a good point to bring up that random.sample ensures the elements are unique to improve the execution time. 
However, I wish this function to better mirror real life scenarios in which duplicate values are present. 
As such, I desire to keep the current implementation of random.randint allowing for a more realistic test for the sorting algorithms.

## bubbleSortFunction.py
I’ve implemented the suggestion which has improved the time complexity to O(n) in the best-case scenario. 
This also still retains its purpose as a comparison to the concurrent merge sort algorithm to demonstrate the strengths of concurrency and more advanced sorting algorithms.

## arrayGenerator.java
I've implemented the change by initializing the ArrayList with the size of the input array. This should help reduce the number of dynamic resizing operations. Appreciate your input!

## bubbleSortFunction.java
I've incorporated the first part by adding a Boolean variable to check for swaps in the Bubble Sort function. However, when attempting to update the range in the inner loop to array.size()-i, it led to an IndexOutOfBoundsException.

## mergedArray.java
I've implemented the use of the addAll function to efficiently merge the remaining elements once one of the arrays is empty. This not only streamlines the code but also aligns with the same merging concept. Thank you.

## main.java
I've incorporated your suggestion by adding the do-while loop to the readSizeFromConsole() method to ensure the validity of the user-inputted size for the array.
