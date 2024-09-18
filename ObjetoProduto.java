package Encaspsulamento;

public class ObjetoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Produto prod = new Produto("Queijo prato",50.00);
 
 //Mostrar valores iniciais
 System.out.println(prod.getNome()+ " " + prod.getPreco());
 
 prod.setPreco(53);
 System.out.println(prod.getPreco());
  
 prod.setPreco(56);
 System.out.println(prod.getPreco());
 
 prod.setNome("Queijo Parmesão");
 prod.setPreco(80);
 System.out.println(prod.getNome());
 System.out.println(prod.getPreco());
 
 
 
	}

}
