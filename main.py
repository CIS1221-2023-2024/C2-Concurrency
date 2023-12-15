from measurePerformance import measure_performance
from arrayGenerator import generate_random_array
from bubbleSortFunction import bubble_sort
from secondarySorting import quicksort
import time

def main():
    try:
        # Ask the user for the size of the array
        array_size = int(input("Enter the size of the array: "))
        
        # Validate the input
        if array_size < 0:
            raise ValueError("Array size must be a non-negative integer.")
        
        # Generate random array
        input_array = generate_random_array(array_size)
        
        # Create a copy of the array for the second sort
        input_array_copy = input_array[:]
        
        # Call the quicksort function and measure its performance
        time_taken_quicksort, memory_used_quicksort = measure_performance(quicksort, input_array)
        print(f"Time taken for quicksort: {time_taken_quicksort} seconds")
        print(f"Memory used for quicksort: {memory_used_quicksort} kilobytes")
        
        # Call the bubble_sort function and measure its performance
        time_taken_bubble_sort, memory_used_bubble_sort = measure_performance(bubble_sort, input_array_copy)
        print(f"Time taken for bubble_sort: {time_taken_bubble_sort} seconds")
        print(f"Memory used for bubble_sort: {memory_used_bubble_sort} kilobytes")
    
    except ValueError as ve:
        print(f"Error: {ve}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")

if __name__ == "__main__":
    main()