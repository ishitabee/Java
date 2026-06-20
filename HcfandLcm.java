//hcf and lcm of two numbers using java.
//hcf- highest common factor
//lcm- lowest common multiple
// two numbers : a and b
// a*b= lcm*hcf of a and b

import java.util.Scanner;


public class HcfandLcm {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number: ");               //a = first number
         int a = sc.nextInt();
       System.out.print("Enter the second number: ");              //b = second number
         int b = sc.nextInt();

        int hcf = 1;

        for (int i = 1; i <= a && i <= b; i++) {                   //factors of the 2 numbers
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        
        int lcm = (a * b) / hcf;                                   //formula for LCM

        
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
