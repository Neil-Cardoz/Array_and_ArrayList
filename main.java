// Main.java
/*
Name: Neil Cardoz
PRN: 23070126079
Batch: AIML B1 23-27
*/


import java.util.*;

class Main{
    public static void main(String[] args) {
        UserInput input = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        // Get user input once and store it
        int[] userArray = input.arrayInput();

        // 1. Separate odd and even numbers
        functions.oddEven(userArray);

        // 2. Find smallest neighboring difference
        functions.smallestVal(userArray);

    }
}
