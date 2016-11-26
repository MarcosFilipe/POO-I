import javax.swing.JOptionPane;

public class GerenciaClientes {

	private Cliente[][] clientes;
	
	private int quantidadeClientesEsp;
	
	private double desconto;
	
	private String listaDescontos;
	
	
	//-----------------------------------------------------------------------------------------------//
	//LISTA DE PRODUTOS DISPONIVEIS
	
	Produto batata = new Produto("batata", "batata rufinense", "batata rosa", 4.00);
	Produto macarrao = new Produto("macarrao", "vó vivi", "parafuso", 5.00);
	Produto refrigerante = new Produto("refrigerante", "puresa", "guaraná", 7.50);
	Produto arroz = new Produto("arroz", "kiarroz", "branco", 9.90);
	Produto feijao = new Produto("feijao", "chuats","feijão preto", 12.99);
	Produto suco = new Produto("suco", "tang", "limão", 0.99);
	Produto mesa = new Produto("mesa", "móveis cris", " mesa de jantar", 499.00);
	Produto sofa = new Produto("sofa", "San Tropez", "forno microondas", 398.90);
	Produto celular = new Produto("celular", "LG", "Lg g3", 800.00);
	Produto polenta = new Produto("polenta", "polentina", "polenta instantânea", 4.75);
	Produto ovos = new Produto("ovos", "62 ovos", "duzia de ovos", 8.00);
	
	//-----------------------------------------------------------------------------------------------//
	
	private interU iu = new interU();
	
	public GerenciaClientes() {
		super();
		this.desconto = 0.10;
		this.listaDescontos = " ";
		
	}

