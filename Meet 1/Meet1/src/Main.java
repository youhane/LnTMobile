import java.util.Iterator;
import java.util.Scanner;

public class Main {
//	global variable
	int x = 20;

	public static void main(String[] args) {
		System.out.println("Hello");
		
//		Primitve Data Types
//		int, char, double, string
		
//		Abstract Data Types
//		Stack<Integer> intStack = new Stack<Integer>();
//		Stack data structure
//		intStack.push(7);
//		intStack.push(5);
		
//		Input
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, what's your name?");
		String name = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt(); input.nextLine();
		
		System.out.println("Hello " + name + " you are " + age + " years old");
		
//		Operator
//		Aritmethic
//		+, -, *, /, %
		
//		Relational
//		<=, >, ==, !=
		
//		Logical
//		&&, ||
		
//		Unary
//		i++, ++i, i--, --i
		
//		Bitwise and Shift
//		8 << 2
		
//		Assignment
//		int a = 7
//		int b = 10
//		b = a
		
//		Selection
		int umur = 14;
		if (umur > 17) {
			System.out.println("Ini 17");
		} else {
			System.out.println("Ini bukan 17");
		}
		
		switch (umur) {
		case 14:
			System.out.println("Angka 14");
			break;
		default:
			System.out.println("Bukan");
			break;
		}
		
		System.out.println(umur > 10 ? "Lebih dari 10" : "Kurang dari 10");
		
//		Repetition
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int x = 0;
		while (x != 10) {
			System.out.println(x);
			x++;
		}
		
		int y = 0;
		do {
			System.out.println(y);
			y++;
		} while (y != 5);
		
	}

}
