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
      
        //Criando um endereço
        Endereco endRes = new Endereco("Vidal de Negreiros","21","São Sebastião","Pesqueira","Pernambuco","55200-000");
        
        //Criando a pessoa e adicionando dados - inclusive os endereços (obs: o residencial foi incluído nos 2)
        Pessoa jefferson = new Pessoa("Jefferson Vasconcelos","999.888.777-00",'M', endRes, endRes);
        
        //Criando uma conta e atribuindo um proprietário para ela
        Conta contaJefferson = new Conta(1,500,jefferson);
        contaJefferson.debitar(100);
        contaJefferson.creditar(70);
        
        System.out.println("Nome do Correntista da conta: "+contaJefferson.numero);
        System.out.println(contaJefferson.correntista.nome);
        System.out.println("A rua do correntista da conta: "+contaJefferson.numero);
        System.out.println(contaJefferson.correntista.endResidencial.rua);
        System.out.println("----------------------------------");
        contaJefferson.apresentarDados();        
              
    }
    
}
