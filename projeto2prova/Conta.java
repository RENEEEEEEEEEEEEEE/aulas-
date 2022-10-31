package projeto2prova;

public class Conta {

	  private double saldo;

	  public Conta(double saldo) {
	    this.saldo = saldo;
	  }	  
	public void depositar(double valorDeposito) {
	    this.saldo = this.saldo + valorDeposito;
	  }
	  public void sacar(double valorSaque) {
	    this.saldo = this.saldo - valorSaque;
	  }
	  public void atualizarSaldo(double taxa) {
	    this.saldo = this.saldo * taxa;
	  } 
	  public double getSaldo() {
	    return this.saldo;
	  }
	}
