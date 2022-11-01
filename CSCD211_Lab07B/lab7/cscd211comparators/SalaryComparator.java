/*
Matthew Szymanski
CSCD211
Lab7
*/
package lab7.cscd211comparators;

import java.util.*;
import lab7.cscd211inheritance.Employee; // Allows employee


public class SalaryComparator implements Comparator<Employee> {

public SalaryComparator() { //DVC
   }
   public int compare(final Employee e1, final Employee e2) { //e1 - The first employee, e2 - The second employee to be compared
      //returns int Representing if e1 < e2, e1 > e2, or e1 equal to e2 based on the salary
      return (int)(e1.getSalary() * 100) - (int)(e2.getSalary() * 100); // Take the difference
   }
}


