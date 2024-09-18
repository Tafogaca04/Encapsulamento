package Encaspsulamento;

public class ObjCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cliente cliente = new Cliente ("Daniel",188,"(11)99681-5345","326789954","29754648-76");
		
		System.out.println("-------- CLIENTE---------");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getId());
			System.out.println(cliente.getTelefone());
		System.out.println("-------- CPF---------");
		System.out.println(cliente.getCpf());
		System.out.println("-------- RG---------");
		System.out.println(cliente.getRg());


		
	
	}

}
