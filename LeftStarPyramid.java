/*code to print a left aligned star pyramid using java that has 'n' number of stars
in the n'th row. */  

   import java.util.Scanner;

   public class LeftStarPyramid {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows for the star pyramid:");
        int rows = sc.nextInt();
          
        if(rows > 0){ 
            for(int i=1; i<=rows; i++){           //current row number=i
            
                for(int j=1;j<=i;j++){            //number of stars in the row=j
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter a positive integer for the number of rows.");  
         }
        sc.close();
    }

}
