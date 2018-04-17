/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author wwthi
 */
public class Pessoa {

    public String nome;
    public int idade;
    public String endereço;
    private static double altura;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, int idade, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }
    
    public Pessoa(int idade) {
        super();
        this.idade = idade;
    }
    
    private Pessoa(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        System.out.println("Idade da PESSOA: " + idade);
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
