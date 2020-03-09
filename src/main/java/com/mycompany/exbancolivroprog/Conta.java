package com.mycompany.exbancolivroprog;

/**
 * Classe que representa uma conta bancária
 * @author Jefferson
 */
public class Conta {
    protected int numero;
    protected float saldo;
    protected Pessoa correntista;  
    
    private static int contadorContas;
    
/** Método que retorna a quantidade de contas criadas
* @return número de contas criadas */
    public static int getNumeroContas(){
        return contadorContas;
    }
    
/** Construtor para criar um objeto do tipo conta
* @param numero Número da conta
* @param saldo Saldo inicial da conta
* @param correntista Correntista da conta */ 
    public Conta(int numero, float saldo, Pessoa correntista){
        this.numero = numero;
        this.saldo=saldo;
        this.correntista=correntista;
        contadorContas++;
    }
    
/** Construtor para criar um objeto do tipo conta com saldo inicial zero
* @param numero Número da conta
* @param correntista Correntista da conta */
    public Conta(int numero, Pessoa correntista){
        this(numero,0.0F,correntista);  //Chamando o construtor acima
    }

/** Método que retorna o número da conta
* @return número da conta*/
    public int getNumero() {
        return this.numero;
    }

/** Método que modifica o número da conta
* @param numero novo número da conta */
    public void setNumero(int numero) {
        this.numero = numero;
    }
/** Método que retorna o saldo de uma conta
* @return o saldo da conta*/
    public float getSaldo() {
        return this.saldo;
    }

/** Método que retorna o objeto que representa o correntista da conta
* @return correntista da conta*/
    public Pessoa getCorrentista() {
        return this.correntista;
    }

/** Método que modifica o correntista da conta
* @param correntista novo correntista da conta*/
    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

/** Método que diminui o valor do saldo de uma conta. O valor não pode ser maior que o saldo da conta.
* @param valor quantia a ser debitado da conta*/
    void debitar(float valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente!");
        }else{  //OBS: não está assim no livro
            saldo-=valor;
        }
    }
    
/** Método que credita um valor no saldo de uma conta.
* @param valor quantia a ser creditada na conta */    
    void creditar(float valor){
        saldo+=valor;
    }

//Método que apresenta os dados de uma conta   
    void apresentarDados(){
        System.out.println("Conta nº: "+numero+", Saldo: "+saldo+", Correntista: "+correntista.apresentar());
    }
}
