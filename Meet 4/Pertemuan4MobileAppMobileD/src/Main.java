import makhluk_hidup.*;

import java.util.Scanner;

import kendaraan.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TANPA CONSTRUCTOR
//		Manusia vassel = new Manusia();
//		vassel.nama = "Vassel";
//		vassel.usia = 19;
//		vassel.kota = "Jakarta";
//		vassel.bicara();
		
		// DENGAN CONSTRUCTOR
//		Manusia jonathan = new Manusia("Jonathan", 20, "Bandung");
//		jonathan.bicara();
		
//		Hewan kucing = new Hewan(4, "Kucing", "Angora");
//		kucing.jalan();
		
//		Mobil ferrari = new Mobil("Ferrari", "LaFerrari", 2017);
//		ferrari.gas(100);
//		ferrari.rem(200);
		
//		Motor honda = new Motor("Honda", "Supra", 150);
//		honda.gas();
//		
//		Motor yamaha = new Motor("Yamaha", "Lexi", 180);
//		yamaha.rem(4);
		
//		Helikopter helikopter = new Helikopter(250, "Parakofer");
//		helikopter.berangkat();
		
//		Manusia arrick = new Manusia("Arrick", 18, "Semarang", "Kemanggisan");
//		arrick.bicara();
		
//		System.out.println(arrick.nama + " berangkat ke Binus " + arrick.kampus + " naik helikopter " + helikopter.nama);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		String nama = scanner.nextLine();
		System.out.print("Masukkan usia: ");
		int usia = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Masukkan kota: ");
		String kota = scanner.nextLine();
		System.out.print("Masukkan kampus: ");
		String kampus = scanner.nextLine();
		System.out.println(" ");
		Manusia mahasiswa = new Manusia(nama, usia, kota, kampus);
		mahasiswa.bicara();
	}

}
