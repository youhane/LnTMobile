package kendaraan;

public class Motor {
	String merk;
	String namaMotor;
	int topSpeed;
	
	public Motor(String merk, String namaMotor, int topSpeed) {
		this.merk = merk;
		this.namaMotor = namaMotor;
		this.topSpeed = topSpeed;
	}
	
	public void gas() {
		System.out.println("Kecepatan maksimal dari " + namaMotor + " adalah " + topSpeed + " km/h");
	}
	
	public void rem(int waktu) {
		System.out.println(namaMotor + " mengerem selama " + waktu + " detik");
	}
}
