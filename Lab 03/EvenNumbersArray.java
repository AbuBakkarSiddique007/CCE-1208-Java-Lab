/*
 * Task No: 1
 * Task Name: Print Even Numbers Using while, do-while Loops and Array
 * Objective: Write a Java program that takes starting and ending number from user then prints all even numbers in that range using array.
 */

import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        // Count even numbers in the range
        int count = 0;
        int temp = start;
        while (temp <= end) {
            if (temp % 2 == 0) {
                count++;
            }
            temp++;
        }

        // Create array to hold even numbers
        int[] evens = new int[count];
        int index = 0;
        int num = start;

        // Store even numbers using do-while loop
        do {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
            num++;
        } while (num <= end);

        // Print even numbers using while loop
        System.out.println("Even numbers in the given range:");
        int i = 0;
        while (i < evens.length) {
            System.out.print(evens[i] + " ");
            i++;
        }

        input.close();
    }
}
