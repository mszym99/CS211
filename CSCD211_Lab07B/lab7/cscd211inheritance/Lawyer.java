/*
Matthew Szymanski
CSCD211
Lab7
*/
package lab7.cscd211inheritance;
import java.util.*;

public class Lawyer extends Employee {
  
   private int stockOptions;
 
public Lawyer(String name, double basePayrate, double additionalPayrate, int stockOptions) {
   super(name, basePayrate, additionalPayrate);
   //super(3 things)
   if (stockOptions < 1)//if statement  exception
      throw new IllegalArgumentException("Invalid number of stock options.");
      
   this.stockOptions = stockOptions;
}   
 
public int getStockOptions() {
   return this.stockOptions;
}   

@Override
public void report() { 
   System.out.println("I am a lawyer. I get $" + String.format("%.2f", super.getSalary()) + " and I have " + this.stockOptions + " shares of stock.");
   }
	
@Override
public String toString() { 
   return "Lawyer: " + super.toString(); 
   }
  
}