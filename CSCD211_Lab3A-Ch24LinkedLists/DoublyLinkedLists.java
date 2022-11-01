/*
Matthew Szymanski
CSCD211
This code creates a doubly linked list and displays the following

Output:

The elements of the list are:
Al
Amy
Beth
Bob
Carol
*/

/**
   The DLinkedList class implements a doubly 
   Linked list. 
*/

class DoublyLinkedLists
{

    
   private class Node {
      String value; // Value of a list element
      Node next; // Next node in the list
      Node prev; // Previous element in the list

      
      /**
       * Constructor.
       * 
       * @param val The element to be stored in the node.
       * @param n   The reference to the successor node.
       * @param p   The reference to the predecessor node.
       */


      Node(String val, Node n, Node p) {
          value = val;
          next = n;
          prev = p;
      }

     
     
      /**
       * Constructor.
       * 
       * @param val The element to be stored in the node.
       */

      Node(String val) {
          // Just call the other (sister) constructor
          this(val, null, null);
      }
  }
  
  
    private Node first;  // list head element
    private Node last;   // last element in list
    
  
  
   // DLinkedList
    public DoublyLinkedLists() {
        first = null;
        last = null;
               
    }
   
   
   
   
    public boolean isEmpty() {
          return this.first == null;
  }



  
  
  /**
   * The size method returns the length of the list.
   * 
   * @return The number of elements in the list.
   */

 
 
 
 
 
  public int size() {
      int count = 0;
      Node p = first;
      while(p != null)
      {
          // There is an element at p
          count++;
          p = p.next;
      }
      return count;
  }

 
 
 
  /**
   * The add method adds to the end of the list.
   * 
   * @param e The value to add.
   */

        
   
    public void add(String e)
     {
        if (isEmpty()) 
        {
            first = new Node(e);
            last = first;
        }
        else
        {
            // Add to end of existing list
            last.next = new Node(e);
            last = last.next;
        }      
     }
     
    
   
   
    // Create add for adding into the Node
    public void add(int index, String e) {
      if (index < 0 || index > size()) {
         throw new IndexOutOfBoundsException();
      }
      if (index == 0){
      
         Node p = first;
         first = new Node(e, p, null);
         if (p != null) {
            p.prev = first;
         }
         
         if (last == null) {
            last = first;
            
         }
         
         return;
       }
         Node pred = first;
         for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
         }
         Node succ = pred.next;
         Node middle = new Node(e, succ, pred);
         pred.next = middle;
         if (succ == null) {
            last = middle;
         }
         else 
         { 
            succ.prev = middle;
         }                  
   }
        //End  
        // String toString
   
   
   
    public String toString() {
      StringBuilder strBuilder = new StringBuilder();

      // Use p to walk down the linked list
      Node p = first;
      while(p != null)
      {
          strBuilder = strBuilder.append(p.value + System.lineSeparator());
          p = p.next;
      }

      return strBuilder.toString();

  }
  
  
  
  
  /**
   * The remove method removes the element at a given position.
   * 
   * @param index The position of the element to remove.
   * @return The element removed.
   * @exception IndexOutOfBoundsException When index is out of bounds.
   */
   
   
   
   public String remove(int index)
  {
      if (index < 0 || index >= size()) {
          throw new IndexOutOfBoundsException();
      }
  // Locate the node targeted for removal

  String element; // Element to return
  if (index == 0)
  { // removal of first item in the list
      element = first.value;
      first = first.next;
      if (first == null){
         last = null;
      }         
      return element;
   }
    // to remove an element other than the first, find the predecesor of the element
    // to be removed.
    Node pred = first;
    for (int k = 1; k <= index - 1; k++) 
    {
        pred = pred.next;
    }
    element = pred.next.value;
    // circumvent the node to be removed by assigning pred.next pointer to the next node after
    pred.next = pred.next.next;
    // check if pred is now last
    if (pred.next == null)
        last = pred;
    return element;
  }




  public boolean remove(String element) // Struggled with this one...
    {
        // Locate the node targeted for removal
        Node p = first;
        while (p.value != element) // looking for first instance of element
        {
         p = p.next;
        }
        if (p != null) {
            Node pred = p.prev;        // Node before the target
            Node succ = p.next;        // Node after the target      
        // Route forward and back pointers around
            pred.next = succ;
            succ.prev = pred;  
        }
        return p != null;
    }
    
    
    
    
    public static void main(String [] args)
    {
        DoublyLinkedLists ll = new DoublyLinkedLists();
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        System.out.println("The elements of the list are:");
        System.out.println(ll);
    }
}