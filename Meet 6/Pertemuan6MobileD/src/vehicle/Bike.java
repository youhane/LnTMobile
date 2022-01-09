package vehicle;

public class Bike extends Vehicle{
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void start() {
		System.out.println(this.getName() + " which has type " + this.getType() + " is starting...");
	}
	
	public void service(int month) {
		System.out.println(this.getName() + " must be serviced every " + month + " months");
	}
}
