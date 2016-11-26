
public class MusicaInstrumental extends Musica {
	
	private String instrumento;

	public MusicaInstrumental(String nome, String autor, String tipo,
			float tamanho, String instrumento) {
		super(nome, autor, tipo, tamanho);
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

	

	

	

	

	
}
