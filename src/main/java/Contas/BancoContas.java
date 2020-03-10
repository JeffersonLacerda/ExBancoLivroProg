package Contas;

/**
 *
 * @author Jefferson
 */
public class BancoContas {
    private Conta[] contas;
    private int indice;
    
    /*O construtor da classe instancia o vetor e o atributo indice. A ideia é que no inicio, o vetor
    contas esteja vazio e atributo indice indique a quantidade de contas cadastradas no vetor.*/ 
    public BancoContas() {                                          
        contas = new Conta[100];
        indice=0;
    }
    
    /*A partir de um número fornecido, o método retorne a posição no vetor contas do objeto que possui número igual ao parâmetro 
    fornecido. Este método é importante para que possamos impedir que duas contas com o mesmo número possam ser inseridas no vetor.*/
    int getIndice(int numero){
        int n;
        boolean achou = false;
        int i=0;
        while((!achou)&&(i<indice)){
            n=contas[i].getNumero();
            if(n==numero){
                achou=true;
            }else{
                i=i+1;
            }
        }
        return i;
    }
    
    /*Neste método, primeiro utiliza-se getIndice, passando o número da conta que se quer inserir no Banco. Como dito anteriormente, 
    se o retorno for igual ao atributo indice significa que não há nenhuma conta com este número e com isso, a conta pode ser inserida*/
    public void inserir (Conta conta){
        int i = getIndice(conta.getNumero());
        if(i==indice){ //Se o  índice - que é o valor que pode ser inserido um elemento - é igual ao i - que é o fim da busca no método.
            contas[indice]=conta;
            indice = indice+1;
            //System.out.println("Cadastro realizado com sucesso");
        }else{
            System.out.println("Conta já cadastrada");
        }
    }
    
    /*Permite que uma conta tenha seus valores atualizados*/
    public void atualizar (Conta conta){
        int i = getIndice(conta.getNumero());
        if (i == indice) { //Se chegou ao final do vetor na busca do método getIndice e não encontrou...
            System.out.println("Conta inexistente");
        } else {
            contas[i] = conta;
            //System.out.println("Conta atualizada com sucesso");
        }
    }
    
    /*Excluindo uma conta do vetor - OBS: não preserva a ordem que foram inseridos no vetor (caso seja importante)*/
    public void remover(int numero) {
        int i = getIndice(numero);
        if (i == indice) {
            System.out.println("Conta inexistente");
        }else {
            contas[i] = contas[indice - 1]; //Faz uma troca das referências dos objetos. O último passa a ser o que foi excluído. Ou seja o último elemento do vetor vai para o elemento excluído.
            indice = indice - 1; //Reduz um elemento do índice do vetor
            //System.out.println("Conta removida com sucesso");
        }
    }
    
    /*Retorna uma conta buscada no vetor*/
    public Conta procurar(int numero) {
        Conta resposta = null;
        int i = getIndice(numero);
        if (i == indice) {
            System.out.println("Conta inexistente");
        }else {
            resposta = contas[i];
        }
        return resposta;
    }
    
    /**/
    public void creditar(int numero, float valor) {
        Conta c = procurar(numero);
        if (c != null){
            c.creditar(valor);
            //System.out.println("Crédito efetivado com sucesso");
        }
    }
    
    public void debitar(int numero, float valor) {
        Conta c = procurar(numero);
        if (c != null){
            c.debitar(valor);
            //System.out.println("Débito efetivado com sucesso");
        }
    }
    
    public float getSaldo(int numero) {
        Conta c = procurar(numero);
        float retorno = 0;
        if (c != null){
            retorno = c.getSaldo();
        }
        return retorno;
    }
    
    /*Realiza a transferência entre contas*/
    public void transferir(int numContaOrigem, int numeContaDestino, float valor) {
        Conta contaOrigem = procurar(numContaOrigem);
        Conta contaDestino = procurar(numeContaDestino);
        if ((contaOrigem != null) && (contaDestino != null)){
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);
            //System.out.println("Transferencia realizada com sucesso");
        }
    }
    
    public void renderJuros(int numero){
        Conta c = procurar(numero);
        if (c instanceof Poupanca){
            ((Poupanca) c).renderJuros();
        }else {
            System.out.println("Erro: a conta " + numero + " não é uma poupanca");
            System.out.println("Impossível renderJuros");
        }
    }
    public void renderJurosGeral(){
        for (int i = 0; i < this.indice; i++){
            Conta c = this.contas[i];
            if (c instanceof Poupanca){
                ((Poupanca) c).renderJuros();
            }
        }
    }
    
}
