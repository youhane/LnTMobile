import vehicle.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car innova = new Car();
		Bike supra = new Bike();

		innova.setName("Innova");
		innova.setType("Minivan");
		innova.setWheels(4);
		innova.setSpeed(150);

		supra.setName("Supra X");
		supra.setType("Underbone");
		supra.setWheels(2);
		supra.setSpeed(120);

		innova.start();
		innova.brake(50);

		supra.start();
		supra.service(8);

		System.out.println("Saya punya mobil " + innova.getName());
	}

}
