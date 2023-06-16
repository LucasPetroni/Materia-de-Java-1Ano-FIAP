package br.com.fiap.Escritorio;

public class Administrativas extends Tarefas {

	private String responsavel;
	private String meutipo = "Aministratipo";

	public Administrativas(String nome, String descricao, String dataIncio, String dataFim, String responsavel) {
		super(nome, descricao, dataIncio, dataFim);
		setTipo(meutipo);
		this.responsavel = responsavel;
	}

	@Override
	public String getDados() {

		return super.getDados() + "\nResponsavel: " + responsavel;

	}

}
