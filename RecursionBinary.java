// converting decimal number to binary number using recursion
//10 will be written as 1010 in binary

import java.util.Scanner;

public class RecursionBinary{

    public static String DecimalToBinary(int decimalNum){
        if(decimalNum == 0){
            return "0";
        }
        if(decimalNum == 1){
            return "1";
        }
        return DecimalToBinary(decimalNum / 2) + (decimalNum % 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        String binaryNum = DecimalToBinary(decimalNum);
        System.out.println("Binary version of " + decimalNum + " is: " + binaryNum);
        sc.close();
    }

}