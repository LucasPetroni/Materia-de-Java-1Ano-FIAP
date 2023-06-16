package br.com.fiap.Jogo;

public class Jogo {

	public static void main(String[] args) {
		Fase fase1 = new Fase();
		Jogador player1 = new Mago("Caio", 10);
		Jogador player2 = new Guerreiro("Boris");
		BolaDeFogo bolaDeFogo = new BolaDeFogo();
		Dragao dg = new Dragao();

		fase1.carregar(player1);
		fase1.carregar(player2);
		fase1.carregar(bolaDeFogo);
		fase1.carregar(dg);

		player1.mover(0, 3);
		player2.mover(1, 0);
		bolaDeFogo.mover(1, 2);
		dg.mover(5, 0);
		
	}
}