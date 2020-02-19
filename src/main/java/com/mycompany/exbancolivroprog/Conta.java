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
public class Conta {
    private int numero;
    private float saldo;
    private Pessoa correntista;
    
    Conta(int numero, float saldo, Pessoa correntista){
        this.numero = numero;
        this.saldo=saldo;
        this.correntista=correntista;
    }
    
//    public float getSaldo() {
//	return this.saldo;
//    }
    
    void debitar(float valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente!");
        }else{
            saldo -= valor;
        }
    }
    void creditar(float valor){
        saldo += valor;
    }
    
    void apresentarDados(){
        System.out.println("Conta nº: "+numero+", Saldo: "+saldo+", Correntista: "+correntista.apresentar());
    }
}
