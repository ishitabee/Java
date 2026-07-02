//Calculation sum of n numbers using recursion.
//Time complexity for this will be O(n).

import java.util.Scanner;
public class SumRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = RecursionSum(num);
        System.out.println("The sum of the first " + num + " numbers is: " + sum);
        sc.close();
    }

    public static int RecursionSum(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + RecursionSum(num - 1);
    }
}

