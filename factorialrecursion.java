//factorial calculation using java to learn recursion 

import java.util.Scanner;
public class factorialrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        sc.close();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }

        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}