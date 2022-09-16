package lambdas;

//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
	
}
