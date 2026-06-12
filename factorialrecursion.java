//factorial calculation using java to learn recursion 

import java.util.Scanner;
public class factorialrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        sc.close();

         int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }   

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
