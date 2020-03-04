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
    
    private static int contadorContas;
    
    public static int getNumeroContas(){
        return contadorContas;
    }
    
    public Conta(int numero, float saldo, Pessoa correntista){
        this.numero = numero;
        this.saldo=saldo;
        this.correntista=correntista;
    }
    
        public Conta(int numero, Pessoa correntista){
        this.numero = numero;
        this.saldo=0.0F;
        this.correntista=correntista;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public Pessoa getCorrentista() {
        return this.correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }
    
    void debitar(float valor){
        if(getSaldo() < valor){
            System.out.println("Saldo insuficiente!");
        }else{  //OBS: não está assim no livro
            saldo-=valor;
        }
    }
    void creditar(float valor){
        saldo+=valor;
    }
    
    void apresentarDados(){
        System.out.println("Conta nº: "+getNumero()+", Saldo: "+getSaldo()+", Correntista: "+getCorrentista().apresentar());
    }
}
