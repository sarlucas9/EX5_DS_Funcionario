package exercicio5;

public class Pessoa {
	
	String nome;
	String sobrenome;
	int anoDeNascimento;
	
	 public double calcularIdade(double anoAtual){
		return anoAtual-anoDeNascimento;
	}
	
	String mostrarNomeCompleto(){
		return this.nome+this.sobrenome;
	}
	
	

}
