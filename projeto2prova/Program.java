package projeto2prova;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c = new Corrente(500.0);
	    //c.atualizarSaldo(1000.0);
		System.out.println("1 - Depositar");
	    System.out.println("2 - Sacar");
	    System.out.println("Qual operação abaixo deseja realizar: ");
	    int x = sc.nextInt();
	    switch (x) {
	    case 1:
	    System.out.println("Digite o valor que queira depositar: ");
	    double saldo = sc.nextDouble();
	    c.depositar(saldo);
	    System.out.print("Saldo disponivel é de: R$ "); 
	    System.out.print(c.getSaldo()); 
	    System.out.print(" apos deposito."); 
	    break;
	    case 2:
	    System.out.println("Digite o valor que queira sacar: ");
		double sacar = sc.nextDouble();
		c.sacar(sacar);
		System.out.print("Saldo disponivel é de: R$ "); 
		System.out.print(c.getSaldo());
		System.out.print(" após saque.");
		break;
	    default:
	    System.out.println("Selecione uma opção Valida!!!"); }
	  }
	}

