package Encaspsulamento;

public class Endereco {
	private int id;
	private String  logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;

	
	//Construtor para iniciar o saldo
	//Construtor
		public Endereco(String logradouro, int id,int numero,String cidade,String bairro,String cep,String uf,String complemento) {
			this.logradouro=logradouro;
			this.cidade=cidade;
			this.bairro=bairro;
			this.cep=cep;
			this.complemento=complemento;
			this.uf=uf;
			setId(id);
			setNumero(numero);
		}
	
	//getter para o saldo
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro=logradouro;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero=numero;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento=complemento;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro=bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade=cidade;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep=cep;
			
		}public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf=uf;
		}
	}


