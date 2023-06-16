package br.com.fiap.Jogo;

public abstract class Jogador extends Elemento {

	private String nome = "Anonimo";
	private int xp = 5;
	private int hp = 100;
	private boolean envenenado;

	public Jogador() {

	}

	public Jogador(String nome) {
		this.nome = nome;
	}

	public void receberDano(int pontos) {
		this.hp -= pontos;
		if (this.hp <= 0) {
			System.out.println("Game Over " + nome);
		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}

	public void receberAntídoto() {
		if (isEnvenenado())
			envenenado = false;

		envenenado = true;
	}

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.xp);

		if (jogador.foiDerrotado())
			this.ganharExperiencia(jogador.getXp());

	}

	private boolean foiDerrotado() {
		return hp == 0;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

}
