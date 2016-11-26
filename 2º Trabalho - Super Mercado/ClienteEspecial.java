
public class ClienteEspecial extends Cliente {
	
	private double desconto;


	public ClienteEspecial(String n, int i) {
		super(n, i);
		setDesconto(0.10);
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void daDesconto(){
		
		Produto[] arrayPegaValor = getProdutos();
		double valorTotalProdutos = 0;
		
		for (int i = 0; i < getProdutos().length; i++) 
			if(arrayPegaValor[i] != null)
				valorTotalProdutos += arrayPegaValor[i].getPreço();
				
			
		valorTotalProdutos = valorTotalProdutos * desconto;
				
				
		
		
		
			
	}

}
