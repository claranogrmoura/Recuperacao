/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author CLARA
 */
public class Funcionario {
    String nome; 
    int idade; 
    double salario; 
public Funcionario(String nome, int idade, double salario){
    this.nome = nome; 
    this.idade = idade; 
    this.salario = salario; 
}

public void Info(){
    System.out.println("NOME: " + nome);
    System.out.println("IDADE: " + idade);
    System.out.println("SALÁRIO: " +salario);
}


}

