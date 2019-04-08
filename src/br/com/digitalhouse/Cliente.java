package br.com.digitalhouse;

public class Cliente {
    //Atributos
    private String nome;
    private String sobrenome;
    //Métodos Construtores
    public Cliente(){

    }

    public Cliente(String nome, String sobrenome){
        nome = nome;
        sobrenome = sobrenome;
    }
    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}