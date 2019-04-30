/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author UP773229
 */
public class Main {

    public static Boolean checkIfPrime(int inputNumber) {

        if (inputNumber <= 3) {
            return inputNumber > 1;
        } else if (inputNumber % 2 == 0 || inputNumber % 3 == 0) {
            return false;
        }

        int number = 5;

        while (number * number <= inputNumber) {

            if (inputNumber % number == 0 || inputNumber % (number + 2) == 0) {
                return false;
            }

            number = number + 6;
        }

        return true;
    }

    // Driver Program to test above function 
    public static void main(String args[]) {

        int cores = Runtime.getRuntime().availableProcessors();

        int inputNumber = 10;

        //Generate ArrayList of boolean values
        List<Boolean> primes = new ArrayList<>(Arrays.asList(new Boolean[inputNumber + 1]));
        //Set all boolean values to false
        Collections.fill(primes, false);

        //Generate numbers from 0 to inputNumber
        List<Integer> generatedNumbers = IntStream.range(1, (inputNumber + 1)).boxed().collect(Collectors.toList());

        //Temporary
        int listLength = generatedNumbers.size();

        //Test the values
        generatedNumbers.forEach((number) -> {
            boolean result = checkIfPrime(number);
            primes.set(number, result);
        });

        //Output the results
        for (int iterator = 0; iterator < primes.size(); iterator++) {

            boolean result = primes.get(iterator);

            if (result == true) {
                System.out.println(iterator + " is Prime");
            } else {
                System.out.println(iterator + " is not Prime");
            }

        }
        
    }

}
