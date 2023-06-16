package br.com.fiap.Escritorio;

public class Projetos extends Tarefas {

	private String equipeResponsavel;
	private int estimativaDeHoras;
	private String meutipo = "Projetos";

	public Projetos(String nome, String descricao, String dataIncio, String dataFim, String equipeResponsavel,
			int estimativaDeHoras) {
		super(nome, descricao, dataIncio, dataFim);
		this.setTipo(meutipo);
		this.equipeResponsavel = equipeResponsavel;
		this.estimativaDeHoras = estimativaDeHoras;
	}

	@Override
	public String getDados() {

		return super.getDados() + "\nEquipe responsavel: " + equipeResponsavel
				+ "\nEstimativas de horas para conclusao: " + estimativaDeHoras + " horas";

	}

}
