package br.com.fiap.Banco;

public class App {
	public static void main(String[] args) {

		Conta conta = new Conta("121212-5");
		Poupanca poupanca = new Poupanca("20202-5");

		try {
			conta.depositar(10000);
			conta.sacar(200);
			conta.transferencia(poupanca, 10000);
			poupanca.depositar(2000);
			poupanca.sacar(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
