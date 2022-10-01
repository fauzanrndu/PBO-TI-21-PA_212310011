import java.util.Scanner; 
import javax.swing.JOptionPane;
class Students{
	private int NPM;
	
	public int getNPM(){
		return NPM;
	}
	
	public void setNPM(int NomorPokokMahasiswa) {
		NPM = NomorPokokMahasiswa;
	}
}
public class Assignment1 {
	static Students mybio = new Students();

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		String NPM = JOptionPane.showInputDialog(null, "Please insert you NPM : " );
		if(NPM.isEmpty()) {
			JOptionPane.showMessageDialog(null,"NPM tidak boleh kosong", "Error Message",JOptionPane.ERROR_MESSAGE );
		}else if(NPM.length()>5){
			JOptionPane.showMessageDialog(null, "Minimum 1 digit dan maximum 5 digit","Error message", JOptionPane.WARNING_MESSAGE);
		}else {
			int NPMKonversi = Integer.parseInt(NPM);//merubah tipe data dari String ke Integer
			mybio.setNPM(NPMKonversi);
			JOptionPane.showMessageDialog(null, "Your NPM is " +mybio.getNPM(),"Success",JOptionPane.INFORMATION_MESSAGE);
			
			}
		}

	}

	
