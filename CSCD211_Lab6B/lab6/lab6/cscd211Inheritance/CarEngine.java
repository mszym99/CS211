/*
Matthew Szymanski
CSCD211 
Car Engine
*/

package lab6.cscd211Inheritance;



public class CarEngine extends Engine { // Inheritance

CarEngine() {
//Default Constructor
}
public CarEngine(final String manufacturer, final int horsePower) {
   super(manufacturer, horsePower);
}

public CarEngine(final int horsePower, final String manufacturer) {
   super(horsePower, manufacturer);
}


public String toString() { // This toString returns Car Engine with toSTring
   return "Car Engine: " + super.toString();

}

public int calcOutput() { // Return int the engine class output value divided by 12
   return super.calcOutput() / 12;
}

}