public class Cliente {
	private Produto[] produtos;
	private String nome;

	public Cliente() {
		super();

	}

	public Cliente(String n, int i) {
	
		nome = n;
		produtos = new Produto[i];

	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int compareTo(String anotherString) {
		return nome.compareTo(anotherString);
	}

	public boolean equals(Object anObject) {
		return nome.equals(anObject);
	}

	public String toString() {
		return nome.toString();
	}



	}
	
