package br.com.fiap.Welcome;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Informe seu nome: ");

		String nome = sc1.nextLine();
		
		System.out.println("Informe sua idade: ");
		
		int idade = sc1.nextInt();

		System.out.println("Informe agora seu email: ");
		String email = sc2.nextLine();

		System.out.println("\n---------------------------------------------");
		System.out.println("Nome: " + nome + "\nEmail: " + email + "\nIdade: " + idade);
		System.out.println("---------------------------------------------");
	}
}