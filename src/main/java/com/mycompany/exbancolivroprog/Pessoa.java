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
    String nome;
    String cpf;
    char sexo;
    Endereco endResidencial;
    Endereco endComercial;
    
    Pessoa(String nome, String cpf, char sexo, Endereco endRes, Endereco endCom){
        this.nome =nome;
        this.cpf = cpf;
        this.sexo=sexo;
        endResidencial=endRes;
        endComercial=endCom;
    }
        
    String apresentar(){
        String retorno ="";
        retorno=retorno+
                "Nome: "+nome+
                ", CPF: "+cpf+
                ", Sexo: "+sexo+
                ", End. Res.: "+endResidencial.apresentar();
        
        return retorno;
    }
}
