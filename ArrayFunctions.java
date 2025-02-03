// ArrayFunctions.java

import java.util.*;
import java.util.Arrays;

class ArrayFunctions {

    // Method to separate odd and even numbers from an array
    public void oddEven(int[] arr) {
        // Create ArrayLists to hold odd and even numbers
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> eve = new ArrayList<Integer>();

        // Initialize indices for odd and even numbers
        int odd_index = 0, even_index = 0;

        // Loop through each element in the input array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current number is even
            if (arr[i] % 2 == 0) {
                // Add the even number to the even ArrayList
                eve.add(arr[i]);
                even_index++; // Increment the even index
            } else {
                // Add the odd number to the odd ArrayList
                odd.add(arr[i]);
                odd_index++; // Increment the odd index
            }
        }

        // Print the list of odd numbers
        System.out.print("ODD NUMBERS: ");
        display(odd); // Call the display method to print odd numbers

        // Print the list of even numbers
        System.out.print("EVEN NUMBERS: ");
        display(eve); // Call the display method to print even numbers
    }

    // Method to display an ArrayList (assumed to be defined elsewhere)
    public void display(ArrayList<Integer> array) {
        System.out.println(array); // Print the contents of the ArrayList
    }
}
