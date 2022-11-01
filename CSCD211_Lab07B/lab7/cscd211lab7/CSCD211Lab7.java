/*
Matthew Szymanski
CSCD211
Lab7
A zip file that contains Lab 7 – Abstract:
• All the packages and Java files needed to compile and run your program
• An output run named cscd211Lab7out.txt
Zip named last name first letter of first name lab7.zip (Example: steinerslab7.zip)
*/



/*
You are a programmer in the IT department of an important law firm. Your job is to create a program that will
report gross salary amounts and other compensation.
There are three types of employees in your firm:
• Programmers
• Lawyers
• Accountants
Your computer-based solution will use inheritance to reflect the ‘general-to-specific’ nature of your employee
hierarchy.
*/
package lab7.cscd211lab7;

import java.io.*;
import java.util.*;//Array
import lab7.cscd211comparators.*;
import lab7.cscd211inheritance.*;

public class CSCD211Lab7
{
   public static void main(String [] args)
   {
      ArrayList<Employee>myList = new ArrayList<Employee>();
      myList.add(new Programmer("Mr. Ima Nerd", 40000, 20000, true));
      myList.add(new Programmer("Mrs. Ima Nerd", 45000, 20000, false));
      myList.add(new Accountant("Mr. Bean Counter", 100000, 0, 50.00));
      myList.add(new Accountant("Mrs. Bean Counter", 75000, 0, 150.00));
      myList.add(new Lawyer("Mr. Lawyer", 150000, 30000, 25));
      myList.add(new Lawyer("Mrs. Lawyer", 170000, 20000, 125));

      System.out.println("Employee List");
      for(Employee e : myList)
         System.out.println(e);

      System.out.println();
               
   
      System.out.println("Employee Report");         
      for(Employee e : myList)
         e.report();
      
      System.out.println();
      
      Collections.sort(myList);
      
      System.out.println("Employee List: Natural Order");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();
      
      
      Collections.sort(myList, new SalaryComparator());
      
      System.out.println("Employee List by Salary");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();
      
      Collections.sort(myList, new NameComparator());
      
      System.out.println("Employee List by Name");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();


    
   }//end main
   
}// end class