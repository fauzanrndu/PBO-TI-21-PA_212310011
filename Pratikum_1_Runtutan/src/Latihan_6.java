import java.util.Scanner;
public class Latihan_6{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Usia : ");
		String usia = in.nextLine();
		
		System.out.println("First Name : ");
		String firstname = in.nextLine();
		
		System.out.println("Last Name : ");
		String lastname =in.nextLine();
		
		System.out.println("NPM : ");
		String npm = in.nextLine();
		
		System.out.println(usia.concat(firstname).concat(lastname).concat(npm));
	}
}