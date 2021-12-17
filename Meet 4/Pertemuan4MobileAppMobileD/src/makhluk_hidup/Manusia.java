package makhluk_hidup;

public class Manusia {
	// ATTRIBUTE
	public String nama;
	public int usia;
	public String kota;
	public String kampus;
	
	// CONSTRUCTOR
	public Manusia(String nama, int usia, String kota, String kampus) {
		this.nama = nama;
		this.usia = usia;
		this.kota = kota;
		this.kampus = kampus;
	}
	
	// METHOD
	public void bicara() {
		System.out.println("Halo, saya " + nama);
		System.out.println("Saya berusia " + usia + " tahun");
		System.out.println("Saya tinggal di " + kota);
		System.out.println("Saya kuliah di Binus " + kampus);
	}
}
