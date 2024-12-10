package busrev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	Scanner scan = new Scanner(System.in);
	String name;
	int busno;
	Date date;
	
	Booking(){
		try {
		System.out.println("Enter your name : ");
		name = scan.next();
		System.out.println("Enter Bus-No : ");
		busno = scan.nextInt();
		System.out.println("Enter Date dd-mm-yyyy : ");
		String dateInput = scan.next();
		
		SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy");
		
			date = dateformate.parse(dateInput);
		} catch (ParseException e) {
			System.out.println("Enter correct formate (e.g)23-05-2024: ");
			System.out.println("Enter Date dd-mm-yyyy : ");
			String dateInput = scan.next();
			SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = dateformate.parse(dateInput);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch(java.util.InputMismatchException e) {
			System.out.println("Enter Date dd-mm-yyyy : ");
			String dateInput = scan.next();
			SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = dateformate.parse(dateInput);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getbusNO() == busno) {
				capacity = bus.getCapacity();
			}
		}
		
		int booked = 0;
		for(Booking b:bookings){
			if(b.busno == busno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
		
		
	}
}
