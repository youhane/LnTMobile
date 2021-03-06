package makhluk_hidup;

// INHERITANCE
public class Dosen extends Manusia{
	private String kode;
	private int lamaMengajar;
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public int getLamaMengajar() {
		return lamaMengajar;
	}
	public void setLamaMengajar(int lamaMengajar) {
		this.lamaMengajar = lamaMengajar;
	}
	// METHOD OVERRIDING
	public void bicara() {
		System.out.println(super.getNama() + " adalah dosen Binus");
		System.out.println("yang telah mengajar selama " + lamaMengajar + " tahun");
		System.out.println("Kode dosennya adalah " + kode);
	}
}
