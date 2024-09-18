package Encaspsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tema tema1 = new Tema ("Alice", 122098,5000.00,"azul");
		
		System.out.println("--------TEMA---------");
		System.out.println(tema1.getNome());
		System.out.println(tema1.getId());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.CorToalha());
	
	}

}
