package makhluk_hidup;

// INHERITANCE
public class Mahasiswa extends Manusia{
	private String nim;
	private int binusian;
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public int getBinusian() {
		return binusian;
	}
	public void setBinusian(int binusian) {
		this.binusian = binusian;
	}
	// METHOD OVERRIDING
	public void bicara() {
		System.out.println("Saya, " + super.getNama() + ", adalah mahasiswa Binus");
		System.out.println("Saya adalah Binusian " + binusian);
		System.out.println("NIM saya adalah " + nim);
	}
}
