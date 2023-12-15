# C2-Concurrency
## Foreword
Concurrency is the ability of a program to execute numerous tasks simultaneously by overlapping their time intervals. This is commonly achieved through multi-processing and multi-threading. As such, Noemi and myself have decided to demonstrate multi-threading. Within this model, multiple threads exist and share process resources within a singular process, yet they execute independently.

Furthermore, our hypothesis is that; The total sorting time of an algorithm will be decreased through the use of concurrency, specifically multi-threading.

## The Team
The Concurrency Project will be created and researched by Noemi Garcia Anton and Hans Wolf. Following the discussion on the logic and structure of the project, the Java implementation will be led by Noemi, whereas the Python implementation will be led by Hans. Further improvements, modifications, and documentation comparisons will be carried out by both individuals. 

## The Project
The benefits of concurrency are shown both in Java and Python through a comparison of the following algorithms:

- A bubble sort algorithm with a runtime of O(N^2) in the best, average, and worst cases.
- A quick sort algorithm with a runtime of O(n log n) in the best and average cases, and O(N^2) in the worst case.

To ensure fair testing, an array of given length by the user, randomly generated, acts as the controlled variable. Thus, both algorithms act on separate copies of the same array. 

The program then returns the time taken for each algorithm and memory usage respectively for analysis.

### Hyperlinks
(Java Project Hyperlink)

(Python Project Hyperlink)

## Review and Evaluation Guidelines
**Structure and Organisation:** 

Determine whether the functions are logically grouped, allowing for good structuring and ease of understanding.

**Code Readability:** 

Check whether the code is easy to read, allowing for a quick understanding of the structure. i.e. Clear comments, intuitive variables, and function names.

**Performance Testing:** 

Create a predetermined set of array sizes to test across both programs. These sizes should vary from smaller to larger arrays to better ascertain the results of the hypothesis. Upon running the main file, you will be asked for the size of the array that you wish to create. Insert a numerical value equal to the length of the array you wish the sorting algorithms to act on. It should be noted that the program is capable of computing and retrieving the results for a singular array before executing on another array.

## Example Results

### Python

#### Array Length 100
Quick sort time: 0.0009968280792236328 seconds

Quick Sort Memory: 0.0 kilobytes

Bubble sort time: 0.0 seconds

Bubble sort memory: 0.0 kilobytes

#### Array Length 100000
Quick sort time: 7.8014233112335205 seconds

Quick Sort Memory: 0.0 kilobytes

Bubble sort time: 0.016981840133666992 seconds

Bubble sort memory: 8.0 kilobytes

### Java

#### Array Length 100

#### Array Length 100000


