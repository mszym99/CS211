/*
Matthew Szymanski
CSCD211
2.	9.2 (THE STOCK CLASS) Following the example of the Circle class in Section 9.2, design a class named Stock that contains:
	A string data field named symbol for the stock’s symbol.
	A string data field named name for the stock’s name.
	A double data field named previousClosingPrice that stores the stock price for the previous day.
	A double data field named currentPrice that stores the stock price for the current time.
	A constructor that creates a stock with the specified symbol and name.
	A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
MY OUTPUT IS BELOW
 ----jGRASP exec: java CSCD211_Ch0902_StockClass
 Previous Closing Price: $100.0
 Current Price: $90.0
 Change in price: -10.0%
 
  ----jGRASP: operation complete.
 

*/


public class CSCD211_Ch0902_StockClass {
   public static void main(String[] args) {
      // Set current price
      // Display stock info
      Stock stock1 = new Stock("name", "symbol");
      System.out.println("Previous Closing Price: " + "$" + stock1.getPreviousClosingPrice());
      System.out.println("Current Price: " + "$" + stock1.getCurrentPrice());  // Current Price
      System.out.println("Change in price: " + stock1.getChangePercent() + "%");  // Price Change
      
      }
}

class Stock {
   // Define what we need in description
   String symbol;
   String name;
   double previousClosingPrice = 100.00;
   double currentPrice = 90.00;
   
   public Stock() {   // Constructor
   
   }
   
   public Stock(String newSymbol, String newName) { // Constructor
   symbol = newSymbol;
   name = newName;
   }
   
   
   public double getChangePercent() {  // cP - pCP / pCP  
   /*Current price - previous closing price all divided by previous closing price then multiplied by 100 to get -10.0% */
      return(currentPrice - previousClosingPrice) / previousClosingPrice * 100.00;
      }
   public double getPreviousClosingPrice() { // pCP
      return previousClosingPrice;
      }
   public double getCurrentPrice() { // cP
      return currentPrice;
      }
      
   public void setCurrentPrice(double newCurrentPrice) {
      currentPrice = newCurrentPrice;
      }
         
   public void setPreviousClosingPrice(double newPreviousClosingPrice) {
      previousClosingPrice = newPreviousClosingPrice;
      }
      }