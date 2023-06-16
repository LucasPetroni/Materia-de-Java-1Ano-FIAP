package br.com.fiap.Escritorio;

public class App {

	public static void main(String[] args) {

		Administrativas administrativas = new Administrativas("Gestao de Documentos",
				"Fazer a gestao de documentos e arquivos", "18/03/2023", "14/04/2023", "Lucas Petroni");
		Projetos projetos = new Projetos("Desenvolvimento", "Desenvolvimento de um novo produto", "06/10/2023",
				"12/07/2024", "Lucas Petroni, Ana Paula", 40);
		Reunioes reunioes = new Reunioes("Andamento",
				"Reuniao de equipe para discutir o andamento de projetos e definir prioridades", "03/12/2023",
				"03/12/2023", "Lucas Petroni, Caio, Kauan, Nat, Cordeiro");

		System.out.println(administrativas.getDados());
		System.out.println(projetos.getDados());
		System.out.println(reunioes.getDados());
	}

}
