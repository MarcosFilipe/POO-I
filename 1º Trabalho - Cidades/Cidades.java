import javax.swing.JOptionPane;

public class Cidades {

	private int [][] cidades;
	private int tamanho;
	
	public Cidades(){
		super();	
	}
	
	public Cidades(int tamanho) {
		cidades = new int[tamanho][tamanho];
		
	}
	
	public int[][] getCidades() {
		return cidades;
	}

	public void setCidades(int[][] cidades) {
		this.cidades = cidades;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	//consultar a quantidade de entradas e saidadas de uma cidade k
	public void MostraQuantidadeCaminhos(int k){
		int  vai = 0;
		int vem = 0;
		for(int j=0; j<tamanho; j++){
			if(cidades[k][j] ==1)
				if(k==j)
					vai += 0;
				else
					vai += 1;
				if(cidades[j][k] == 1)
					if(j==k)
						vem += 0;
					else
						vem = vem+1;
			
		}
		JOptionPane.showMessageDialog(null,"A cidade (" +(k)+ ") tem (" +(vai)+ ") estradas de saida, e (" +(vem)+ ") estradas de entrada.");
	}
	
	//mostra qual cidade possui mais estradas de entrada
	public void MostraQualMaiorVem(){
		int quantCidadesMaisEntradas = 0;
		int tamanhoMaiorVem = 0;
		int n=0;
		for(int k=0; k<tamanho; k++){
			int vem = 0;
			for(int j=0; j<tamanho; j++)
				if(cidades[j][k] == 1){
					if(j==k)
						vem =vem+0;
					else
						vem =vem+1;
					}	
				
			if(vem >= tamanhoMaiorVem)
				tamanhoMaiorVem = vem;
			}
		if(tamanhoMaiorVem > 0){
			for(int k=0; k<tamanho; k++){
				int vem = 0;
				for(int j=0; j<tamanho; j++){
					if(cidades[j][k] == 1){
						if(j==k)
							vem = vem +0;
						else
							vem = vem + 1;
					}
				}
				if(vem == tamanhoMaiorVem)
					quantCidadesMaisEntradas = quantCidadesMaisEntradas +1;
					
					 }
			}
		
		int[] CidadesMaisEntradas = new int[quantCidadesMaisEntradas];
		
		if(tamanhoMaiorVem > 0){
			for(int k=0; k<tamanho; k++){
				int vem = 0;
				for(int j=0; j<tamanho; j++){
					if(cidades[j][k] == 1){
						if(j==k)
							vem = vem +0;
						else
							vem = vem + 1;
					}
				}
				if(vem == tamanhoMaiorVem){
					 CidadesMaisEntradas[n] = k;
					 if(n < CidadesMaisEntradas.length)
						 n++;
				}		 
			}
		}
			if(quantCidadesMaisEntradas == 1){
				String resultado = " ";
				for(int linha = 0; linha < CidadesMaisEntradas.length; linha++){
					resultado += " " + CidadesMaisEntradas[linha];
				}
				resultado += "\n";
				JOptionPane.showMessageDialog(null,"A cidade que possui maior quantidade de entada é a cidade: (" +resultado+ ")");		
			}
			else
				if(quantCidadesMaisEntradas >1){
					String resultado = " ";
					for(int linha = 0; linha < CidadesMaisEntradas.length; linha++){
						resultado += " " + CidadesMaisEntradas[linha];
					}
					resultado += "\n";
					JOptionPane.showMessageDialog(null, "As cidades que possuem maior quantidade de entadas são as cidades: (" +resultado+ ")");		
				}
				else 
					JOptionPane.showMessageDialog(null, "nunhuma cidade possui estrada de entrada");
	}
	
	//verificar se todas as estradas da cidade k são de mão dupla
	public void MostraTodasMaoDupla(int k){
		int sim = 0;
		int vai = 0;
		int vem = 0;
		for(int j=0; j<tamanho; j++){
			if(cidades[k][j] == 1){
				if(k==j)
					vai = vai + 0;
				else
					vai = vai + 1;
				}
				if(cidades[j][k] == 1){
					if(j==k)
						vem = vem + 0;
					else
						vem = vem + 1;
					}
				if(k!=j){
					if(cidades[k][j] == 1 && cidades[j][k]== 1)
						sim = sim + 1;
					else 
						sim = sim + 0;
				}
				if(k==j){
					if(cidades[k][j] == 1 && cidades[j][k]== 1)
						sim = sim + 0;
				}
				
		}
		if(sim > 0){
			if(vem > 0 && vem == vai)
				JOptionPane.showMessageDialog(null, "Todas as estradas da cidade (" + k + ") são de mão dupla");
		
				else
					if(vem != vai)
						JOptionPane.showMessageDialog(null, "Nem todas as estradas da cidade (" +k+ ") são de mão dupla.");
						
		}
					else 
						if(sim == 0)
							JOptionPane.showMessageDialog(null, " Nenhuma estrada da cidade (" +k+ ") é de mão dupla.");
						
	}
	
    // consultar quais as cidades com estradas diretas até a cidade k
	public void RelacionaDireta(int k){
		int direta = 0;
		int vem = 0;
		for(int j=0; j<tamanho; j++){
			if(cidades[j][k] == 1){
				if(j==k)
					vem = vem + 0;
				else
						vem = vem + 1;
					}
				if(vem > direta)
					direta = vem;
		}
		 int[] Diretas = new int[direta];
		 int m=0;
			 for(int j=0; j<tamanho; j++){
					 if(cidades[j][k] == 1){
						 if(j==k)
							 vem = vem + 0;
						 else{
							 vem = vem + 1;
							 if(m<direta)
							 Diretas[m] = j;
							 m++;
						 }
					 }
				 }
			if(direta == 0)
				JOptionPane.showMessageDialog(null, "Não existem cidades com estradas diretas até a cidade (" +k+ ")");
			else
				if(direta == 1){
					String resultado = " ";
					for(int linha = 0; linha < Diretas.length; linha++){
						resultado += " " + Diretas[linha];
					}
					resultado += "\n";
					JOptionPane.showMessageDialog(null, "A cidade que possui( estrada direta até a cidade (" +k+ ")É a cidade: (" + resultado + ")");		
				}
				else
					if(direta >1){
						String resultado = " ";
						for(int linha = 0; linha < Diretas.length; linha++){
						resultado += " " + Diretas[linha];
						}
						resultado += "\n";
						JOptionPane.showMessageDialog(null, "As cidades que possuem estradas diretas até a cidade (" +k+ ") são as cidades: (" +resultado+ ")");		
					}
	}
	// verifica se há cidades isoladas 
	public void cidadeIsolada(){
		int isoladas = 0;
		int m=0;
		for(int k=0; k<tamanho; k++){
			int vai = 0;
			int vem = 0;
			for(int j=0; j<tamanho; j++){
				if(cidades[k][j] ==1){
					if(k==j)
						vai+=0;
					else
						vai += 1;
					}
				if(cidades[j][k] == 1){
					if(j==k)
						vem +=0;
					else
						vem += 1;
					}	
				}
			if(vem == 0 && vai == 0)
				isoladas = isoladas+1;
			}
		
		int[] Aisoladas = new int[isoladas];
		if(isoladas > 0){
			for(int k=0; k<tamanho; k++){
				int vai = 0;
				int vem = 0;
				for(int j=0; j<tamanho; j++){
					if(cidades[k][j] ==1){
						if(k==j)
							vai=vai+0;
						else
						vai=vai+ 1;
						}
					if(cidades[j][k] == 1){
						if(j==k)
							vem = vem +0;
						else
							vem = vem + 1;
					}
				}
				if(vem == 0 && vai ==0)
				if(m<=isoladas){
					 Aisoladas[m] = k;
					 m++;
					 }
			}
		}
				if(isoladas > 1){
					String resultado = " ";
					for(int linha = 0; linha < Aisoladas.length; linha++){
						resultado += " " + Aisoladas[linha];
					}
					resultado += "\n";
					JOptionPane.showMessageDialog(null, "As cidades (" + resultado + ") são isoladas");
				}
				else
					if(isoladas == 1){
						String resultado = " ";
						for(int linha = 0; linha < Aisoladas.length; linha++){
							resultado += " " + Aisoladas[linha];
						}
						resultado += "\n";
						JOptionPane.showMessageDialog(null, "A cidade (" + resultado + ") É isolada");
					}
					else
						JOptionPane.showMessageDialog(null, "nenhuma cidade é isolada");
				
				
	}
		
	//verifica se há alguma cidade sem estradas de saida apesar de haver entrada.
	public void CidadesSemSaida(){
		int semSaida = 0;
		int m=0;
		int isoladas=0;
		for(int k=0; k<tamanho; k++){
			int vai = 0;
			int vem = 0;
			for(int j=0; j<tamanho; j++){
				if(cidades[k][j] ==1){
					if(k==j)
						vai+=0;
					else
						vai += 1;
					}
				if(cidades[j][k] == 1){
					if(j==k)
						vem +=0;
					else
						vem += 1;
					}	
				}
			if(vem >0 && vai == 0)
			semSaida = semSaida+1;
			if(vem == 0 && vai == 0)
				isoladas = +1;
		}
		
		int[] CidadesSemSaida = new int[semSaida];
		
		if(semSaida > 0){
			for(int k=0; k<tamanho; k++){
				int vai = 0;
				int vem = 0;
				for(int j=0; j<tamanho; j++){
					if(cidades[k][j] ==1){
						if(k==j)
							vai=vai+0;
						else
						vai=vai+ 1;
						}
					if(cidades[j][k] == 1){
						if(j==k)
							vem = vem +0;
						else
							vem = vem + 1;
					}
				}
				
				if(vem >0 && vai ==0){
						CidadesSemSaida[m] = k;
						m++;
					}
			}
		}
		if(semSaida == 1){
			String resultado = " ";
			for(int linha = 0; linha < CidadesSemSaida.length; linha++){
				resultado += " " + CidadesSemSaida[linha];
			}
			resultado += "\n";
			JOptionPane.showMessageDialog(null, "A cidade (" + resultado + ") não possui saidas");
		}
			else
				if(semSaida > 1){
					String resultado = " ";
					for(int linha = 0; linha < CidadesSemSaida.length; linha++){
						resultado += " " + CidadesSemSaida[linha];
					}
					resultado += "\n";
					JOptionPane.showMessageDialog(null, "As cidades (" + resultado + ") possuem entradas mas não possuem saidas");
				
		}
					else if(semSaida == 0 && isoladas == 0)
						JOptionPane.showMessageDialog(null, "Todas as cidades possuem saida");
	}
	// verifica se há cidades sem entrada apesar de haver saida
	public void CidadesSemEntrada(){
		int semEntrada = 0;
		int m=0;
		int isoladas=0;
		for(int k=0; k<tamanho; k++){
			int vai = 0;
			int vem = 0;
			for(int j=0; j<tamanho; j++){
				if(cidades[k][j] ==1){
					if(k==j)
						vai+=0;
					else
						vai += 1;
					}
				if(cidades[j][k] == 1){
					if(j==k)
						vem +=0;
					else
						vem += 1;
					}	
				}
			if(vem ==0 && vai > 0)
			semEntrada = semEntrada+1;
			if(vem == 0 && vai == 0)
				isoladas = +1;
		}
		
		int[] CidadesSemEntrada = new int[semEntrada];
		
		if(semEntrada > 0){
			for(int k=0; k<tamanho; k++){
				int vai = 0;
				int vem = 0;
				for(int j=0; j<tamanho; j++){
					if(cidades[k][j] ==1){
						if(k==j)
							vai=vai+0;
						else
						vai=vai+ 1;
						}
					if(cidades[j][k] == 1){
						if(j==k)
							vem = vem +0;
						else
							vem = vem + 1;
					}
				}
				
				if(vem == 0 && vai > 0){
						CidadesSemEntrada[m] = k;
						m++;
					}
			}
		}
		if(semEntrada == 1){
			String resultado = " ";
			for(int linha = 0; linha < CidadesSemEntrada.length; linha++){
				resultado += " " + CidadesSemEntrada[linha];
			}
			resultado += "\n";
			JOptionPane.showMessageDialog(null, "A cidade (" + resultado + ") não possui Entradas");
		}
			else
				if(semEntrada > 1){
					String resultado = " ";
					for(int linha = 0; linha < CidadesSemEntrada.length; linha++){
						resultado += " " + CidadesSemEntrada[linha];
					}
					resultado += "\n";
					JOptionPane.showMessageDialog(null, "As cidades (" + resultado + ") possuem Saidas mas não possuem Entradas");
				
		}
					else if(semEntrada == 0 && isoladas == 0)
						JOptionPane.showMessageDialog(null, "Todas as cidades possuem Entrada");
	}
}