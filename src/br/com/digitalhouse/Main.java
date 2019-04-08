package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Danilo");
        cliente1.setSobrenome("Percivalli");
        cliente2.setNome("Lohraine");
        cliente2.setSobrenome("Maia");

    }

    public static Integer deposito(Cliente cliente1) {

        float valor = 1000;

        private static void depositar () {//exige do usuário valores para deposito
            float Vdeposito;

            Scanner tec = new Scanner(System.in);

            System.out.print("Digite um valor para depósito : ");
            Vdeposito = tec.nextInt();

            valor += Vdeposito;

            System.out.println("Seu novo saldo é " + valor);

        }
    }

}
