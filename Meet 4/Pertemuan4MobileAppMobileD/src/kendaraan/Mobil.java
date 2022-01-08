package kendaraan;

public class Mobil {
	String merk;
	String namaMobil;
	int tahunProduksi;
	
	public Mobil(String merk, String namaMobil, int tahunProduksi) {
		this.merk = merk;
		this.namaMobil = namaMobil;
		this.tahunProduksi = tahunProduksi;
	}
	
	public void gas(int percepatan) {
		System.out.println(namaMobil + " berakselerasi dengan percepatan " + percepatan);
	}
	
	public void rem(int jarak) {
		System.out.println(namaMobil + " mengerem dari jarak " + jarak + " meter");
	}
}
