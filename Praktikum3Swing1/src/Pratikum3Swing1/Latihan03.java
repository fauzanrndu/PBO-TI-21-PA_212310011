import javax.swing.JOptionPane;
public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biodata bio = new Biodata();
		
		 String  err = "Error";
		 String in = "Info";
		 String numerik = "[0-9]+";
		
		JOptionPane.showMessageDialog(null, "selamat datang!",in,JOptionPane.INFORMATION_MESSAGE);
		
		
		//validasi nama
		String nama = JOptionPane.showInputDialog(null,"Masukan nama lengkap anda:","Input nama", JOptionPane.QUESTION_MESSAGE);
		if(nama.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Field form nama tidak boleh kosong!",err, JOptionPane.WARNING_MESSAGE);
		}//selesai
		
		
		//validasi usia
		String usia = JOptionPane.showInputDialog(null,"Masukan usia anda","Input usia", JOptionPane.QUESTION_MESSAGE);
		if(usia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field form usia tidak boleh kosong!",err,JOptionPane.WARNING_MESSAGE);
		}else if (!usia.matches(numerik)) {
			JOptionPane.showMessageDialog(null, "Field form usia harus angka!",err,JOptionPane.WARNING_MESSAGE);
		}//selesai
		
		
		//validasi alamat
		String alamat = JOptionPane.showInputDialog(null, "Masukan Alamat anda","Input alamat", JOptionPane.QUESTION_MESSAGE);
		if (alamat.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Field form alamat tidak boleh kosong!",err,JOptionPane.WARNING_MESSAGE);
		}else if (alamat.length() < 10) {
			JOptionPane.showMessageDialog(null, "Field form alamat minimun 10 karakter!");
		}//selesai
		
		int umur = Integer.parseInt(usia);
		bio.nilaimasukan(nama, umur, alamat);
		bio.tampilkannilai();
		
		JOptionPane.showMessageDialog(null, "akhir dari program", in, JOptionPane.INFORMATION_MESSAGE);
	}

}
