import kendaraan.*;
import makhluk_hidup.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manusia vassel = new Manusia();
		vassel.setNama("Vassel");
		vassel.setUsia(20);
		vassel.setKota("Jakarta");
		
//		System.out.println("Halo, nama saya " + vassel.getNama());
//		System.out.println("Saya berusia " + vassel.getUsia() + " tahun");
//		System.out.println("Saya berasal dari " + vassel.getKota());
//		
//		vassel.setKota("Bandung");
//		System.out.println("Saya berasal dari " + vassel.getKota());
//		vassel.bicara();
		
//		Mahasiswa jason = new Mahasiswa();
//		jason.setNama("Jason");
//		jason.setUsia(21);
//		jason.setKota("Surabaya");
//		jason.setBinusian(2024);
//		jason.setNim("2400012345");
//		jason.bicara();
//		
//		System.out.println(" ");
//		
//		Dosen arrick = new Dosen();
//		arrick.setNama("Arrick");
//		arrick.setKota("Medan");
//		arrick.setUsia(26);
//		arrick.setLamaMengajar(3);
//		arrick.setKode("D5555");
//		arrick.bicara();
		
		Hewan kucing = new Hewan();
		kucing.setJenisHewan("Kucing");
		kucing.setNamaHewan("Gemuk");
		kucing.setJumlahKaki(4);
//		kucing.jalan();
		
		Manusia maria = new Manusia();
		maria.setNama("Maria");
		maria.setKota("Jakarta");
		maria.setUsia(18);
	
//		System.out.println(maria.getNama() + " bertemu " + kucing.getJenisHewan() + " " + kucing.getNamaHewan() + " di jalan.");
		Mobil avanza = new Mobil();
		avanza.setMerk("Toyota");
		avanza.setNamaMobil("Avanza");
		avanza.setAkselerasi(120);
		avanza.setTopSpeed(200);
		avanza.setJarakTempuh(10000);
		
//		avanza.gas();
//		avanza.gas(80);
//		avanza.gas(avanza.getTopSpeed(), avanza.getAkselerasi());
//		avanza.gas("Kemanggisan", 10);
		
		Motor mio = new Motor();
		mio.setMerk("Yamaha");
		mio.setNamaMotor("Mio");
		mio.setKapasitas(125);
		mio.setTopSpeed(180);
		
		mio.rem();
		mio.rem(40);
		mio.rem(mio.getKapasitas(), 2);
		mio.rem("warung", 3);
	}

}
