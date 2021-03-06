import java.util.ArrayList;
import java.util.Scanner;

/*
 
 Buatlah sebuah program di mana pengguna dapat melakukan input dan melihat data-data
 input administrasi perkuliahan.
 1) Pengguna dapat menginput nama (panjang nama harus lebih dari 2 huruf)
 2) Pengguna dapat menginput usia (usia harus lebih dari 15 tahun)
 3) Pengguna dapat menginput NIM (panjang NIM harus 10 huruf)
 4) Pengguna dapat menginput lokasi (lokasi harus di antara Kemanggisan, Alam Sutera,
 Bekasi, Bandung, Semarang, Malang)
 5) Pengguna dapat melihat data-data input
 
*/

public class Main {

	ArrayList<Mahasiswa> daftar = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	int input;

	void input() {
		String nama, nim, lokasi;
		int usia, valid = 0;
		Mahasiswa maba = new Mahasiswa();
		do {
			System.out.print("Nama: ");
			nama = scan.nextLine();
			if (nama.length() > 2) {
				valid = 1;
			}
		} while (valid != 1);
		maba.setNama(nama);
		valid = 0;
		do {
			System.out.print("Usia: ");
			usia = scan.nextInt();
			scan.nextLine();
			if (usia > 15) {
				valid = 1;
			}
		} while (valid != 1);
		maba.setUsia(usia);
		valid = 0;
		do {
			System.out.print("NIM: ");
			nim = scan.nextLine();
			if (nim.length() == 10) {
				valid = 1;
			}
		} while (valid != 1);
		maba.setNim(nim);
		valid = 0;
		do {
			System.out.print("Lokasi (Kemanggisan | Alam Sutera | Bekasi | Bandung | Semarang | Malang): ");
			lokasi = scan.nextLine();
			if (lokasi.equals("Kemanggisan") ||
					lokasi.equals("Alam Sutera") ||
					lokasi.equals("Bekasi") ||
					lokasi.equals("Bandung") ||
					lokasi.equals("Semarang") ||
					lokasi.equals("Malang")) {
				valid = 1;
			}
		} while (valid != 1);
		maba.setLokasi(lokasi);
		// Mahasiswa maba = new Mahasiswa(nama, usia, nim, lokasi);
		daftar.add(maba);
		System.out.println("==========================");
		System.out.println("Data berhasil diinput. Tekan apa saja untuk melanjutkan...");
		scan.nextLine();
		mainmenu();
	}

	void view() {
		System.out.println("==========================");
		System.out.println("DATA MAHASISWA");
		for (int i = 0; i < daftar.size(); i++) {
			System.out.println("==========================");
			System.out.println("Mahasiswa " + (i + 1));
			System.out.println("Nama: " + daftar.get(i).getNama());
			System.out.println("Usia: " + daftar.get(i).getUsia());
			System.out.println("NIM: " + daftar.get(i).getNim());
			System.out.println("Lokasi: " + daftar.get(i).getLokasi());
			System.out.println("==========================");
		}
		System.out.println("==========================");
		System.out.println("Tekan apa saja untuk melanjutkan...");
		scan.nextLine();
		mainmenu();
	}

	void exit() {
		System.out.println("==========================");
		System.out.println("Terima kasih");
		return;
	}

	void mainmenu() {
		System.out.println("==========================");
		System.out.println("1. Input");
		System.out.println("2. View");
		System.out.println("3. Exit");
		System.out.print(">> ");
		input = scan.nextInt();
		scan.nextLine();
		switch (input) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				exit();
				break;
			default:
				mainmenu();
		}
	}

	public Main() {
		// TODO Auto-generated constructor stub
		mainmenu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
