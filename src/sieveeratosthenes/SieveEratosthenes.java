package sieveeratosthenes;

/**
 *
 * @author UP773229
 */
import java.util.Scanner;
//import java.lang.Math.sqrt;

class SieveEratosthenes {

    void sieveOfEratosthenes(int inputNumber) {
        // Create a boolean array "prime[0..inputNumber]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[inputNumber + 1];
        
        //Set all to true from 0 up to (inputNumber-1)
        for (int i = 0; i < inputNumber; i++) {
            prime[i] = true;
        }
        
        //Test for primeness
        for (int p = 2; p * p <= inputNumber; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= inputNumber; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers 
        for (int i = 2; i <= inputNumber; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver Program to test above function 
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //int n = sc.nextInt();
        Integer n = new Integer(8);
        
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        SieveEratosthenes g = new SieveEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}
