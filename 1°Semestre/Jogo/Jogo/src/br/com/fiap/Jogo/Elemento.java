package br.com.fiap.Jogo;

public abstract class Elemento implements IElementoVisual {

	private int x;
	private int y;

	public void mover(int x, int y) {
		var atualX = getX();
		var atualY = getY();

		this.setX(atualX += x);
		this.setY(atualY += y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
