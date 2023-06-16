package br.com.fiap.Banco;

public class SaqueMaiorQueSaldoException extends RuntimeException{
    
    public SaqueMaiorQueSaldoException(String message) {
        super(message);
    }
}
