/*
Matthew Szymanski
CSCD211


Output:
----jGRASP exec: java ObjectSelectionSortTest
 Original order: 
 billy simon matthew joe bob arthur 
 Sorted order: 
 arthur billy bob joe matthew simon 
 
  ----jGRASP: operation complete.
 

*/ /**
   The ObjectSelectionSorter class provides a public static
   method for performing a selection sort on an array of
   objects that implement the Comparable interface.
*/
import java.util.*; //import for compareTo
public class ObjectSelectionSort{

   /**
      The selectionSort method performs a selection sort on an
      array of objects that implement the Comparable interface.
      @param array The array to sort.
   */

   public static void selectionSort(Comparable[] array)
   {
      
     int N = array.length; // set array.length = an integer N
     
     for (int i = 0; i < N; i++) { // for the num of names in Comparable[] values
         int minIndex = i;
         
            
            for (int j = i + 1; j < N; j++) { // Marks the last element to compare
               if(array[j].compareTo(array[minIndex]) < 0) {
                  minIndex = j; // Index of an element to compare
                  }
               if (minIndex != i) { // Used to swap to elements
                  Comparable temp = array[i]; // Create a temp
                  array[i] = array[minIndex]; // Swap arounds here
                  array[minIndex] = temp;
               } 
               
            }
       }
   }
  }
     