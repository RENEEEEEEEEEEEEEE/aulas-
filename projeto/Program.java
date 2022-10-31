package projeto;

import java.util.Scanner;

public class Program {
	
//	public static void consultaMedia(double[] medias, int aluno){
//	    System.out.print("Media do aluno: " + medias[aluno]);
//	  } 

	
	static Scanner teclado = new Scanner(System.in);
	int alunos = teclado.nextInt();
	public static void main(String[] args) {
		System.out.println("1 - Inserir aluno");
		System.out.println("2 - Pesquisar aluno por nome");
		System.out.println("3 - Inserir notas");
		System.out.println("4 - Excluir aluno");
		System.out.println("5 - Relatório de alunos" );
		System.out.println("6 - Informação da disciplina");
		System.out.println("7 - Inserir aluno");
		int x = teclado.nextInt();
		
		
		switch (x) {
	
		case 1:			
			System.out.println("Insira o nome do aluno: ");
			aluno.getNome();
				break;
				
		case 2:
			break;
			
		case 3:
			Scanner teclado = new Scanner(System.in); 
			 System.out.print("Digite a Nota 1: ");
			 double nota1 = teclado.nextDouble();
			 System.out.print("Digite a Nota 2: ");
			 double nota2 = teclado.nextDouble();
			 System.out.print("Digite a Nota 3: ");
			 double nota3 = teclado.nextDouble();
			break;
			
		case 4:
			break;
			
		case 5:

			break;
			
		case 6:
			break;
			
		case 7:
			break;
		
	}
}
}
