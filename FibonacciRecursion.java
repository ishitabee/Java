//Fibonnaci series using recursion
//Time complexity can be different for different methods of solving.
//Time complexity for this is O(2^n)
//fibonacci series begins with 0 and 1 and proceeds to look like this: 0, 1, 1, 2, 3, 5, 8, 13, 21..

import java.util.Scanner;
public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up to " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
