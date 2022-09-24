
public class Latihan_2 {

	public static void main(String[] args) {
		//menghitung luas dan keliling atau volume ruas bangunan
		
	float s,ls;
		ls = segitigakerucutluasselimut();
		s= segitigakerucutapotema();
		System.out.println("Apotema Segitiga Kecurut = "+ s);
		System.out.println("Luas selimut Segitiga Kerucut "+ ls);

	}
	static float segitigakerucutapotema() {
		float jrijri = 7, tnggi = 10, s;
		s =(jrijri*jrijri)+(tnggi*tnggi);
		return s;
	}
	static float segitigakerucutluasselimut() {
		//pemberian nilai
		float t = 16;
		float d = 24;
		float r = d/2;
		//menghitung apotema
		float s = (r*r)+(t*t);
		//menghitung luas selimut
		float ls = (float) (3.14 *r*s);
		return ls;
		
		
		
	}

}
