
public class Controle {
public static void main(String[] args) {
		
	Radio r;
	
	r = new Radio();
	
	interU iu;
	
	iu = new interU();
	
	//array para setar array musicas tocadas da classe radio;
	Musica[] musicas = new Musica[7];
	
	
	//-------------------------------lista de musicas-------------------------------------------------
	Musica rock = new Musica("incondicional", "oficina g3", "rock", 7);
	MusicaInstrumental rock2 = new MusicaInstrumental("teto de vidro", "pitty", "rock", 3, "guitarra");
	Musica sertanejo = new Musica("1992", "tiago servo", "sertanejo", 4);
	Musica reggae = new Musica("oh menina", "marcos filipe", "reggae", 8);
	MusicaInstrumental pop = new MusicaInstrumental("amiga", "marcos filipe", "pop", 5, "violao");
	//-------------------------------------------------------------------------------------------------
	
	musicas[0] = rock;
	musicas[1] = rock2;
	musicas[2] = sertanejo;
	musicas[3] = reggae;
	musicas[4] = pop;
	
	r.setMusicasTocadas(musicas);
	
	int opcaoSelecionada = 0;

	//---------------------------------------------------------------------------------------------------
	while(opcaoSelecionada != 5){
		 opcaoSelecionada = iu.pegaInt("insira o numero correspondente a opcao desejada; \n \n "
			+ "1- Pesquisar musicas de um autor \n"
			+ "2- Tocar uma musica da lista \n"
			+ "3- quantidade de musicas de um certo genero \n"
			+ "4- pesquisar se a musica é instrumental \n"
			+ "5- sair");
		if(opcaoSelecionada == 1)
		r.musicasMesmoAutor(iu.pegaString(" insira um nome de um autor para saber quais musicas são dele: \n \n "
			+ "oficina g3 \n pitty \n tiago servo \n marcos filipe \n "
			));
		else
			if(opcaoSelecionada == 2)
		r.tocaMusica(iu.pegaInt("insira o numero correspondente a posição da musica que deseja tocar \n \n"
				+ "0- incondicional \n"
				+ "1- teto de vidro \n"
				+ "2- 1992 \n "
				+ "3- oh menina \n "
				+ "4- amiga \n"));
			else
				if(opcaoSelecionada == 3)
					r.retornaNumeroMusicasTipoX(iu.pegaString("insira o genero para saber quantas musicas são deste tipo: \n \n "
							+ "reggae \n rock \n pop \n sertanejo"));
				else 
					if(opcaoSelecionada == 4)
						r.musicalInstrumental(iu.pegaInt("insira o numero da musica para verificar se é instrumental \n \n"
								+ "0- incondicional \n"
								+ "1- teto de vidro \n"
								+ "2- 1992 \n "
								+ "3- oh menina \n "
								+ "4- amiga \n"));
	}
	//-----------------------------------------------------------------------------------------------------
}
}

