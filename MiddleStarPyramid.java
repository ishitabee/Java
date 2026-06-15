// code to print a middle aligned star pyramid using java that has the n number of stars in the n'th row.

import java.util.Scanner;

public class MiddleStarPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){

            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");         //space
            }

            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");         //number of stars in the i'th row
            }
            System.out.println();
        }
        sc.close();
    }
}