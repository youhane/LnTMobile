package kendaraan;

public class Motor {
	private String merk;
	private String namaMotor;
	private int kapasitas;
	private int topSpeed;
	
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getNamaMotor() {
		return namaMotor;
	}
	public void setNamaMotor(String namaMotor) {
		this.namaMotor = namaMotor;
	}
	public int getKapasitas() {
		return kapasitas;
	}
	public void setKapasitas(int kapasitas) {
		this.kapasitas = kapasitas;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void rem() {
		System.out.println(merk + " " + namaMotor + " sedang direm");
	}
	public void rem(int kecepatan) {
		System.out.println(merk + " " + namaMotor + " direm dari kecepatan " + kecepatan + " km/h");
	}
	public void rem(int kapasitas, int jarak) {
		System.out.println(merk + " " + namaMotor + " yang memiliki kapasitas " + kapasitas + " cc direm dari jarak " + jarak + " km");
	}
	public void rem(String tempat, int waktu) {
		System.out.println(merk + " " + namaMotor + " direm selama " + waktu + " detik dari " + tempat);
	}
}
