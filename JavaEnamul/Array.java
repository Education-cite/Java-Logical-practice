
package JavaEnamul;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner enamul = new Scanner(System.in);
        
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        System.out.println("enter value a matrix");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                a[row][col]=enamul.nextInt();
            }
            
        }
         System.out.println("enter value b matrix");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col]=enamul.nextInt();
            }
            
        }
        
        System.out.println(" a = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+a[row][col] );;
            }    
             System.out.println();
        }
         
         System.out.println(" b = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+b[row][col] );;
            }    
                System.out.println();
        }
        
        System.out.println(" a+b = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+a[row][col]+b[row][col] );;
            }    
                System.out.println();
        }   
        
    }
}
