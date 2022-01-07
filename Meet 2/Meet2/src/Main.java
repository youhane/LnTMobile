
public class Main {

	public static void main(String[] args) {
//		String Manipulation
		String name = "Ini nama Orang";
		
//		Length()
		System.out.println(name.length());
		
//		Startswith() boolean returnnya
		System.out.println(name.startsWith("Ini "));
		
//		Endswith() boolean returnnya
		System.out.println(name.endsWith(" Orang"));
		
//		Equals() boolean returnnya
		System.out.println(name.equals("Ini nama Orang"));
		
//		Equalsignorecase() boolean returnnya
		System.out.println(name.equalsIgnoreCase("ini nama orang"));
		
//		Tolowercase() lowercasein semuanya
		System.out.println(name.toLowerCase());
		
//		Touppercase() uppercasein semuanya
		System.out.println(name.toUpperCase());
		
//		Contains() boolean returnnya
		System.out.println(name.contains("nama"));
		
//		Concat()
		System.out.println(name.concat(" Spasi Spasi Spasi"));
		
//		Substring(indexAwal, indexEnd)
		System.out.println(name.substring(4, 10));
		
//		Math Function
		int number = 81;
		int pangkat = 9;
		
//		Sqrt()
		System.out.println(Math.sqrt(number));
		
//		Pow(angka, pangkat)
		System.out.println(Math.pow(pangkat, 2));
		
//		Ceil()
		System.out.println(Math.ceil(number));
		
//		Floor()
		System.out.println(Math.floor(number));
		
//		Round()
		System.out.println(Math.round(number));
		
//		Rint()
		System.out.println(Math.rint(number));
		
//		Random()
						//min						max
		int mauDirandom = 1 + (int)(Math.random() * 10);
		System.out.println(mauDirandom);
		
//		Toradians()
		System.out.println(Math.toRadians(number));
		
//		Trigonometri
		System.out.println(Math.sin(Math.toRadians(number)));  //Sin
		System.out.println(Math.cos(Math.toRadians(number)));  //Cos
		System.out.println(Math.tan(Math.toRadians(number)));  //Tan
	}

}
