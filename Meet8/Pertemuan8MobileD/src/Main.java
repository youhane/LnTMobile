
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(40/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handling finished");
		}
	}
}
