package vehicle;

public class Car extends Vehicle {
	private String drivability;

	public String getDrivability() {
		return drivability;
	}

	public void setDrivability(String drivability) {
		this.drivability = drivability;
	}

	public void start() {
		System.out.println(this.getName() + " which has " + this.getWheels() + " wheels is starting...");
	}

	public void brake(int distance) {
		System.out.println(this.getName() + " is braking from " + distance + " meters");
	}

}