	public Cliente[][] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[][] clientes) {
		this.clientes = clientes;
	}
	
		public int getQuantidadeClientesEsp() {
		return quantidadeClientesEsp;
	}

	public void setQuantidadeClientesEsp(int quantidadeClientesEsp) {
		this.quantidadeClientesEsp = quantidadeClientesEsp;
	}
	
	//----------------------------------------------------------------------------------------------------------------//

		public void fazCompras(){
			
			String sim ="sim";
			String nao ="nao";
			
			String finalizarCompras = nao;
//**********			
			while(finalizarCompras.equals("nao")){
				
				String recebeNomesClientes = " ";
				
				for (int i = 0; i < clientes.length; i++) {
					for (int j = 0; j < clientes.length; j++) {
						if(clientes[i][j] != null)
							recebeNomesClientes += "(" + clientes[i][j].getNome() + ")  "; 
					}
						recebeNomesClientes += "\n";
				}
				
				String nomeCliente = iu.pegaString("insira um nome de cliente valido que deseja fazer compras. \n "
						+ "ou escolha novamente um cliente para continuar comprando."
						+ "\n \n " + recebeNomesClientes + "\n");
				
				String continuaMesmoCliente = sim;
				
				int  posicaoProduto = 0;
				
			for(int i=0; i < clientes.length; i++)
				for(int j=0; j<clientes.length; j++)
					if(clientes[i][j] != null)
						if(clientes[i][j].getNome().equals(nomeCliente)){
						//------------
							Produto[] arrayParaSetarArrayDoCliente = clientes[i][j].getProdutos();
						
							for (int l = posicaoProduto; l < arrayParaSetarArrayDoCliente.length; l++) 
								if (arrayParaSetarArrayDoCliente[l] == null)
							
									while(continuaMesmoCliente.equals(sim) && j<arrayParaSetarArrayDoCliente.length){
										
										if(arrayParaSetarArrayDoCliente[posicaoProduto] == null){
											
											//--------		
											Produto[] arrayVerificaValorTotalCompras;
											Produto auxiliarParaDarDesconto;
											
											double valorParaDarDesconto;
											double valorTotalCompras = 0;
											
											arrayVerificaValorTotalCompras = clientes[i][j].getProdutos();
										
											for (int k = 0; k < arrayVerificaValorTotalCompras.length; k++) {
												if(arrayVerificaValorTotalCompras[k] != null)
													valorTotalCompras += arrayVerificaValorTotalCompras[k].getPreço();
											}
											
									//----------
							
										int produtoEscolhido = iu.pegaInt("insira o numero referente ao produto que deseja comprar: " +"\n \n"
												+ "   PRODUTO -------------------PREÇO" +"\n"
												+ "(1)- batata --------------------4.00"+"\n"
												+ "(2)- macarrao-------------------5.00"+"\n"
												+ "(3)- refrigerante---------------7.50"+"\n"
												+ "(4)- arroz----------------------9.90"+"\n"
												+ "(5)- feijao---------------------12.99"+"\n"
												+ "(6)- suco-----------------------0.99"+"\n"
												+ "(7)- mesa-----------------------499.00"+"\n"
												+ "(8)- sofa-----------------------398.00"+"\n"
												+ "(9)- celular--------------------800.00"+"\n"
												+ "(10)- polenta-------------------4.75"+"\n"
												+ "(11)- ovos----------------------8.00 \n");
										
										
										
											
											if(produtoEscolhido == 1){
												if(valorTotalCompras > 100.00){
													auxiliarParaDarDesconto = batata;
													
													valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
													
													arrayParaSetarArrayDoCliente[posicaoProduto] = batata;
													
													arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
													
													listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
															+ "\n" + batata.getNome() + "\n \n";
												}
												else
													arrayParaSetarArrayDoCliente[posicaoProduto] = batata;
											}
											
										else
											if(produtoEscolhido == 2){
												if(valorTotalCompras > 100.00){
													auxiliarParaDarDesconto = macarrao;
													
													valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
													
													arrayParaSetarArrayDoCliente[posicaoProduto] = macarrao;
													
													arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
													
													listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
															+ "\n" + macarrao.getNome() + "\n \n";
												}
												else
													arrayParaSetarArrayDoCliente[posicaoProduto] = macarrao;
												
											}	
											else 
												if(produtoEscolhido == 3 ){
													if(valorTotalCompras > 100.00){
														auxiliarParaDarDesconto = refrigerante;
														
														valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
														
														arrayParaSetarArrayDoCliente[posicaoProduto] = refrigerante;
														
														arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
														
														listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																+ "\n" + refrigerante.getNome() + "\n \n";
													}
													else
														arrayParaSetarArrayDoCliente[posicaoProduto] = refrigerante;		
												}
												else
													if(produtoEscolhido == 4){
														if(valorTotalCompras > 100.00){
															auxiliarParaDarDesconto = arroz;
															
															valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
															
															arrayParaSetarArrayDoCliente[posicaoProduto] = arroz;
															
															arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
															
															listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																	+ "\n" + arroz.getNome() + "\n \n";
														}
														else
															arrayParaSetarArrayDoCliente[posicaoProduto] = arroz;
													}
													else
														if(produtoEscolhido == 5 ){
															if(valorTotalCompras > 100.00){
																auxiliarParaDarDesconto = feijao;
																
																valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																
																arrayParaSetarArrayDoCliente[posicaoProduto] = feijao;
																
																arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																
																listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																		+ "\n" + feijao.getNome() + "\n \n";
															}
															else
																arrayParaSetarArrayDoCliente[posicaoProduto] = feijao;
														}
														else
															if(produtoEscolhido == 6){
																if(valorTotalCompras > 100.00){
																	auxiliarParaDarDesconto = suco;
																	
																	valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																	
																	arrayParaSetarArrayDoCliente[posicaoProduto] = suco;
																	
																	arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																	
																	listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																			+ "\n" + suco.getNome() + "\n \n";
																}
																else
																	arrayParaSetarArrayDoCliente[posicaoProduto] = suco;
															}
															else
																if(produtoEscolhido == 7){
																	if(valorTotalCompras > 100.00){
																		auxiliarParaDarDesconto = mesa;
																		
																		valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																		
																		arrayParaSetarArrayDoCliente[posicaoProduto] = mesa;
																		
																		arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																		
																		listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																				+ "\n" + mesa.getNome() + "\n \n";
																	}
																	else
																		arrayParaSetarArrayDoCliente[posicaoProduto] = mesa;
																}
																else
																	if(produtoEscolhido == 8){
																		if(valorTotalCompras > 100.00){
																			auxiliarParaDarDesconto = sofa;
																			
																			valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																			
																			arrayParaSetarArrayDoCliente[posicaoProduto] = sofa;
																			
																			arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																			
																			listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																					+ "\n" + sofa.getNome() + "\n \n";
																		}
																		else
																			arrayParaSetarArrayDoCliente[posicaoProduto] = sofa;
																	}
																	else
																		if(produtoEscolhido == 9){
																			if(valorTotalCompras > 100.00){
																				auxiliarParaDarDesconto = celular;
																				
																				valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																				
																				arrayParaSetarArrayDoCliente[posicaoProduto] = celular;
																				
																				arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																				
																				listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																						+ "\n" + celular.getNome() + "\n \n";
																			}
																			else
																				arrayParaSetarArrayDoCliente[posicaoProduto] = celular;
																		}
																		else
																			if(produtoEscolhido == 10){
																				if(valorTotalCompras > 100.00){
																					auxiliarParaDarDesconto = polenta;
																					
																					valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																					
																					arrayParaSetarArrayDoCliente[posicaoProduto] = polenta;
																					
																					arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																					
																					listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																							+ "\n" + polenta.getNome() + "\n \n";
																				}
																				else
																					arrayParaSetarArrayDoCliente[posicaoProduto] = polenta;
																			}
																			else
																				if(produtoEscolhido ==11){
																					if(valorTotalCompras > 100.00){
																						auxiliarParaDarDesconto = ovos;
																						
																						valorParaDarDesconto = auxiliarParaDarDesconto.getPreço();
																						
																						arrayParaSetarArrayDoCliente[posicaoProduto] = ovos;
																						
																						arrayParaSetarArrayDoCliente[posicaoProduto].setPreço(valorParaDarDesconto - (valorParaDarDesconto * desconto));
																					
																						listaDescontos += "O Clientes ( " + clientes[i][j].getNome() +" ) recebeu o desconto no produto :"
																								+ "\n" + ovos.getNome() + "\n \n";
																					}
																					else
																						arrayParaSetarArrayDoCliente[posicaoProduto] =ovos;
																				}
																				else
																					if(produtoEscolhido > 11 || produtoEscolhido == 0){
																						JOptionPane.showMessageDialog(null,"Oops esse item não"
																							+ "consta em nosso estoque. escolha um item valido");
																					}
									
											
												
												
										
											if(produtoEscolhido > 0 && produtoEscolhido < 12){
												clientes[i][j].setProdutos(arrayParaSetarArrayDoCliente);
												continuaMesmoCliente = 
													iu.pegaString("deseja continuar comprando , Senhor(a)  " + clientes[i][j].getNome() + "? "
														+ "\n  insira: \n -(sim) \n -(nao) \n");
											}
										
											if(continuaMesmoCliente.equals(sim) && posicaoProduto+1 >= arrayParaSetarArrayDoCliente.length){
												JOptionPane.showMessageDialog(null, "Desculpe, você não tem mais espaço no seu carrinho, \n infelismente nosso sistema é limitado :/ \n"
													+ " finalize essa compra e volte mais tarde");
												break;
											}
											
											else 
												if(continuaMesmoCliente.equals(sim)){
													continue;
												}
							 
											if(continuaMesmoCliente.equals(nao)){
												posicaoProduto = 0;
												finalizarCompras = iu.pegaString("deseja finalizar todas as compras?\n insira: \n (sim) \n (nao) \n ");
												break;
											}
										}
										posicaoProduto ++;
										
									}
							
							if(arrayParaSetarArrayDoCliente[5] != null){
								iu.mostraString("desculpe seu carrinho está cheio. Dê sua vez a outro cliente e volte mais tarde");
								
								finalizarCompras = iu.pegaString("deseja finalizar todas as compras? \n \n "
										+ "insira: \n"
										+ " (sim) \n (nao) \n");
								
								posicaoProduto = 0;

								break;
								}
						}
			
				if(finalizarCompras.equals(sim)){
					
				//****			
					
					Produto[] arrayVerificaValorTotalCompras;
					
					for (int k = 0; k < clientes.length; k++) {
						for (int k2 = 0; k2 < clientes.length; k2++) {
							if(clientes[k][k2] != null){		
							
								double valorTotalCompras = 0;
							
								arrayVerificaValorTotalCompras = clientes[k][k2].getProdutos();
							
								for (int k3 = 0; k3 < arrayVerificaValorTotalCompras.length; k3++) {
									if(arrayVerificaValorTotalCompras[k3] != null)
										valorTotalCompras += arrayVerificaValorTotalCompras[k3].getPreço();
								}
							
								if(valorTotalCompras > 100.00){
									
									ClienteEspecial ce = new ClienteEspecial(clientes[k][k2].getNome() , clientes[k][k2].getProdutos().length);
								
									clientes[k][k2] = ce;
									
									clientes[k][k2].setProdutos(arrayVerificaValorTotalCompras);
								
									quantidadeClientesEsp ++;
								}
							}
						}
					}
					//****
					
					break;
				}
			}
			for (int i = 0; i < clientes.length; i++) 
				for (int j = 0; j < clientes.length; j++) {
					if(clientes[i][j] != null){
						Produto[] arrayParaImprimirCompras = clientes[i][j].getProdutos();
					
						System.out.println("\n" + clientes[i][j].getNome() );
						for (int k = 0; k < arrayParaImprimirCompras.length; k++)
							if(arrayParaImprimirCompras[k]!= null)
								System.out.println(arrayParaImprimirCompras[k]);
					}
				}
		}
		
		
		
