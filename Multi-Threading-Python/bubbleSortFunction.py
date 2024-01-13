def bubble_sort(input_array, descending=False):
    """
    Sort an array using the Bubble Sort algorithm.

    Parameters:
        input_array (list): The array to sort.
        descending (bool): If True, sort the array in descending order. Default is False.

    Returns:
        list: The sorted array.

    Raises:
        ValueError: If input_array is not a list.
    """

    if not isinstance(input_array, list):
        raise ValueError("Input must be a list")

    array = input_array.copy()  
    n = len(array)

    for i in range(n):
        swapped = False
        lastindexswapped = n - 1

        for j in range(0, lastindexswapped):
            if (array[j] < array[j + 1]) if descending else (array[j] > array[j + 1]):
                array[j], array[j + 1] = array[j + 1], array[j]
                swapped = True
                lastindexswapped = j

        if not swapped: 
            break

    return array
