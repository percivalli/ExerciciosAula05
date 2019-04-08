package br.com.digitalhouse;

public class Conta {
    //Atributos
    private Integer numeroConta;
    private Double saldo;
    private Cliente titular;

    //Métodos construtores
    public Conta(){

    }

    public Conta(Integer numeroConta, Double saldo, Cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Set e Get
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void Double(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //Métodos da Classe
    public void deposito(Double quantiaDinheiro) {
        saldo += quantiaDinheiro;
        System.out.println("Depostio realizado com sucesso.\nNovo Saldo: " + saldo);
    }

    public void saque(Double quantiaDinheiro) {
        if (saldo < quantiaDinheiro) {
            System.out.println("Saldo insuficiente. \nSaldo atual:" + saldo);
        } else {
            saldo -= quantiaDinheiro;
            System.out.println("Saque realizado com sucesso.\nNovo saldo: " + saldo);
        }
    }
}