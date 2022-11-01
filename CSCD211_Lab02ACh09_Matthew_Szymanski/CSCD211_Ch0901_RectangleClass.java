/*
Matthew Szymanski
CSCD 211
9.1 (THE RECTANGLE CLASS) Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:
	Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
	A no-arg constructor that creates a default rectangle.
	A constructor that creates a rectangle with the specified width and height.
	A method named getArea() that returns the area of this rectangle.
	A method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40, and the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.

MY OUTPUT
 ----jGRASP exec: java TheRectangleClass
 The area of the rectangle with a height of 40.0 and width 4.0 is 160.0
 The perimeter of the rectangle is 88.0
 The area of the rectangle with a height of 35.9 and width 3.5 is 125.64999999999999
 The perimeter of the rectangle is 78.8
 
  ----jGRASP: operation complete.
 

*/



public class CSCD211_Ch0901_RectangleClass {
  /** Main method */
  public static void main(String[] args) {
    // Rectangle 1 area and perimeter
    Rectangle rectangle1 = new Rectangle(40, 4);
    System.out.println("The area of the rectangle with a height of "
      + rectangle1.height + " and width " + rectangle1.width + " is " + rectangle1.getArea());
    System.out.println("The perimeter of the rectangle is " + rectangle1.getPerimeter());  
      
      
      
    // Rectangle 2 area and perimeter 
    Rectangle rectangle2 = new Rectangle(35.9, 3.5);
    System.out.println("The area of the rectangle with a height of "
      + rectangle2.height + " and width " + rectangle2.width + " is " + rectangle2.getArea());
    System.out.println("The perimeter of the rectangle is " + rectangle2.getPerimeter());   
    
    }
}
// Define the rectangle class with two constructors
class Rectangle {
  double width;
  double height;

  /** Default Construct a rectangle with default values of 1 */
  Rectangle() {
  height = 1;
  width = 1;
    }

  /**  Construct a rectangle with a specified height and width */
  Rectangle(double newHeight, double newWidth) {
  height = newHeight;
  width = newWidth;
  
  
   }
  

  /** Return the area of this rectangle */
  double getArea() {
    return width * height;
  }

  /** Return the perimeter of this rectangle */
  double getPerimeter() {
    return width + width + height + height;
  }

  /** Set a new height for this rectangle */
  void setHeight(double newHeight) {
    height = newHeight;
  }
  // Set a new width for this rectangle
  void setWidth(double newWidth) {
    width = newWidth;
  }
}
