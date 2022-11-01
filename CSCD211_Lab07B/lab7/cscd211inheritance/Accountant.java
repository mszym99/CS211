/*
Matthew Szymanski
CSCD211
Lab7
*/
/*

EVC additional parameter is a parking stipend.
Parameters:
name - The name
basePayrate - The base pay
additionalPayrate - The additonal pay
parkingStipend - The parking stipend
Throws:
IllegalArgumentException - if parking stipend is less than 0.00
*/
package lab7.cscd211inheritance;
import java.util.*;

public class Accountant extends Employee {

private double parkingStipend;

public Accountant(final String name, final double basePayrate, final double additionalPayrate, final double parkingStipend) {
//super(3 things)
   super(name, basePayrate, additionalPayrate);
   
   if (parkingStipend < 0) // if statement
      throw new IllegalArgumentException("Invalid parking stipend amount.");
      
   this.parkingStipend = parkingStipend;

}

public double getParkingStipend() {
   return this.parkingStipend;
}

@Override
public void report() { 
   System.out.println("I am an accountant. I make $" + String.format("%.2f", super.getSalary()) + " plus a parking stipend of $" + String.format("%.2f", this.parkingStipend) + ".");
   }
	
@Override
public String toString() { 
   return "Programmer: " + super.toString(); 
   }
}