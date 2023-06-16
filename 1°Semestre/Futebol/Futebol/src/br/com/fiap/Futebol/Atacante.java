package br.com.fiap.Futebol;

public class Atacante extends Jogador {

	private int golsMarcados;
	public String tipo = "Atacante";
	private String acao = "chutando";

	public Atacante(String nome, int camisa, double altura, int golsMarcados) {
		super(nome, camisa, altura);
		this.golsMarcados = golsMarcados;
		
	}

	@Override
	public String Agir() {
		return super.Agir(tipo, acao);
	}

}
