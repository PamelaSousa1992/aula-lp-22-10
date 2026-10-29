package Aula_22_10;

public class ConstrutorPessoa2 {

	public static void main(String[] args) {
		
		Pessoa2 jogador1 = new Pessoa2("Ronaldo", 50);
		Pessoa2 jogador2 = new Pessoa2("Messi", 36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
		jogador1.setNome("Ronaldo");
		jogador1.setIdade(50);

	}

}
