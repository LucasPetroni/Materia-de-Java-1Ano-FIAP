package br.com.fiap.Escritorio;

public class Reunioes extends Tarefas {
	
	private String listaDeParticipantes;
	private String meutipo = "Reunioes";

	public Reunioes(String nome, String descricao, String dataIncio, String dataFim, String listaDeParticipantes) {
		super(nome, descricao, dataIncio, dataFim);
		setTipo(meutipo);
		this.listaDeParticipantes = listaDeParticipantes;
	}
	
	@Override
	public String getDados() {

		return super.getDados() + "\nLista de Participantes: " + listaDeParticipantes;

	}
}
