/*
Matthew Szymanski
CSCD211  
Specifications for # 2 output (each students output may differ:  PROVIDE OUTPUT RUNNING EACH (5) METHOD-
(when methods are called be sure to print out which method you are using). 
// Show Recursion
Output:
 ----jGRASP exec: java Recursion
 This program will take a predetermined value of 4 and return its factorial
 Recursive method called, n is: 4
 The factorial(4) = 4 * factorial(3)
 Recursive method called, n is: 3
 The factorial(3) = 3 * factorial(2)
 Recursive method called, n is: 2
 The factorial(2) = 2 * factorial(1)
 Base/terminal case reached, no more recursive calls!
 Factorial of 4 is: 24
 
  ----jGRASP: operation complete.


*/





public class Recursion {

   public static void main(String[] args) { 
      System.out.println("This program will take a predetermined value of 4 and return its factorial"); // 1st
      System.out.println("Factorial of 4 is: " + recursiveMethod(4)); // then this for 4 times because I have 4 in the int n slot
}

   private static int recursiveMethod(int n) {
      if (n == 1) { //base case
         System.out.println("Base/terminal case reached, no more recursive calls!");
         return 1;
      }
      else { // aslong as you dont reach n == 1 for base case this happens and prints out n and then n - 1.
          System.out.println("Recursive method called, n is: " + n);
          
          // formatting to print out The factorial(4) = 4 * factorial(3)
          System.out.println("The factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")"); // Labeling basically what is happening during the recursion method
               return n * recursiveMethod(n - 1); 
      }  
   }
   }
