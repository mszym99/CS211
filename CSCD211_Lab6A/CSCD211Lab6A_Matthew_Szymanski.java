/*
Matthew Szymanski
CSCD211
Lab6A-Inheritance
11.2 (THE PERSON, STUDENT, EMPLOYEE, FACULTY, AND STAFF CLASSES) Design a class named Person and its two subclasses named Student and Employee. 
Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and e-mail address. 
A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. 
Use the MyDate class defined java.util.calendar to create an object for date hired. A faculty member has office hours and a rank. A staff member has a title. 
Override the toString method in each class to display the class name and the person’s name.
This program takes constructors and super to a whole new level for me.. You have to extend different classes to make
parent / child classes and make sure you use super properly.
extends
super
this
protected
@Override subclass child parent super derived base
Output:

  ----jGRASP exec: java Testfileess
 Person: Peter
 Student: Susan
 Employee: Eva
 Faculty: Frank
 Title: Shane
 
  ----jGRASP: operation complete.

*/


import java.util.*;


 
public class CSCD211Lab6A_Matthew_Szymanski {
 public static void main(String[] args) {
   Person person = new Person("Peter"); // (THE PERSON, STUDENT, EMPLOYEE, FACULTY, AND STAFF CLASSES)
   Student student = new Student("Susan");
   Employee employee = new Employee("Eva");
   Faculty faculty = new Faculty("Frank");
   Staff staff = new Staff("Shane");
   
   System.out.println(person);
   System.out.println(student);
   System.out.println(employee);
   System.out.println(faculty);
   System.out.println(staff);

}
}
class Person { // A person has a name, address, phone number, and e-mail address.
   public String name;
   public String address;
   public String email;
   public String number;
   
   Person() {
   
   }
   
   Person(String name) {
   this.name = name;
   }
   
   public String getName() {
      return name;
   }
   
   public String getAddress() {
      return address;
   }
   
   public String getNumber() {
      return number;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setAddress(String address) {
      this.address = address;
   }
   
   public void setNumber(String number) {
      this.number = number;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }
   
   @Override
   public String toString() {
      return "Person: " + this.name; // Print out Peter
   }
} 

class Student extends Person { //Student class inherits from the Person class
                                 // A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.
    static final int FRESHMAN = 1;
    static final int SOPHOMORE = 2;
    static final int JUNIOR = 3;
    static final int SENIOR = 4;
    protected int status;
    
    public Student() { // Default constructor
    
    }
    public Student(String name) { // Secondary constructor with setName(name) which will be Susan.
      setName(name);
   }
   
   public Student(String name, int status) { // Check if student is freshman, sophomore, junior, or senior
      setName(name);
      if(status > 0 && status < 5) {
         this.status = status;
      }
      else {
         this.status = 0;
      }
   } 
   public String getStatus() {
      //string status;
      if(this.status == FRESHMAN) {
         return "Freshman";
      }
      else if(this.status == SOPHOMORE) {
         return "Sophomore";
      }
      else if(this.status == JUNIOR) {
         return "Junior";
      }
      else if(this.status == SENIOR) {
         return "Senior";
      }
      else {
         return "Grade level not set";
      }
   }  
   @Override
   public String toString() {
      return  "Student: " + this.name; // Student: Susan
   }
   }




class Employee extends Person { //An employee has an office, salary, and date hired
   protected java.util.Calendar dateHired;
   protected String salary = " ";
   protected int office = 0; 
   
   Employee(String name) {
      super(name); // Person Class
   }
   // Return a string description of class
   @Override
   public String toString() {
      return "Employee: " + this.name; // Employee: Eva
   }

}  

class Faculty extends Employee { // Make Faculty and Staff subclasses of Employee
     protected String officeHours = " ";
     static final int LECTURER = 1;                //ranks: LECTURER, ASSISTANT_PROFESSOR, ASSOCIATE_PROFESSOR, PROFESSOR
     static final int ASSISTANT_PROFESSOR = 2; 
     static final int ASSOCIATE_PROFESSOR = 3; 
     static final int PROFESSOR = 4;
     protected int rank;

    
    public Faculty(String name) {
      super(name);
   }
   
   public Faculty(String name, int rank) {
      super(name);
      if(rank > 0 && rank < 5) {
         this.rank = rank;
      }
      else {
         this.rank = 0;
      }
   } 
   public String getRank() { // Similar code to above but it is changed to get the ranks for the faculty
      //string status;
      if(this.rank == LECTURER) {
         return "LECTURER";
      }
      else if(this.rank == ASSISTANT_PROFESSOR) {
         return "ASSISTANT_PROFESSOR";
      }
      else if(this.rank == ASSOCIATE_PROFESSOR) {
         return "ASSOCIATE_PROFESSOR";
      }
      else if(this.rank == PROFESSOR) {
         return "PROFESSOR";
      }
      else {
         return "rank not set";
      }
   } 
    
   public String toString() {
      return "Faculty: " + this.name; // Faculty: Frank
   }
   
   }
   
   class Staff extends Employee { //Make Faculty and Staff subclasses of Employee A staff member has a title
      protected String title;
      
      
      public Staff(String name){ 
      super(name);
      }
      public String getTitle() {
         return title;
      }
      
      public void setTitle(String title) {
         this.title = title;
      }
      @Override
      public String toString() {
         return "Title: " + this.name; // Staff: Shane
      }
   }

