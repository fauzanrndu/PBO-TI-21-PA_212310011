import java.util.Scanner;

public class Latihan_3 {
	public static void main(String[] args) {
		
		int pilihan;
		
		System.out.println("menu sarapan");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Anda memesan : ");
		pilihan = input.nextInt();
		
		switch(pilihan) {
		case 1:
			System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-.");
			break;
		case 2:
			System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-.");
			break;
		case 3:
			System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-.");
			break;
		default:
			System.out.println("Maaf menu yang anda masukan salah");
		}
					
	}
}

