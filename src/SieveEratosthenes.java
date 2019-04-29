/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UP773229
 */

class SieveEratosthenes extends Thread {

    void sieveOfEratosthenes(int inputNumber) {
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        boolean prime[] = new boolean[inputNumber + 1];
        
        for (int i = 0; i < inputNumber; i++) {
            prime[i] = true;
        }

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
    
}