//--------------------------------------------------------------------------------------------------------------------//		
		
		
		public void informaQuemComprouTalPoduto(){
			
			String produtoParaPesquisar = iu.pegaString("insira o produto que deseja verificar quais clientes compraram"+"\n \n"
															+ "batata, macarrao, refrigerante, arroz" +"\n"
															+"feijao, suco, mesa, sofa, " +"\n"
															+" celular, polenta, ovos \n");
			
			int quantidPessoasTemMsmProd = clientes.length;
			
			String[] pessoasComprarmMsmProd = new String[quantidPessoasTemMsmProd];
			
			int posicaoArrayQuemComprou = 0;
			
			for(int i=0; i < clientes.length; i++)
				for(int j=0; j<clientes.length; j++){
					if(clientes[i][j] != null){
						Produto[] arrayProcurarProduto = clientes[i][j].getProdutos();
			
						for (int k = 0; k < arrayProcurarProduto.length; k++) {
							if(arrayProcurarProduto[k] != null)
								if(arrayProcurarProduto[k].getNome().equals(produtoParaPesquisar)){
									pessoasComprarmMsmProd[posicaoArrayQuemComprou] = clientes[i][j].getNome();
									
									posicaoArrayQuemComprou++;
									
									break;
								}
						}
					}
				}
			if(pessoasComprarmMsmProd[0] != null){
				iu.mostraString("\n \n As pessoas que compraram " + produtoParaPesquisar+ " foram:");
				for (int j = 0; j < pessoasComprarmMsmProd.length; j++) {
					if(pessoasComprarmMsmProd[j] != null)
						iu.mostraString( pessoasComprarmMsmProd[j]);
				}
			}
				else 
					iu.mostraString("nenhum cliente comprou esse produto");
		}
		
	//-------------------------------------------------------------------------------------------------------//
		
		public void pesquisarInesistenciaDeProduto(){
			
			String produtoFoiComprado= "não";
			
			String produtoParaPesquisar = iu.pegaString("insira o produto que deseja verificar se não foi comprado \n \n"
					+ "batata, macarrao, refrigerante, arroz" +"\n"
					+"feijao, suco, mesa, sofa, " +"\n"
					+" celular, polenta, ovos \n");
			
			for(int i=0; i < clientes.length; i++){
				for(int j=0; j<clientes.length; j++){
					
					if(clientes[i][j] != null ){
						Produto[] arrayProcurarProduto = clientes[i][j].getProdutos();
					
						for (int k = 0; k < arrayProcurarProduto.length; k++) {
							if(arrayProcurarProduto[k] != null)
								if(arrayProcurarProduto[k].getNome().equals(produtoParaPesquisar)){
									produtoFoiComprado = "sim";
								
									break;
								}
						}
					}
					
					if(produtoFoiComprado.equals("sim"))
						break;
				}
			if(produtoFoiComprado.equals("sim"))
				break;
			}
			if(produtoFoiComprado.equals("sim"))
				iu.mostraString(" Verdadeiro. O produto (" + produtoParaPesquisar + ") foi comprado");
			else 
				iu.mostraString("Falso.  produto (" + produtoParaPesquisar + ") não foi comprado por nenhum cliente");
		}
	//------------------------------------------------------------------------------------------------------------//

		public void quantidadeClientes(){
			
			int quantidadeClientes = 0;
			
			for (int i = 0; i < clientes.length; i++) {
				for (int j = 0; j < clientes.length; j++) {
					if(clientes[i][j] != null)
						quantidadeClientes ++;
				}
			}
			iu.mostraString("a quantidade total de clientes é: \n " + quantidadeClientes);
		}
		
		//--------------------------------------------------------------------------------------------------------//
		

		public void MostraQuantidadeClientesEsp(){
			
			iu.mostraString("a quantidae de clientes especiais é: \n" + quantidadeClientesEsp);
		}
		
		public void MostraHistoricoDescontos(){
			if(listaDescontos != " " )
				iu.mostraString(listaDescontos);
			else
				iu.mostraString("Nenhum cliente recebeu desconto.");
		}

		
		//-----------------------------------------------------------------------------------------------------//
		
		public void totalCompras(){
			
			Produto[] ArraySomarTotalCompras;
			String listaTotalCompras = " ";
			
			
			for (int i = 0; i < clientes.length; i++) 
				for (int j = 0; j < clientes.length; j++) 
					if(clientes[i][j] != null){
						double valorTotalCompras = 0;
						
						ArraySomarTotalCompras = clientes[i][j].getProdutos();
						
						for (int k = 0; k < ArraySomarTotalCompras.length; k++) {
							if(ArraySomarTotalCompras[k] != null){
								valorTotalCompras += ArraySomarTotalCompras[k].getPreço();
							}
						}
						listaTotalCompras += clientes[i][j].getNome() + "\n" + valorTotalCompras + "\n \n";
						
					}
			iu.mostraString("O total das compras: \n \n " + listaTotalCompras);
		}
}

