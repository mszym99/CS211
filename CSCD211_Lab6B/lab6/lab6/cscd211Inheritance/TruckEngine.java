package lab6.cscd211Inheritance;


/*
Matthew Szymanski
CSCD211 
Truck Engine
*/
public class TruckEngine extends Engine {

   private boolean diesel; // private boolean
   
public TruckEngine(String manufacturer, int horsePower, boolean diesel) {
   super(manufacturer, horsePower);
   this.diesel = diesel;
}

public String toString() { // This toString returns Car Engine with toSTring
   if(diesel) {
      return "Truck Engine: " + super.toString() + " is diesel";
      }
   else {
      return "Truck Engine: " + super.toString() + " is not diesel";
   }    
}

public int calcOutput() { // Return int the engine class output value divided by 12
   if(diesel) {
      return super.calcOutput() / 18;
      }
   else {  
      return super.calcOutput() / 8;
   }
}

}


