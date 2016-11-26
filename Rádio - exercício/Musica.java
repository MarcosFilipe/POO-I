
public class Musica {

	private String nome;
	private String autor;
	private String tipo;
	private float tamanho;
	
		
	public Musica() {
		super();
	}

	public Musica(String nome, String autor, String tipo, float tamanho) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
