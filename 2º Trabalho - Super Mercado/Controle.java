public class Controle {
public static void main(String[] args) {
	
	Cliente c;
	
	interU iu;
	
	iu = new interU();
	
//------------definir lista de clientes------------//
	
	int tamanho = iu.pegaInt("insira o tamanho da lista de clientes \n");
	
	String pegaNome = null;
	
	Cliente[][] clientes = new Cliente[tamanho][tamanho];
	
	for(int i=0; i<clientes.length; i++){
		for(int j=0; j<clientes[0].length; j++){
			 pegaNome = iu.pegaString("insira o nome do cliente \n  *(espaços não são aceitos. "
					+ "em caso de nomes iguais use: 'MariaAparecida' \n \n Digite (parar) para terminar de cadastrar clientes \n");
			 
			 if(pegaNome.equals("parar"))
				break;
			
			c = new Cliente(pegaNome, 6);			
			clientes[i][j] = c;
			
		}
		if(pegaNome.equals("parar"))
			break;
	}
//----------------------------------------------------//
	GerenciaClientes gc = new GerenciaClientes();
	
	gc.setClientes(clientes);
	gc.fazCompras();
	
  //-------------------menu do programa-------------------------------//
	
	String opcaoSelecionada = null;
	
	while(opcaoSelecionada != "7"){
	
		opcaoSelecionada = iu.pegaString("Escolha uma das opções a seguir: \n \n "
			+ "1- Pesquisar quais clientes compraram determinado produto. \n"
			+ " 2- Pesquisar de um determinado produto foi comprado por pelomenos um cliente. \n "
			+ "3- Informar a quantidade de clientes. \n"
			+ "4- Informar a quantidade de clientes especiais \n"
			+ " 5- Histórico de descontos. \n"
			+ "6- Total das compras de cada cliente. \n"
			+ "7- Sair");
		
		if(opcaoSelecionada.equals("1") )
			gc.informaQuemComprouTalPoduto();
		
		else
			if(opcaoSelecionada.equals("2"))
				gc.pesquisarInesistenciaDeProduto();
		
			else
				if(opcaoSelecionada.equals("3"))
					gc.quantidadeClientes();
				
				else
					if(opcaoSelecionada.equals("4"))
						gc.MostraQuantidadeClientesEsp();
				
					else
						if(opcaoSelecionada.equals("5"))
							gc.MostraHistoricoDescontos();
		
						else
							if(opcaoSelecionada.equals("6"))
								gc.totalCompras();
		
							else
								if(opcaoSelecionada.equals("7"))
									break;
		
								else
									continue;
	}
	
	//-------------------------------------------------------------------//
}	
}
