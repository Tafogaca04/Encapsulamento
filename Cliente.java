package Encaspsulamento;

public class Cliente {
	private int id;
	private String telefone;
	private String cpf;
	private String rg;
	private String  nome;


 
	public Cliente(String nome, int id,String telefone,String cpf,String rg) {
		this.nome=nome;
		this.id=id;
		this.telefone=telefone;
		this.cpf=cpf;
		this.rg=rg;


	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg=rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf=cpf;
}
}
