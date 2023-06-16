package br.com.fiap.Banco;

public class Poupanca extends Conta {
    
    private double taxa;

    public Poupanca(String numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) throws PoupancaException {
        throw new PoupancaException("Nao e possivel realizar saque em uma conta poupanca."); 
    }

    public double getTaxa() {
        return taxa;
    }



}