public class StudentAdvance extends Ticket  {
	//private int day;
	public StudentAdvance(int day)
	{
	}
	private int day;
	private int price = 30;
	private int pricestudent;
	/* public int SerialNumber() 
	  {  
		  int serialNum = (int)(10000 * Math.random()) + 1;
		  return serialNum;
	  }*/
	public double getPrice() {
		if (day > 10 || day == 10){
			int Price = 30;
			price = Price;
	}
		pricestudent = price/2;
		return pricestudent;
		
	}
	 public String toString() 
	  {  
	    return super.toString();
	  } 
	
}
