from concurrent.futures import ThreadPoolExecutor

def quicksort(arr):
    """
    Perform quicksort on a list.

    Parameters:
        arr (list): The list to be sorted.

    Returns:
        list: The sorted list.
    """
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[len(arr) // 2]
        less = [x for x in arr if x < pivot]
        equal = [x for x in arr if x == pivot]
        greater = [x for x in arr if x > pivot]
        return quicksort(less) + equal + quicksort(greater)

def concurrent_quicksort(arr):
    """
    Perform quicksort on a list using concurrency.

    Parameters:
        arr (list): The list to be sorted.

    Returns:
        list: The sorted list.
    """
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[len(arr) // 2]
        less = [x for x in arr if x < pivot]
        equal = [x for x in arr if x == pivot]
        greater = [x for x in arr if x > pivot]
        with ThreadPoolExecutor() as executor:
            less = executor.submit(quicksort, less).result()
            greater = executor.submit(quicksort, greater).result()
        return less + equal + greater