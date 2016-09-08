import java.util.Scanner;
public class BuyTicketTest {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("How many days in advance? ");
		int day = kboard.nextInt();
		System.out.println("Are you a student? Y/N");
		String student = kboard.next();
		if (day == 0) {
			System.out.println("Buy the ticket");
			Walkup walkupTicket = new Walkup();
			System.out.println(walkupTicket);
		}
		if ( student.equals("y")) {
			StudentAdvance studentTicket = new StudentAdvance(day);
			System.out.println(studentTicket);
			
		}
		else  {
			if (student.equals("n")){
			Advance advanceTicket = new Advance(day);
		    System.out.println(advanceTicket); 
		    }
		}
	}

}
