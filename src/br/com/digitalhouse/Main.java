package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        //Instanciando
        Cliente danilo = new Cliente("Danilo", "Percivalli");
        Conta contaDanilo = new Conta(357951, 0.00, danilo);

       //Ações
        contaDanilo.deposito(8000.00);
        contaDanilo.saque(350.00);
        contaDanilo.saque( 9000.00);

    }
}
