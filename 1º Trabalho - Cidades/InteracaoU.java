import javax.swing.JOptionPane;

public class InteracaoU {
	
	//metodo para pegar um valor inteiro do usuário
	public int pegaValorInt(String m){
		return Integer.parseInt(JOptionPane.showInputDialog(null, m));
	}

    //(opcional) metodo para mostrar como ficou a matriz.
    public void mostraResultado(int[][] cidades) {
		// TODO Auto-generated method stub
		String resultado = " ";
		for(int linha = 0; linha < cidades[0].length; linha++){
			for(int coluna = 0; coluna < cidades.length; coluna++){
				resultado += " " + cidades[linha][coluna];
			}
			resultado += "\n";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}


	
}
