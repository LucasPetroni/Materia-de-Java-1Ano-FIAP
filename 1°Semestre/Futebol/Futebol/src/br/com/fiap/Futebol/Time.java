package br.com.fiap.Futebol;

public class Time{
		
	private String nome;
	
	
	
	public Time(String nome) {
		super();
		this.nome = nome;
		
	}

	Goleiro jogador1 = new Goleiro("Cassio", 1, 1.92, 5);
	Zagueiro jogador2 = new Zagueiro("Alessandro", 2, 1.65, 2);
	Zagueiro jogador3 = new Zagueiro("Chicao", 3, 1.85, 7);
	Zagueiro jogador4 = new Zagueiro("Paulo Andre", 4, 1.82, 2);
	Zagueiro jogador5 = new Zagueiro("Fabio Santos", 6, 1.75, 5);
	Atacante jogador6 = new Atacante("Ralf", 5, 1.85, 1);
	Atacante jogador7 = new Atacante("Paulinho", 8, 1.80, 3);
	Atacante jogador8 = new Atacante("Danilo", 10, 1.78, 4);
	Atacante jogador9 = new Atacante("Jorge Henrique", 7, 1.70, 2);
	Atacante jogador10 = new Atacante("Emerson Sheik", 11, 1.71, 9);
	Atacante jogador11 = new Atacante("Guerreiro", 9, 1.78, 15);
	
	public void Jogar() {
		
		System.out.println(jogador1.Agir());
		System.out.println(jogador2.Agir());
		System.out.println(jogador3.Agir());
		System.out.println(jogador4.Agir());
		System.out.println(jogador5.Agir());
		System.out.println(jogador6.Agir());
		System.out.println(jogador7.Agir());
		System.out.println(jogador8.Agir());
		System.out.println(jogador9.Agir());
		System.out.println(jogador10.Agir());
		System.out.println(jogador11.Agir());

	}
	
}
