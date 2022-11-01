/*
Matthew Szymanski
CSCD211
Desc:
Output:

Cindy LeAnn Larry 
After removing second element:  Cindy Larry 
*/

import java.util.*; // Imports java.util with all cases with .*

public class LinkListAddRemove{   
   public static void main(String args[]){  
   
   LinkedList<String> ll = new LinkedList<String>(); // Create new LinkedList as ll    
   //Adding elements to the Linked list   
   ll.add("Nancy");
   ll.add("Cindy");
   ll.add("LeAnn");
   ll.add("Larry");
   ll.add("Hal");
      
   //Removing First element      
   ll.removeFirst();
   //Same as list.remove(0);      
   
   
   //Removing Last element      
   ll.removeLast();
   
   //Iterating LinkedList     
   Iterator<String> iterator = ll.iterator();
   while(iterator.hasNext()) {
      System.out.print(iterator.next() + " ");  
   }
   
   //removing 2nd element, index starts with 0      
   ll.remove(1);
   System.out.println(" ");
   //Iterating LinkedList again
   Iterator<String> iterator2 = ll.iterator();
   System.out.print("After removing second element: ");
   while(iterator2.hasNext()) {
      System.out.print(iterator2.next() + " ");  
   }  
 } 
}