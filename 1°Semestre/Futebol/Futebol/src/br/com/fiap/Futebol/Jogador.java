package br.com.fiap.Futebol;

public class Jogador {

	private String nome;
	private int camisa;
	private double altura;

	public Jogador(String nome, int camisa, double altura) {
		super();
		this.nome = nome;
		this.camisa = camisa;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String Agir() {
		return "Jogador " + nome + " esta agindo";
	}

	public String Agir(String tipo, String acao) {
		return tipo + " " + nome + " esta " + acao;
	}
}
