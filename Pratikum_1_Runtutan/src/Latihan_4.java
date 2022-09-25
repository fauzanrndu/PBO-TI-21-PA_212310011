import java.util.Scanner;
public class Latihan_4 {

	public static void main(String[] args) {
		float x, harga = 6300, total, subtotal,diskon ;
		
System.out.println("=======================================================================================		");
		System.out.println("TOKO SERBAGUNA IBIK");
System.out.println("=======================================================================================");
		System.out.print("Masukan jumlah produk yang dibeli :");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		System.out.println("ITEM\t\tQTY\t\tHARGA\t\tTOTAL");
		total = (x*harga);
		System.out.println("ROTI ENAK.\t "+x+"\t"+"\t"+"Rp "+harga+"\t"+"\t"+"Rp "+total);
System.out.println("----------------------------------------------------------------------------------------	");
		if(x%3==0) {
			System.out.println("Diskon : 5%");
			diskon = (float) (total*0.05);
			subtotal = total-diskon;
			System.out.println("Sub Total : Rp "+subtotal);
		}else {
			System.out.println("Diskon : 10%");
			diskon = (float) (total*0.1);
			subtotal = total-diskon;
			System.out.println("Sub Total : RP "+subtotal);
		}
	}
}
