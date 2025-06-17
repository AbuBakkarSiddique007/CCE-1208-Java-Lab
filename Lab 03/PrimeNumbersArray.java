/*
 * Task No: 2
 * Task Name: Store and Print Prime Numbers in an Array
 * Objective: Write a Java program that takes a starting and ending number from the user 
 *            and stores only the prime numbers in an array and prints them.
 */

import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        // Count how many prime numbers in the range
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        // Create array to store prime numbers
        int[] primes = new int[count];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }

        // Print prime numbers
        System.out.println("Prime numbers in the given range:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }

        input.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
