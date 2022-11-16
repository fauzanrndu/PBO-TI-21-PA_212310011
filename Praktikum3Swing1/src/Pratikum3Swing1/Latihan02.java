package Pratikum3Swing1;
import javax.swing.JOptionPane;


public class Latihan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane jop = new JOptionPane();
		Biodata Bio = new Biodata();
		
		String Namalengkap1 = jop.showInputDialog(null, "Nama lengkap : ");
		String Usia1 = jop.showInputDialog(null, "Usia :" );
		String Alamat1 = jop.showInputDialog(null, "Alamat : ");
		int Usia2 = Integer.parseInt(Usia1);
		
		Bio.nilaimasukan(Namalengkap1, Usia2, Alamat1);
		Bio.tampilkannilai();
	}

}
