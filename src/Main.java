
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter number a ");
		int a = input.nextInt();
		System.out.println("Please enter number b ");
		int b = input.nextInt();
		System.out.println("Please enter number c ");
		int c = input.nextInt();
		System.out.println("Please enter number d ");
		int d = input.nextInt();

		System.out.println("(a + b + c + d) =  " + (a + b + c + d));

		input.close();

	}

}
