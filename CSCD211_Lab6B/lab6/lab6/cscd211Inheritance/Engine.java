/*
Matthew Szymanski
CSCD211 
Engine
*/

package lab6.cscd211Inheritance;


public class Engine implements Comparable<Engine> {
// The engine class contains a String for the manufacturer, and an int for the horsePower. This class represents a basic Engine. The manufacturer is private and the horsePower is protected
   protected int horsePower;
   private String manufacturer;

Engine() { // Basic constructor
}

public Engine(final int horsePower, final String manufacturer ){ // The constructor that creates an Engine based on the manufacturer and the horsePower

   if (horsePower <= 0) {
   throw new IllegalArgumentException("Bad Horses");
   }
   if (manufacturer == null || manufacturer.isEmpty()) {
   throw new IllegalArgumentException("Bad Engine");
   }
   this.manufacturer = manufacturer;
   this.horsePower = horsePower;

} // IDK if I Need this // Yes I do // Interfaces must be final

public Engine(final String manufacturer, final int horsePower) { // The constructor that creates an Engine based on the manufacturer and the horsePower
   this(horsePower, manufacturer);
   
}

public int calcOutput() { // This method returns this horsePower divided by 5
   return this.horsePower / 5;
}

public int compareTo(Engine pi)
   {
      if(this.horsePower < pi.horsePower)
         return -1;
      else if(this.horsePower > pi.horsePower)
         return 1;
      else
      {
         return this.manufacturer.compareTo(pi.manufacturer);
      }
   }

public int getHorsePower() {
   return this.horsePower;
}

public String getManufacturer() { // Returns this manufacturer
   return this.manufacturer;
}

public String toString() { // This toString returns Manufacturer the value with HP of the horse power value
   return "Manufacturer: " + this.manufacturer + " with a horse power of " + this.horsePower;

}


}
