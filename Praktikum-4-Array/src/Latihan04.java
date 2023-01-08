import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pnjngArray= JOptionPane.showInputDialog(null,"Masukan jumlah array","Input",JOptionPane.INFORMATION_MESSAGE);
		int jmlhArray = Integer.parseInt(pnjngArray);
		int[] Angka=new int[jmlhArray];
		
		for(int i=0;i<jmlhArray;i++) {
			String vluesAngka = JOptionPane.showInputDialog(null,"Masukan angka:","Data array ke -" +i, JOptionPane.QUESTION_MESSAGE);
			Angka[i]=Integer.parseInt(vluesAngka);
		}
		int maksAngka = Angka[0];
		int minAngka = Angka[0];

		String output = "";
		
		for(int x=0;x<jmlhArray; x++) {
			if(Angka[x]>maksAngka) {
				maksAngka = Angka[x];
			}else if(Angka[x]<minAngka) {
				minAngka = Angka[x];
			}
			output+="Array angka["+x+"]="+Angka[x];
			System.out.println();
		}
		output +="\nNilai terbesar adalah "+maksAngka+"\n";
		output +="Nilai terkecil adalah "+minAngka+"\n";
		JOptionPane.showMessageDialog(null, output,"Output Array",JOptionPane.INFORMATION_MESSAGE);
	}

}
