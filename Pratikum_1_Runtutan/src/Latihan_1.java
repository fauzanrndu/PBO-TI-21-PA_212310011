
public class Latihan_1 {

	public static void main(String[] args) {
		//Koversi suhu
		float r,k;
		CelciusToFarenheit();
		r = CelciusToRheamur();
		k = CelciusToKelvin();
		System.out.println("convert celcius to reamur");
		System.out.println("r = " + r);
		System.out.println("Convert Celcius to Kelvin");
		System.out.println("k = " + k);
		
	}
	
	static void CelciusToFarenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("convert celcius to fahrenheit");
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}
	
	static float CelciusToRheamur(){
		int c = 90;
		float r = (5/4) * c;
		return r;
	}
	
	static float CelciusToKelvin() {
		int c = 90;
		float k = (c + 273);
		return k;
	}

}
