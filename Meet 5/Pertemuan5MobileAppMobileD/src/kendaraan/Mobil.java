package kendaraan;

public class Mobil {
	private String merk;
	private String namaMobil;	
	private int akselerasi;
	private int topSpeed;
	private int jarakTempuh;
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getNamaMobil() {
		return namaMobil;
	}
	public void setNamaMobil(String namaMobil) {
		this.namaMobil = namaMobil;
	}
	public int getAkselerasi() {
		return akselerasi;
	}
	public void setAkselerasi(int akselerasi) {
		this.akselerasi = akselerasi;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getJarakTempuh() {
		return jarakTempuh;
	}
	public void setJarakTempuh(int jarakTempuh) {
		this.jarakTempuh = jarakTempuh;
	}
	// METHOD OVERLOADING - POLYMORPHISM
	
	public void gas() {
		System.out.println(merk + " " + namaMobil + " sedang digas...");
	}
	public void gas(int akselerasi) {
		System.out.println(merk + " " + namaMobil + " digas dengan akselerasi " + akselerasi + " km/h");
	}
	public void gas(int topSpeed, int akselerasi) {
		System.out.println(merk + " " + namaMobil + " digas dengan akselerasi " + akselerasi + " km/h hingga kecepatan maksimum yaitu " + topSpeed + " km/h");
	}
	public void gas(String tempat, int jarak) {
		System.out.println(merk + " " + namaMobil + " digas menuju " + tempat + " yang berjarak " + jarak + " km");
	}
}
