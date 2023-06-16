package br.com.fiap.Futebol;

public class Goleiro extends Jogador {

	private int defesasRealizadas;
	public String tipo = "Goleiro";
	private String acao = "defendendo";

	public Goleiro(String nome, int camisa, double altura, int defesasRealizadas) {
		super(nome, camisa, altura);
		this.defesasRealizadas = defesasRealizadas;
		
	}

	@Override
	public String Agir() {
		return super.Agir(tipo, acao);
	}

}
