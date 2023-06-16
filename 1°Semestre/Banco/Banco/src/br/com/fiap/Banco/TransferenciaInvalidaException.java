package br.com.fiap.Banco;

public class TransferenciaInvalidaException extends RuntimeException{
    
    public TransferenciaInvalidaException(String message) {
        super(message);
    }
}