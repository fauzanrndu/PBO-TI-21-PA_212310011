import javax.swing.JOptionPane;
public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pnjngArray= JOptionPane.showInputDialog(null,"Masukan jumlah array","Input",JOptionPane.INFORMATION_MESSAGE);
		int jmlhArray = Integer.parseInt(pnjngArray);
		int[] Angka=new int[jmlhArray];
		
		for(int i=0;i<jmlhArray;i++) {
			String vluesAngka = JOptionPane.showInputDialog(null,"Masukan angka:","Data array ke -" +i, JOptionPane.QUESTION_MESSAGE);
			Angka[i]=Integer.parseInt(vluesAngka);
		}
		
		String output = "";
		
		for(int x=0;x<jmlhArray; x++) {
			output+="Array angka["+x+"]="+Angka[x];
			System.out.println();
		}
		JOptionPane.showMessageDialog(null, output,"Output Array",JOptionPane.INFORMATION_MESSAGE);
	}

}
