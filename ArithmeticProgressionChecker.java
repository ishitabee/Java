// This Java program checks whether the given array forms an Arithmetic Progression.
/* An Arithmetic Progression (AP) is a sequence where the difference between
 every pair of consecutive elements is the same. */
// Code given in Semester 3, DSA Lab.

import java.util.Scanner;

public class ArithmeticProgressionChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create the array
        int[] numbers = new int[size];

        // Input the array elements
        System.out.println("Enter the array elements:");

        for (int index = 0; index < size; index++) {
            System.out.print("Element " + (index + 1) + ": ");
            numbers[index] = sc.nextInt();
        }

        // Arrays with fewer than 2 elements always form an AP
        if (size < 2) {
            System.out.println("The array forms an arithmetic progression.");
            sc.close();
            return;
        }

        // Find the common difference
        int commonDifference = numbers[1] - numbers[0];

        // Check whether all consecutive differences are equal
        for (int index = 2; index < size; index++) {

            if (numbers[index] - numbers[index - 1] != commonDifference) {
                System.out.println("The array does not form an arithmetic progression.");
                sc.close();
                return;
            }
        }

        System.out.println("The array forms an arithmetic progression.");

        sc.close();
    }
}
