package MainPackage;

class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	boolean deposita(double quantidade) {
		this.saldo += quantidade;
	}
}
