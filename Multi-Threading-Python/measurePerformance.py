import time
import psutil
import os

def measure_performance(sorting_function, input_array):
    """
    Measure the performance of a sorting function.

    Parameters:
        sorting_function (callable): The sorting function to measure.
        input_array (list): The input array to sort.

    Returns:
        tuple: The time taken and memory used by the sorting function.
    """
    # Create a Process object for the current process
    process = psutil.Process(os.getpid())

    # Measure the initial memory usage (in kilobytes)
    initial_memory = process.memory_info().rss / 1024.0

    # Measure the initial time (in seconds)
    start_time = time.time()

    # Run the sorting function
    sorted_array = sorting_function(input_array)

    # Measure the final time (in seconds)
    end_time = time.time()

    # Measure the final memory usage (in kilobytes)
    final_memory = process.memory_info().rss / 1024.0

    # Calculate the time taken (in seconds) and memory used (in kilobytes)
    time_taken = end_time - start_time
    memory_used = final_memory - initial_memory

    # Return the time taken and memory used
    return time_taken, memory_used