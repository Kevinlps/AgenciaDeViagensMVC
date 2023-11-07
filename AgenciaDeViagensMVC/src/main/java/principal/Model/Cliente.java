package principal.Model;

public class Cliente {
	private int id_clientes; 
	private String nome;
	private String Endereco; 
	private String Cpf;
	private int idade;
	private String Email;

	
	
	public Cliente( String nome, String endereco, String cpf, int idade, String email) {
		super();
		this.id_clientes = id_clientes;
		this.nome = nome;
		Endereco = endereco;
		Cpf = cpf;
		this.idade = idade;
		Email = email;
	}

	public Cliente() {
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId_clientes() {
		return id_clientes;
	}

	public void setId_clientes(int id_clientes) {
		this.id_clientes = id_clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}


}
