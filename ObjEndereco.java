package Encaspsulamento;

public class ObjEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco endereco1 = new Endereco ("joãozinho", 10,98,"tatuí","vila nastri","1222-98","perto da praça","SP");
		
				System.out.println("--------ENDEREÇO---------");
				System.out.println(endereco1.getLogradouro());
				System.out.println(endereco1.getId());
				System.out.println(endereco1.getNumero());
				System.out.println(endereco1.getCidade());
				System.out.println(endereco1.getBairro());
				System.out.println(endereco1.getCep());
				System.out.println(endereco1.getComplemento());
				System.out.println(endereco1.getUf());


	}
}

