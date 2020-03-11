package Contas;

import Pessoas.Pessoa;

public class ContaEspecial extends Conta{
    
    private int limite;
    
    public ContaEspecial(int numero, float saldo, Pessoa correntista, int limite){
        super(numero, saldo, correntista);
        this.setLimite(limite);
    }
    
    public void debitar (float valor){
        if((saldo+limite)<valor){
            System.out.println("Saldo insuficiente");
        }else{
            saldo-=valor;
        }
    }
    
    public void setLimite(int limite){
        this.limite=limite;
    }
    
    public int getLimite(){
        return limite;
    }
}
