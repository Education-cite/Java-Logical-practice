
package JavaEnamul;

import java.util.Scanner;


public class ArrayMartix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A= new int[2][3];
        int[][] B= new int[2][3];
        
         //input  A matrix
          System.out.println("enter value A matrix");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
            
            System.out.printf("A[%d][%d] =",row,col);
                A[row][col]=input.nextInt();
            }
        }
       
         //input  B matrix
        System.out.println("enter element B matrix");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
            System.out.printf("B[%d][%d] =",row,col);
                B[row][col]=input.nextInt();
            }
        }
        
         //printing a matrix
         System.out.println(" Enter value A matrix ");
        System.out.print(" A = ");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t"+A[row][col]);
                        
            }
             System.out.println();
        }
            System.out.println("\n");
                
        //printing B matrix
        System.out.print(" B = ");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+B[row][col]);
                        
            }
             System.out.println();
    }
         //add matrix
         System.out.println("\n");
         System.out.println(" A+B = ");
         for (int row = 0; row < 2; row++) {
             for (int col = 0; col < 3; col++) {
                 System.out.print("\t "+(A[row][col]+B[row][col]));
        }
             System.out.println();
    }
}}
