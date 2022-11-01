/*
Matthew Szymanski
CSCD211
Lab7
*/
package lab7.cscd211inheritance;
import java.util.*;
public class Programmer extends Employee {

private boolean busPass;


public Programmer (final String name, final double basePayrate, final double additionalPayrate, final boolean busPass) {
//super(3 things)
   super(name, basePayrate, additionalPayrate); // might need to change this.
//this busPass
   this.busPass = busPass;
}


public boolean getBusPass() {
   return this.busPass;
}

public void setBusPass(final boolean busPass) {
   this.busPass = busPass;
}

@Override
public void report() {
   StringBuilder StrBui = new StringBuilder();
   //Build it saying requirements
   StrBui.append("I am a programmer. I get $" + String.format("%.2f", super.getSalary()) + " and I ");
   
   //if statement to see if there is a bus pass
   if(!busPass)
      StrBui.append("do not ");
   // If they do have busPass 
   StrBui.append("get a bus pass.");
   
   System.out.println(StrBui); 
}


public String toString() {
   return "Programmer: " + super.toString();
}

}