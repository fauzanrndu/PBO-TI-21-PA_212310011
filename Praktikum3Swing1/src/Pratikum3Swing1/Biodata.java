package Pratikum3Swing1;
import javax.swing.JOptionPane;
public class Biodata {
	String Namalengkap, Alamat;
	int Usia;
	
	JOptionPane jop = new JOptionPane();
	
	void nilaimasukan(String Namalengkap2, int Usia3, String Alamat2) {
		Namalengkap = Namalengkap2;
		Usia = Usia3;
		Alamat = Alamat2;
	}
	
	void tampilkannilai() {
		String keluaran = "Nama : " + Namalengkap + "\n" + "Usia : " + Usia + "\n" + "Alamat : " + Alamat;
		jop.showMessageDialog(null,keluaran,"Biodata", jop.INFORMATION_MESSAGE);
	}
}
