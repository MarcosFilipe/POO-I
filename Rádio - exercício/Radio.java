
public class Radio {

	private Musica[] musicasTocadas = new Musica[7];
	
	public Radio(Musica[] musicasTocadas) {
		this.musicasTocadas = musicasTocadas;
	}

	public Radio() {
		super();
	}

	public Musica[] getMusicasTocadas() {
		return musicasTocadas;
	}

	public void setMusicasTocadas(Musica[] musicasTocadas) {
		this.musicasTocadas = musicasTocadas;
	}
	
	interU iu = new interU();
	//--------------------------------------------------------------------------------------------
	public Musica[] musicasMesmoAutor(String autor){
		
		Musica[] musicaMesmoAutor = new Musica [7];
		int j=0;
		
		for (int i = 0; i < musicaMesmoAutor.length; i++) {
			if(musicasTocadas[i] != null)
				if(musicasTocadas[i].getAutor().equals(autor)){
					musicaMesmoAutor[j] = musicasTocadas[i];
					j++;
				}
		}
		String musicasMsmAut = " ";
		for (int i = 0; i < musicaMesmoAutor.length; i++) {
			if(musicaMesmoAutor[i] != null)
				musicasMsmAut += musicaMesmoAutor[i].getNome() + "\n";
		}
		iu.mostraString(musicasMsmAut);
		return musicaMesmoAutor;
	}
	//---------------------------------------------------------------------------------------------
	public String tocaMusica(int i){
		if(musicasTocadas[i] != null && i < 7)
			if(musicasTocadas[i].getTipo().equals("rock"))
				 iu.mostraString("tocando agora: \n " + musicasTocadas[i].getNome());
			else 
				iu.mostraString("oops, não podemos tocar essa musica agora.\n apenas rocks podem ser tocados nessa programacao");
		return null;
		
	}
	//----------------------------------------------------------------------------------------------
	
	public int retornaNumeroMusicasTipoX(String tipoX){
		int numerosMusicasTipoX = 0;
		for (int j = 0; j < musicasTocadas.length; j++) {
			if(musicasTocadas[j] != null)
				if(musicasTocadas[j].getTipo().equals(tipoX))
					numerosMusicasTipoX ++;
		}
		if(numerosMusicasTipoX == 1)
			iu.mostraString("1");
		else
			if(numerosMusicasTipoX == 2)
				iu.mostraString("2");
		return numerosMusicasTipoX;
	}
	//----------------------------------------------------------------------------------------------
	
	public boolean musicalInstrumental(int i){
		if(musicasTocadas[i] != null && i < 7)
			if(musicasTocadas[i].getNome().equals("amiga")||musicasTocadas[i].getNome().equals("teto de vidro"))
				iu.mostraString("verdadeiro. A musica da posicao selecionada e instrumental");
			else 
				iu.mostraString("falso. a musica da posicao selecionada nao e instrumental");
		return false;
	}
	//----------------------------------------------------------------------------------------------

	@Override
	public String toString() {
		return super.toString();
	}
}
