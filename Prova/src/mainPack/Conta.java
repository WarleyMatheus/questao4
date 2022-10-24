package mainPack;

public class Conta {
	String numero;
	private double saldo;
	Cliente titular;
	
	boolean saca(double valor){
		if (valor > this.saldo) {
			System.out.println("Não é possível sacar um valor superior ao seu saldo");
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	/*void transfere(Conta destino, double valor) {
		this.saca(valor);
		if(this.saca return true) {
			destino.deposita(valor);
		}
		else {
			System.out.println("Não há saldo suficiente para realizar a transferência");
		}
		
	}*/
}
