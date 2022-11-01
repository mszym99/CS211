/*
Matthew Szymanski
CSCD211
1. Finish coding the 2 .java files - make sure code runs before submitting and fully commented-pseudocode 
throughout program (5 points)
2. Find another animation link or a regular link Sorting Algorithms (.pdf file) (5 points)

https://visualgo.net/bn/sorting 
^^^
this link provides a great example of bubble sorting through animation.
(use 6-10 strings)
Output:
----jGRASP exec: java ObjectSelectionSortTest
 Original order: 
 billy simon matthew joe bob arthur 
 Sorted order: 
 arthur billy bob joe matthew simon 
 
  ----jGRASP: operation complete.
*/
/**
   This program tests the selectionSort method in the
   ObjectSelectionSorter class.
*/

public class ObjectSelectionSortTest {

   public static void main(String[] args) {
   
      // Create a String array with test values.
      Comparable[] values = {"billy", "simon", "matthew", "joe", "bob", "arthur"};
      // Note that String implements Comparable.
     
     
       System.out.println("Original order: ");
       for (Comparable element: values) {
         System.out.print(element + " ");  
         }  
      // Display the array's contents.
      
      ObjectSelectionSort.selectionSort(values);
           
      // Sort the array. 
      System.out.println("\nSorted order: ");
      for (Comparable element : values) {  // Display the array's contents.

         System.out.print(element + " ");
       }  
       System.out.println();
      }
      }
      
         