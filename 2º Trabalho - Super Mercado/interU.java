import javax.swing.JOptionPane;

public class interU {

	public double pegaDouble(String m){
		return Double.parseDouble(JOptionPane.showInputDialog(m));
	}
	
	public int pegaInt(String m){
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	public String pegaString(String m){
		return JOptionPane.showInputDialog(m);
	}
	
	public void mostraString(String m){
		JOptionPane.showMessageDialog(null, m);
	}
	
}
