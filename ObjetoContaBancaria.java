package Encaspsulamento;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta = new ContaBancaria (100000.00);
		
		// saldo inicial 
		System.out.println(conta.getSaldo());
		
		// Depósitos 
		conta.depositar (500); conta.depositar (1000);
		
		// mostrar saldo após 2 depósitos
		System.out.println(conta.getSaldo());
		
		// Saque
		conta.sacar (1500);
		
		// mostrar após saque 
		System.out.println(conta.getSaldo());
	}

}
