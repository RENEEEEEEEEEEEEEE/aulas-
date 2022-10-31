package projeto;

public class aluno {
	
	public String aluno;
	private static String nome;
	public double nota1,nota2,nota3,media;
	
	public double calcularMedia () {
	    return (nota1+nota2+nota3)/3;
	  }
	 
	public String getSituacao(){
		 double media = this.calcularMedia(); 
		 
		 if (media>=6) {
				return "Aluno aprovado.";
				} 
			else if (media<6 && media>=4){
				return "Aluno em recuperacao, fazer N3.";
			}
			else {
				return "Aluno reprovado."; 
				   }
		
	 }

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		aluno.nome = nome;
	}
	}
