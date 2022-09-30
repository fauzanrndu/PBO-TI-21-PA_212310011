
public class Latihan_8 {

	public static void main(String[] args) {
		
		int npm,smester;
		double ipk;
		npm = nomorpokokmahasiswa();
		System.out.println(npm);
		namalenkapmahasiswa();
		kelasmahasiswa();
		smester = semestermahasiswa();
		ipk = indeksprestasikumulatif();
		System.out.println(smester);
		System.out.println(ipk);
		
		
		
	}
	static int nomorpokokmahasiswa() {
		int npm = 12345678;
		return npm;
	}
	static void namalenkapmahasiswa() {
		String namalngkap = "Budi Setiawan";
		System.out.println(namalngkap);
	}
	static void kelasmahasiswa() {
		String kelasmhsiswa = "TI-21-PA";
		System.out.println(kelasmhsiswa);
	}
	static int semestermahasiswa() {
		int smester = 3;
		return smester;
	}
	static double indeksprestasikumulatif() {
		double ipk = 3.40;
		return ipk;
	}

}
