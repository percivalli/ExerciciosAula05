package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1000, "Danilo", "Percivalli", 10.0 ")


    }

    public static void deposito(Cliente cliente1) {

        int vDeposito;
        int saldo;

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        cliente1.setSaldo(valor);

        System.out.println("Digite o valor do depósito...");
        vDeposito = scanner.nextInt();

        cliente1.setSaldo() += cliente1.setSaldo(vDeposito);

        System.out.println("Seu novo saldo é " + cliente1.getSaldo());


    }
}


