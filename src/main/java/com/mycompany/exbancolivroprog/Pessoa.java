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
public class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;
    private Endereco endResidencial;
    private Endereco endComercial;
    
    public Pessoa(String nome, String cpf, char sexo, Endereco endRes, Endereco endCom){
        this.nome =nome;
        this.cpf = cpf;
        this.sexo=sexo;
        endResidencial=endRes;
        endComercial=endCom;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndResidencial() {
        return endResidencial;
    }

    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }

    public Endereco getEndComercial() {
        return endComercial;
    }

    public void setEndComercial(Endereco endComercial) {
        this.endComercial = endComercial;
    }
    
    String apresentar(){
        String retorno ="";
        retorno=retorno+
                "Nome: "+getNome()+
                ", CPF: "+getCpf()+
                ", Sexo: "+getSexo()+
                ", End. Res.: "+getEndResidencial().apresentar();
        
        return retorno;
    }
    
}
