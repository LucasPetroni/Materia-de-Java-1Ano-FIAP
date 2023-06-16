package br.com.fiap.Futebol;

public class Zagueiro extends Jogador {

	private int desarmesFeitos;
	public String tipo = "Zagueiro";
	private String acao = "marcando";

	public Zagueiro(String nome, int camisa, double altura, int desarmesFeitos) {
		super(nome, camisa, altura);
		this.desarmesFeitos = desarmesFeitos;
	}

	@Override
	public String Agir() {
		return super.Agir(tipo, acao);
	}

}
