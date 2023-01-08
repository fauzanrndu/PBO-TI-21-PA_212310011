import java.util.Scanner;
public class Latihan02 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] Angka = new int[7];
		final int sizeAngka = Angka.length;
		int valueAngka = 0;
		
		for(int i=0;i<sizeAngka;i++) {
			System.out.println("Masukan nilai array angka indeks ke - "+i+"=");
			valueAngka = userInput.nextInt();
			Angka[i]=valueAngka;
		}
		System.out.println();
		
		for(int x=0;x<sizeAngka;x++) {
			System.out.println("Array angka["+x+"]="+Angka[x]);
		}
	
		userInput.close();

			
	}
}


