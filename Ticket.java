 
public abstract class Ticket
{   
  private int serialNumber;   // unique ticket id number 
  public Ticket() 
  {  serialNumber = getNextSerialNumber();  } 
  // returns the price for this ticket 
  public abstract double getPrice(); 
  // returns a string with information about the ticket 
  public String toString() 
  {  
    return "Number: " + serialNumber + "\nPrice: " + getPrice(); 
  } 
  // returns a new unique serial number 
  private static int getNextSerialNumber() 
  {  
	  int serialNum = (int)(10000 * Math.random()) + 1;
	  return serialNum;
  }
}
