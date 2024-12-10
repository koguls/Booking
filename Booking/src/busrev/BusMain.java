package busrev;

import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,45));
		buses.add(new Bus(3, true, 55));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("           Wellcome to RedBus                    ");
		delay(3000);
		System.out.println("\n");
		System.out.println("This are the bus you can book now");
		delay(2000);
		System.out.println("-----------------------------------------------------");
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		System.out.println("-----------------------------------------------------");
		int userOpt = 1;
		
		while(userOpt==1) {
			
			int n = 1;
			do{
				delay(1000);
				n++;
			}while(n==1);
			
			System.out.println(" - Enter 1 to >> Book - 2 to >> Exit");
			userOpt = scan.nextInt();
			if(userOpt==1){
				Booking booking = new Booking();
				if(booking.isAvailable(buses, bookings)) {
					 bookings.add(booking);
					 System.out.println("Booked Successfully, Enjoy your journy ");
				}else {
					System.out.println("Bus Fulled, Sorry:(");
				}
					
			}else
				System.out.println("Thank you, Come again");
		}
		
	 scan.close();
	 }
 
	
	private static void delay(int millsecond) {
		try {
			Thread.sleep(millsecond);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}
