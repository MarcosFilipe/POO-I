
public class Produto {
	

	private String nome;
	private String marca;
	private String tipo;
	private double pre�o;

	public Produto() {
		super();
	}

	public Produto(String nome, String marca, String tipo, double pre�o) {
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.pre�o = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", tipo=" + tipo + ", pre�o=" + pre�o + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public int compareTo(String anotherString) {
		return marca.compareTo(anotherString);
	}
	
	

}
