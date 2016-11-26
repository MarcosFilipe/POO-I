
public class Controle {
	public static void main(String[] args) {
	
		InteracaoU iu;
	
		iu = new InteracaoU();
	
		Cidades ci;
	
		ci = new Cidades();
	
		//perguntar a quantidade de cidades ao usuário
		int tamanho = iu.pegaValorInt("insira a quantidade de cidades");
	
		ci.setTamanho(tamanho);
		
		//matriz auxiliar para receber os dados para setar a matriz principal
		int [][] cidades = new int [tamanho][tamanho];
			for(int i=0; i<tamanho;i++)
				for(int j=0; j<tamanho; j++)
					if(i==j)
						cidades[i][j] = 1;
					else
					cidades[i][j] = iu.pegaValorInt("se a cidade " + (i) + " possui estrada de ida para " + (j) + " insira '1'. Se não há, insira '0'");
			
		ci.setCidades(cidades);	
	
		//opcional, mostra como ficou a matriz.
		iu.mostraResultado(ci.getCidades());
		
		ci.MostraQuantidadeCaminhos(iu.pegaValorInt("insira a cidade a qual deseja consultar a quantidade de caminhos"));
		
		ci.MostraQualMaiorVem();
		
		ci.MostraTodasMaoDupla(iu.pegaValorInt("insira a cidade que deseja consultar se todas as cidades são de mão dupla."));
	
		ci.RelacionaDireta(iu.pegaValorInt("insira a cidade qual deseja relacionar as cidades que chegam por estradas diretas até ela:"));
		
		ci.cidadeIsolada();
	
		ci.CidadesSemSaida();
		
		ci.CidadesSemEntrada();
	
	
	
	
	
	}
	
}

