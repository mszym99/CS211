/*
Matthew Szymanski
CSCD 211
This program takes the user input of a 3x4 matrix and totals up the values by each of the columns and displays the
column addition total at the end of the program underneath the entrys.

----jGRASP exec: java CSCD211_Ch0801_SumArrayColumn
 Enter a 3x4 matrix row by  row
 5 4 3 2
 4 3 2 2
 0 1 2 1
 Sum of the elements at column 0 is 9
 Sum of the elements at column 1 is 8
 Sum of the elements at column 2 is 7
 Sum of the elements at column 3 is 5
 
  ----jGRASP: operation complete.
*/
import java.util.Scanner;

public class CSCD211_Ch0801_SumArrayColumn {
        public static void main(String[] args) {
        
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            // Enter array values
            
            System.out.println("Enter a 3x4 matrix row by  row");
            double m[][] = new double[3][4];

            for (int i = 0; i < m.length; i++) // Rows
               for (int j = 0; j < m[i].length; j++) // Columns
                  m[i][j] = input.nextDouble();
           
            for (int j = 0; j < m[0].length; j++) {
            // Display result
               System.out.println("Sum of the elements at column " + j + " is " +  sumColumn(m, j));
           }
         }
         
         public static int sumColumn(double[][] m, int columnIndex) {
               // Initialize total to 0
               int total = 0;
               // Create nested for loop                             
               for (int i = 0; i < m.length; i++) 
                     total += m[i][columnIndex];
                                    
                 
                  return total;
                  }
                 }
                
                 