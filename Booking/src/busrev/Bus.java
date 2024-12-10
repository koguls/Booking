package busrev;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getbusNO(){
		return busNo;
	}
	
	/*public void setbusNo(int no) {
		this.busNo = no;
	}*/

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus NO - " + busNo + " AC/NONAC - " + ac +" "+ " SeatAvaiable - " + capacity);
	}
	
	
}
