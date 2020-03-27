package exercicio5;

import exercicio5.Pessoa;

public class idadeEnomeDaPessoa {

	public static void main(String[] args) {
		
		//crio objeto Idade
		Pessoa Irineu = new Pessoa();
		Irineu.nome="Irineu";
		Irineu.anoDeNascimento=1965;
		Irineu.sobrenome=" Vocenumsabenemeu";
		
		
		
		System.out.println(Irineu.calcularIdade(2020));
		
		System.out.println(Irineu.mostrarNomeCompleto());
		
		

	}

}
