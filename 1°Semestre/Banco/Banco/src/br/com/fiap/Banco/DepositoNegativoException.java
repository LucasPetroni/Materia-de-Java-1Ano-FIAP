package br.com.fiap.Banco;

public class DepositoNegativoException extends RuntimeException{
    
    public DepositoNegativoException(String message) {
        super(message);
    }
}
