package MainPackage;

public class Programa {
	
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Warley";
		minhaConta.saldo = 4999.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo);

	}
}
