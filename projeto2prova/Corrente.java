package projeto2prova;

public class Corrente extends Conta {

	public Corrente(double saldo) {
		super(saldo);
	}
	public void atualizarSaldo(double taxa) {
		super.atualizarSaldo(taxa*2);
	}
	public void depositar(double valorDeposito) {
		super.depositar(valorDeposito - 0.10);
	}
  
}
