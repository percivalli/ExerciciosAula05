package br.com.digitalhouse;

public class Conta {
    public Integer numeroDaConta;
    private Integer saldo;
    private Conta titular;

    public Integer getSaldo() {
        return saldo;
    }

    public Conta getTitular() {
        return titular;
    }

    public void setSaldo(Integer saldo) {
        saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        titular = titular;
    }

}
