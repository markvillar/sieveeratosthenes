/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UP773229
 */
public class Main {

    // Driver Program to test above function 
    public static void main(String args[]) {

        int inputNumber = 140;
        
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + inputNumber);

        SieveEratosthenes s = new SieveEratosthenes();

        s.sieveOfEratosthenes(inputNumber);
    }

}
