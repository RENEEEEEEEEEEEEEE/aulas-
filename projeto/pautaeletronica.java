package projeto;

public class pautaeletronica {
	
	
//	public static void consultaMedia(double[] medias, int aluno){
//	    System.out.print("Media do aluno: " + medias[aluno]);
//	  
//
//
//	for (double media : medias) {
//	      System.out.println("Media: " + media);
//	}
//	consultaMedia(medias, 1);

	import java.util.Scanner;

	class Main {
	  public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);

	    double maior_media = -1;
	    double menor_media = -1;
	    double media_turma = 0;
	    
	    System.out.print("Digite a quantidade de alunos: ");
	    int alunos = teclado.nextInt();
	   
	    double[] medias = new double[alunos];
	    
	    for (int n = 0; n < alunos; n++) {
	      System.out.print("Insira o nome do aluno: ");
	 	  aluno.setNome("1");
	      System.out.print("Digite a N1: ");
	      double nota1 = teclado.nextDouble();
	      System.out.print("Digite a N2: ");
	      double nota2 = teclado.nextDouble();
	      System.out.print("Digite a N3: ");
	      double nota3 = teclado.nextDouble();
	      double media = (nota1+nota2+nota3)/3;
	      medias[n] = media;
	      if (maior_media == -1 || maior_media < media) {
	        maior_media = media;
	      }
	      if (menor_media == -1 || menor_media > media) {
	        menor_media = media;
	      }
	      media_turma += media;
	      System.out.println("Media: " + media);
//	      if (media >= 6) {
//	        if (media >= 9){
//	          System.out.println("Excelente, aluno aprovado.");
//	        } else {
//	          System.out.println("Aluno aprovado.");
//	        }
//	      }  else if (media >= 4){
//	      System.out.println("Aluno em recuperacao, fazer N3.");
//	      } else {
//	      System.out.println("Aluno reprovado.");
//	      }
	    }

	    System.out.println("Maior media: " + maior_media);
	    System.out.println("Menor media: " + menor_media);
	    System.out.println("Media turma: " + media_turma/alunos);

	    for (double media : medias) {
	      System.out.println("Media: " + media);
	    }
	  }
	}



}


