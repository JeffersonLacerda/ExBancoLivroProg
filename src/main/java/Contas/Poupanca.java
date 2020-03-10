package Contas;

import Pessoas.Pessoa; 

public class Poupanca extends Conta{
    
    public static final float TAXA_JUROS=10.0F;
    private int diaAniversario;
    
    public Poupanca(int numero, float saldo, Pessoa correntista, int diaAniversario){
        super(numero, saldo, correntista);
        this.diaAniversario = diaAniversario;
    }
    
    public int getDiaAniversario(){
        return diaAniversario;
    }
    
    public void setDiaAniversario (int diaAniversario){
        this.diaAniversario = diaAniversario;
    }
    
    public void renderJuros(){
        this.saldo += (this.saldo*TAXA_JUROS)/100;
    }
}
