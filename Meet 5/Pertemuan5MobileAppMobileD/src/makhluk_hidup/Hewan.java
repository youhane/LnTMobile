package makhluk_hidup;

public class Hewan {
	// ENCAPSULATION
	private String jenisHewan;
	private String namaHewan;
	private int jumlahKaki;
	
	public String getJenisHewan() {
		return jenisHewan;
	}
	public void setJenisHewan(String jenisHewan) {
		this.jenisHewan = jenisHewan;
	}
	
	public String getNamaHewan() {
		return namaHewan;
	}
	public void setNamaHewan(String namaHewan) {
		this.namaHewan = namaHewan;
	}
	
	public int getJumlahKaki() {
		return jumlahKaki;
	}
	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}
	
	public void jalan() {
		System.out.println(jenisHewan + " " + namaHewan + " sedang berjalan...");
	}
}
