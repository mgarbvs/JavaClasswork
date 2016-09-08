
public class Advance extends Ticket  {
	//private int day;
	private int price;
	public Advance(int day) {
		if (day == 10)
		{
			int Price = 40;
			price = Price;
		}
		 if (day > 10 || day > 0) 
			{
				int Price = 30;
				price = Price;
			}
	}
	public double getPrice() {
	
		return price;

	}
}
