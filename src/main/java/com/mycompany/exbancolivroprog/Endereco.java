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
public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
    Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep){
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.cep=cep;
    }      
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    String apresentar(){
        return "Rua: "+getRua()+", "+getNumero()+", "+getBairro()+", "+getCidade()+", "+getEstado()+", CEP: "+getCep();
    }

}
