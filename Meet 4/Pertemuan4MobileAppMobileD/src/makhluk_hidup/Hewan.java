package makhluk_hidup;

public class Hewan {
	
	// ATTRIBUTE
	int jumlahKaki;
	String jenisHewan;
	String namaHewan;
	
	// CONSTRUCTOR
	public Hewan(int jumlahKaki, String jenisHewan, String namaHewan) {
		this.jumlahKaki = jumlahKaki;
		this.jenisHewan = jenisHewan;
		this.namaHewan = namaHewan;
	}
	
	public void jalan() {
		System.out.println(jenisHewan + " " + namaHewan + " berjalan...");
	}
	
}
