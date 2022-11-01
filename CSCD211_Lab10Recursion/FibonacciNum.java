/* 
Matthew Szymanski
CSCD211  
18.2 (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations. Hint: To compute fib(n) without recursion, 
you need to obtain fib(n - 2) and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers.
 The current Fibonacci number would then be f0 + f1. The algorithm can be described as follows:
f0 = 0; // For fib(0)
f1 = 1; // For fib(1)
for (int i = 1; i <= n; i++) {
     currentFib = f0 + f1;
     f0 = f1;
    f1 = currentFib;
}
// After the loop, currentFib is fib(n)
Write a test program that prompts the user to enter an index and displays its Fibonacci number.
*/
/*
 ----jGRASP exec: java FibonacciNum
 Enter an index for a Fibonacci number please: 7
 The Fibonacci number at index 7 is 13
 
  ----jGRASP: operation complete.
 

*/







// This is for credit on the Rubric for Fibonacci number
// Fibonacci number is a number that consists of the sum of the 2 preceding numbers i.e. 1, 1, 2, 3, 5, 8.

import java.util.Scanner; // Scanner

public class FibonacciNum {

   public static void main(String[] args) {
   //Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter an index
      System.out.print("Enter an index for a Fibonacci number please: ");
      int index = input.nextInt(); // Takes input
      
      // Find the fibonacci number
      System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
      }
      
   
   
   // Used the code that was provided
      public static long fib(long index) {
         long f0 = 0; //for fib(0)
         long f1 = 1; // for fib(1)
         long currentFib = 0;
         
         if (index == 0) {
            return f0;
         }
         else if (index == 1) {
            return f1;
         }
         else {
			   for (int i = 1; i < index; i++) {
				   currentFib = f0 + f1;     
				   f0 = f1;                  
				   f1 = currentFib;          
			} 
			return currentFib; // returns num that is the sum of 2 preceding nums
      }      
  }
  /*
   ----jGRASP exec: java FibonacciNum
 Enter an index for a Fibonacci number please: 7
 The Fibonacci number at index 7 is 13
 
  ----jGRASP: operation complete.
 

  */
}