/*
Matthew Szymanski
CSCD211
Lab7
*/
/*
Package lab7.cscd211inheritance
Class Employee
java.lang.Object
lab7.cscd211inheritance.Employee
All Implemented Interfaces:
Comparable<Employee>
Direct Known Subclasses:
Accountant, Lawyer, Programmer
public abstract class Employee
extends Object
implements Comparable<Employee>
The Generic Employee Base class. There will never just be an employee NOTE: All parameters will be passed as final and all precondtions will be met

*/


package lab7.cscd211inheritance; // Package

public abstract class Employee implements Comparable<Employee> {

   private final double BASE; //This is a constant representing the BASE pay and can't be changed.
   private String name;
   protected double salary;
   
/*public Employee() { // Default
}*/

public Employee(final String name, final double basePayrate, final double additionalPayrate) throws IllegalArgumentException { //name- The name, basePayrate- The base pay, additionalPayrate- The additonal pay
    /** EVC All parameters are for the private class level variables. */
        if(name.equals("") || name == null || basePayrate < 0 || additionalPayrate < 0) {
            throw new IllegalArgumentException("invalid field data");
        }
        this.name = name;
        this.BASE = basePayrate;
        this.salary = this.BASE + additionalPayrate;
    }

public double getSalary() { //getSalary
   return this.salary;
}

public double getBaseSalary() { // getBaseSalary
   return this.BASE;
}

public String getName() { // getName
   return this.name;
}

public String getType() { // Get simple name
  return this.getClass().getSimpleName();
}

public abstract void report(); // IDK if I shou yes I need

@Override
public int compareTo(Employee another) {
   if(this.getType().compareTo(another.getType()) > 0)
      return 1;
   else if(this.getType().compareTo(another.getType()) < 0)
      return -1;
   else
		{
			if (Double.valueOf(this.salary).compareTo(Double.valueOf(another.salary)) > 0)
				return 1;
			else if (Double.valueOf(this.salary).compareTo(Double.valueOf(another.salary)) < 0)
				return -1;
			else
				return 0;
		}     
}
@Override
public String toString() {
   return this.name;
}
}
