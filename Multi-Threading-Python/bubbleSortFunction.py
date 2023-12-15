def bubble_sort(input_array):
    """
    Sort an array using the Bubble Sort algorithm.

    Parameters:
        input_array (list): The array to sort.

    Returns:
        list: The sorted array.
    """

    if not isinstance(input_array, list):
        raise ValueError("Input must be a list")

    # Create a copy of the input array to avoid modifying it
    array = input_array.copy()  

    for i in range(len(array)):
        for j in range(len(array) - 1):
            if array[j] > array[j + 1]:
                # Swap array[j] and array[j + 1]
                array[j], array[j + 1] = array[j + 1], array[j]

    return array