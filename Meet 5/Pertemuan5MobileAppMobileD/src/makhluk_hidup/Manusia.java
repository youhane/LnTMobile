package makhluk_hidup;

public class Manusia {
	// ENCAPSULATION
	private String nama;
	private int usia;
	private String kota;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getUsia() {
		return usia;
	}
	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	
	public void bicara() {
		System.out.println("Halo, nama saya " + nama);
		System.out.println("Saya berusia " + usia + " tahun");
		System.out.println("Saya berasal dari " + kota);
	}
	
}
