import java.util.Scanner; 
public class Latihan_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("NPM : ");
		int npm = in.nextInt();
		
		if(npm%2==1) {
			System.out.println("Termasuk bilangan Prima");
		}else {
			System.out.println("Bukan termasuk bilangan Prima karna dapat dibagi dengan 2");
		}
		
	}

}
