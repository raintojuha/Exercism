"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""




# Expected bake time in minutes
EXPECTED_BAKE_TIME = 40



def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """


    remaining_bake_time = EXPECTED_BAKE_TIME - elapsed_bake_time
    
    return remaining_bake_time




def preparation_time_in_minutes(number_of_layers):
    """Calculate time to prepare lasagna.

    :param number_of_layers: int - layers in the lasagna.
    :return: int - preparation time (in minutes).

    Function that takes the number of layers in the lasagna as an argument.
    Returns the preparation time.
    """
    # Time to prepare each layer in minutes
    time_to_prepare = 2

    return number_of_layers * time_to_prepare


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time (prep+bake).

    :param number_of_layers: int - layers in the lasagna.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - total bake time elapsed (in minutes).

    Function that takes the number of layers in the lasagna and
    the bake time that has elapsed as arguments.
    Returns the total cooking time elapsed.
    """

    preparation_time = preparation_time_in_minutes(number_of_layers)

    return preparation_time + elapsed_bake_time