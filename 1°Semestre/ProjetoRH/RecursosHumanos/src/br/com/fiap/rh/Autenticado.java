package br.com.fiap.rh;

public interface Autenticado{

	public boolean autenticavel(String senha);

	boolean autenticar(String senha);

}
