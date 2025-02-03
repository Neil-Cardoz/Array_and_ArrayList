# Array_and_ArrayList

## Overview
This project consists of a Java application that allows users to input an array of integers and provides various functionalities to manipulate and analyze the array. The main features include separating odd and even numbers, finding the smallest neighboring difference, and converting between arrays and ArrayLists.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Methods](#methods)
- [Contributing](#contributing)
- [License](#license)

## Features
- **User   Input:** Accepts an array of integers from the user.
- **Odd/Even Separation:** Separates the input numbers into odd and even categories.
- **Smallest Neighboring Difference:** Identifies the two neighboring numbers with the smallest difference.
- **Array and ArrayList Conversion:** Converts between arrays and ArrayLists for flexible data handling.

## Getting Started
To get started with this project, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/ArrayFunctionsProject.git
   cd ArrayFunctionsProject

## Usage
1. When prompted, enter 5 integers separated by spaces.
2. The program will display:
   - The odd numbers from the input.
   - The even numbers from the input.
   - The index of the first number in the closest pair of neighboring numbers.
   - The converted ArrayList and the conversion back to an array.

## Code Structure
The project consists of the following files:

MultipleFiles/
├── UserInput.java       # Handles user input
├── ArrayFunctions.java  # Contains methods for array manipulation
└── Main.java            # Entry point of the application


## Methods
### UserInput.java
- `arrayInput()`: Prompts the user to enter integers and returns them as an array.

### ArrayFunctions.java
- `oddEven(int[] arr)`: Separates odd and even numbers from the input array.
- `smallestVal(int[] arr)`: Finds the two neighboring numbers with the smallest distance.
- `arrayToArrayList(int[] arr)`: Converts an array to an ArrayList.
- `arrayListToArray(ArrayList<Integer> arrayList)`: Converts an ArrayList back to an array.
- `display(ArrayList<Integer> array)`: Displays the contents of an ArrayList.

### Main.java
- `main(String[] args)`: The main method that orchestrates user input and function calls.

## Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.