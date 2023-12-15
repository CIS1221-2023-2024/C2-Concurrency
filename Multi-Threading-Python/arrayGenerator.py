import random

def generate_random_array(array_size):
    """
    Generate an array of random integers.

    Parameters:
        array_size (int): The size of the array to generate.

    Returns:
        list: A list of random integers between 0 and 10000.

    Raises:
        ValueError: If array_size is not a non-negative integer.
    """

    # Input validation
    if not isinstance(array_size, int):
        raise ValueError("Array size must be an integer")

    if array_size < 0:
        raise ValueError("Array size must be a non-negative integer")

    # Generate and return a list of random integers
    return [random.randint(0, 10000) for _ in range(array_size)]