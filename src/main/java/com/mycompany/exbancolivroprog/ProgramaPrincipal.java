/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exbancolivroprog;

/**
 *
 * @author Jefferson
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//------------------ Exemplos de Prog.II Vol. 1 e 2
      
        //Criando endereços
        Endereco end1 = new Endereco("Vidal de Negreiros","21","São Sebastião","Pesqueira","Pernambuco","55200-000");
        Endereco end2 = new Endereco("Vidal de Negreiros","21","São Sebastião","Pesqueira","Pernambuco","55200-000");
        
        //Criando a pessoa e adicionando dados - inclusive os endereços
        Pessoa jefferson = new Pessoa("Jefferson Vasconcelos","999999999-00",'M', end1, end2);
        Pessoa andreia = new Pessoa("Andreia","111111111-00",'F', end2);
        
        //Criando uma conta e atribuindo um proprietário para ela
        Conta contaJefferson = new Conta(1,500,jefferson);
        contaJefferson.debitar(100);
        contaJefferson.creditar(70);        
        Conta contaAndreia = new Conta(2,andreia);
        
        //Apresentando os dados de uma pessoa
//        System.out.println("Nome do Correntista da conta: "+contaJefferson.getNumero());
//        System.out.println(contaJefferson.getCorrentista().getNome());
//        System.out.println("A rua do correntista da conta: "+contaJefferson.getNumero());
//        System.out.println(contaJefferson.getCorrentista().getEndResidencial().getRua());
//        System.out.println("----------------------------------");
        contaJefferson.apresentarDados();        
        contaAndreia.apresentarDados();       
    }
    
}
