package Encaspsulamento;

public class Tema {
	private int id;
	private String  nome;
	private double ValorAluguel;
	private String corToalha;

 
	public Tema(String nome, int id,double valorAluguel,String corToalha) {
		this.id=id;
		this.nome=nome;
		this.ValorAluguel=valorAluguel;
		this.corToalha=corToalha;
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
	public double getValorAluguel() {
		return ValorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.ValorAluguel=valorAluguel;
	}
	public String CorToalha() {
		return corToalha;
	}
	public void setCorToalha(String corToalha) {
		this.corToalha=corToalha;
	}
}
