package lab6.cscd211Comparator;
import java.util.Comparator;
import lab6.cscd211Inheritance.Engine;
/*
Matthew Szymanski
CSCD211 
ManufacturerComparator
*/
public class ManufacturerComparator implements Comparator<Engine> {
/* This class represents a manufacturer sort which is a comparator sort for the Engine class 
This class ensures the parameters to the compare method are of both type Engine*/


public ManufacturerComparator() { //DVC
   }
   
   /** The compare method ensure the 2 parameters are of type Engine. 
   This is an override of the compare method in the Comparator interface. 
   This method simply compares the 2 engine manufacturers for order */
   public int compare(Engine e1, Engine e2) { //e1 - The first engine, e2 - The second engine to be compared
      //returns int Representing if e1 < e2, e1 > e2, or e1 equal to e2 based on the manufacturer
      return e1.getManufacturer().compareTo(e2.getManufacturer());
   }
}