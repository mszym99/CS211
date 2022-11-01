/*
Matthew Szymanski
CSCD211 
NameComparator
*/
package lab7.cscd211comparators;

import java.util.*;
import lab7.cscd211inheritance.Employee; // Allows employee


public class NameComparator implements Comparator<Employee> {



public NameComparator() { //DVC
   }
   
   /** The compare method ensure the 2 parameters are of type Employee. 
   This is an override of the compare method in the Comparator interface. 
   This method simply compares the 2 names for order */
   public int compare(final Employee e1, final Employee e2) { //e1 - The first name, e2 - The second name to be compared
      //returns int Representing if e1 < e2, e1 > e2, or e1 equal to e2 based on the name
      return e1.getName().compareTo(e2.getName());
   }
}