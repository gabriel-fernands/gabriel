package br.com.alura.domein;

public class Pet {

    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor ;
    private Float peso;

    public Pet(String tipo, String nome, String raca, int idade, String cor, float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

}
