/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author CLARA
 */
class Produto {
       String nome;
    double preco; 
    
    public Produto(String nome, double preco){
        this.nome = nome; 
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("NOME: " + nome);
        System.out.println("PRECO: R$ " + preco);
    }
}
