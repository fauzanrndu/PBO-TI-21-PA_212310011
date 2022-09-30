import java.util.Scanner;
public class Latihan_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Nama : ");
		String nama = in.nextLine();
		nama  = nama.replaceAll("[a,u,i,e,o]","x");
		System.out.println(nama);
	}

}
