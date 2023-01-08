import javax.swing.JOptionPane;
public class Latihan05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Isi[] = {"Nama Lengkap","Alamat","No Telp"};
		final int ukuranIsi=Isi.length;
		
		for(int i=0;i<ukuranIsi;i++) {
			String Nilai = JOptionPane.showInputDialog(null, "Masukkan " + Isi[i] + ":", "Data array ke - " + i, JOptionPane.INFORMATION_MESSAGE);
			Isi[i]=Nilai;
		}
		
		String tampilan="";	
		
		for(int x=0;x<ukuranIsi;x++) {
			String keluaranIsi[]={"Nama Lengkap","Alamat","No Telp"};
			tampilan+=keluaranIsi[x]+": "+Isi[x]+ "\n";
		}
		
		JOptionPane.showMessageDialog(null, tampilan);
	}

}
