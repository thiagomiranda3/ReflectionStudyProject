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
public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }
    
    public Cliente(int idade) {
        super(idade);
    }

    @Override
    public int getIdade() {
        System.out.println("Idade do CLIENTE: " + idade);
        return idade;
    }
}
