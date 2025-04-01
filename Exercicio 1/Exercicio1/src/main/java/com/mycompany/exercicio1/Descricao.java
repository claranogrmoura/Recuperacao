/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author CLARA
 */
class Descricao extends Produto {
        double desconto; 
    
    public Descricao(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }
    
        
    public void exibirDetalhes(){
        double precoComDesconto = preco - desconto;
        System.out.println("NOME: " + nome);
        System.out.println("PRECO COM DESCONTO: R$ " + precoComDesconto);
        System.out.println("DESCONTO: R$ " + desconto);
    }
}
