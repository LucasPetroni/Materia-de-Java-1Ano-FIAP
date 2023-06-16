package br.com.fiap.rh;

public final class Presidente extends Funcionario implements Autenticado {

    private double valorDaCotaDeAcoes;
    private String senha;
    
  
    @Override
    public double calcularSalario() {
    	return super.calcularSalario() + (valorDaCotaDeAcoes * 0.01);
    }

	public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
		this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha.equals(senha);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticavel(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
    
    
}