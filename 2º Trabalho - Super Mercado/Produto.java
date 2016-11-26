
public class Produto {
	

	private String nome;
	private String marca;
	private String tipo;
	private double preço;

	public Produto() {
		super();
	}

	public Produto(String nome, String marca, String tipo, double preço) {
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.preço = preço;
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

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", tipo=" + tipo + ", preço=" + preço + "]";
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
