import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
//		Array
		int age[] = {13, 17, 29, 31, 33, 45, 21, 83};
		String[] course = new String[10];
		
//		Akses nilai array
		System.out.println(age[2]);
		
//		Jumlah elemen array
		System.out.println(age.length);
		
//		Manipulasi elemen array
		System.out.println(age[3]);
		age[3] = 123;
		System.out.println(age[3]);
		
//		Print semua elemen array
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		for (int umur : age) {
			System.out.println(umur);
		}
		
//		Arraylist dan Vector
		ArrayList<Integer> umurLagi = new ArrayList<>();
		Vector<String> nama = new Vector<>();
		
//		Inisialisasi elemen
		umurLagi.add(23);
		umurLagi.add(2222);
		umurLagi.add(45);
		umurLagi.add(90);
		
		nama.add("gatau");
		nama.add("dog");
		nama.add("cat");
		
//		Jumlah elemen array
		System.out.println(umurLagi.size());
		System.out.println(nama.size());
		
//		Akses elemen
		System.out.println(umurLagi.get(2));
		System.out.println(nama.get(1));
		
//		Manipulasi elemen set(index, value)
		System.out.println(umurLagi.get(2));
		umurLagi.set(2, 123123);
		
//		Menghapus elemen
		System.out.println(umurLagi.get(3));
		umurLagi.remove(3);
		System.out.println(umurLagi.get(3));
		
//		Menghapus semua elemen
		umurLagi.clear();
		System.out.println(umurLagi.get(2));
		nama.removeAll(nama);
		System.out.println(nama.get(0));
		
		umurLagi.add(23);
		umurLagi.add(2222);
		umurLagi.add(45);
		umurLagi.add(90);
		
		nama.add("gatau");
		nama.add("dog");
		nama.add("cat");
		
//		Akses semua elemen
		for (int umurYangDiPrint : umurLagi) {
			System.out.println(umurYangDiPrint);
		}
		
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
			
		}
	}

}
