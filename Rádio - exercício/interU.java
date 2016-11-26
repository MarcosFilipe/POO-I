import javax.swing.JOptionPane;


public class interU {
	
	public int pegaInt(String m){
		return Integer.parseInt(JOptionPane.showInputDialog(null, m));
	}
	
	public String pegaString(String m){
		return JOptionPane.showInputDialog(null, m);
	}
	public void mostraString(String m){
		JOptionPane.showMessageDialog(null, m);
	}
	


}
