package br.com.fiap.Banco;

public class Conta {

	private String numero;
	private double saldo;
	private double taxa;

	public Conta(String numero) {
		this.numero = numero;
	}

	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0)
			throw new DepositoNegativoException("Nao e possivel depositar valores negativos ");
		saldo += valor;
	}

	public void sacar(double valor) throws SaqueMaiorQueSaldoException {
		if (valor > saldo)
			throw new SaqueMaiorQueSaldoException("Nao e possivel realizar o saque de: " + valor
					+ " pois o valor e maior que o saldo disponivel: " + saldo);
		saldo -= valor;
	}

	public void transferencia(Conta conta, double valor) throws TransferenciaInvalidaException {
		if (conta.getNumero() == numero)
			throw new TransferenciaInvalidaException(
					"Nao e possivel realizar uma transferencia para sua propria conta.");
		if (valor < 0)
			throw new TransferenciaInvalidaException("Nao e possivel realizar uma transferencia de valor negativo.");
		if (valor > saldo)
			throw new TransferenciaInvalidaException("Nao e possivel realizar essa transferencia pois o valor " + valor
					+ " e maior que o saldo disponivel: " + saldo);

		conta.setSaldo(conta.getSaldo() + valor);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxa() {
		return taxa;
	}
}
