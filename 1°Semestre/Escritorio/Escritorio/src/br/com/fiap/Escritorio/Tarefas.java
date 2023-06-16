package br.com.fiap.Escritorio;

public class Tarefas {

	private String nome;
	private String descricao;
	private String dataIncio;
	private String dataFim;
	private String tipo;

	public Tarefas(String nome, String descricao, String dataIncio, String dataFim) {

		this.nome = nome;
		this.descricao = descricao;
		this.dataIncio = dataIncio;
		this.dataFim = dataFim;
	}

	public String getDados() {

		return String.format("\n[%s]\nNome: %s\nDescricao: %s\nData do Inicio: %s\nData do Fim: %s", tipo, nome,
				descricao, dataIncio, dataFim);

	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
