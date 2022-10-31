package projeto2prova;

public class Poupanca extends Conta {

	public Poupanca(Double saldo) {
		super(saldo);
	}

	public void atualizarSaldo(double taxa) {
		super.atualizarSaldo(taxa*3);
	}
}
