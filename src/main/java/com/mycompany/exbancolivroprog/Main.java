package com.mycompany.exbancolivroprog;

import Pessoas.Endereco;
import Pessoas.Pessoa;
import Contas.Conta;
import Contas.BancoContas;
import Contas.Poupanca;
import java.util.Scanner;

/*O que falta ver:
Visibilidade de métodos na classe conta: debitar, creditar
Alterar nomes dos pacotes (minúsculo)
Parando na página 28
*/
/**
 *
 * @author Jefferson
 */
public class Main {

    private static float valor;
    
    public static void main(String[] args) {

        BancoContas banco = new BancoContas();
        
        menu(banco);
    }
    
    public static void menu(BancoContas banco){
        
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);
        while (opcao != 0) {
            try {
                System.out.println("Aperte <Enter> para continuar");
                scanner.nextLine();
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("Escolha uma das opções abaixo:");
                System.out.println("1 - Cadastrar Conta");
                System.out.println("2 - Creditar");
                System.out.println("3 - Debitar");
                System.out.println("4 - Transferir");
                System.out.println("5 - Ver Saldo");
                System.out.println("6 - Render Juros de uma poupanca");
                System.out.println("7 - Render Juros de todas as poupanças");
                System.out.println("0 - Sair");
                opcao = scanner.nextInt();
                int numero;
                float saldo;

                switch (opcao) {
                case 1:
                    System.out.println("Informe o tipo da conta a ser criada: [(1) Conta Comum / (2) Poupanca]");
                    int tipo = scanner.nextInt();
                    System.out.println("Informe o número da conta a ser criada:");
                    numero = scanner.nextInt();                    
                    System.out.println("Informe o saldo inicial da conta a ser criada:");
                    saldo = scanner.nextFloat();
                    int diaAniversario = 1;
                    if(tipo==2){
                        System.out.println("Data para rendimento de juros da poupanca:");
                        diaAniversario=scanner.nextInt();
                    }                    
                    System.out.println("Informe o nome do Correntista:");
                    String nome = scanner.next();
                    System.out.println("Informe o cpf do Correntista:");
                    String cpf = scanner.next();
                    System.out.println("Informe o sexo do Correntista [(1) Masc / (2) Fem]:");
                    int opcaoSexo = scanner.nextInt();
                    char sexo = 'M';
                    if (opcaoSexo == 2) {
                        sexo = 'F';
                    }
                    // Atalho para entrada dos Endereços
                    Endereco end1 = new Endereco("Agamenon Magalhães","11","Boa Vista", "Recife","Pernambuco","69872-980");

                    Endereco end2 = new Endereco("Av. Boa Viagem","323","Boa Viagem","Recife","Pernambuco","64321-242");

                    Pessoa pessoa = new Pessoa(nome,cpf,sexo,end1,end2);
//                    pessoa.nome = nome; pessoa.cpf = cpf; pessoa.sexo = sexo;
//                    pessoa.endResidencial = end1;
//                    pessoa.endComercial = end2;
                    Conta conta = null;
                    if (tipo ==1){
                        conta = new Conta(numero,saldo,pessoa);
                    }else{
                        conta = new Poupanca(numero,saldo,pessoa, diaAniversario);
                    }
//                    conta.numero = numero;
//                    conta.saldo = saldo;
//                    conta.pessoa = pessoa; //Não está funcionando (diferente do livro)
                    banco.inserir(conta);
                    System.out.println("Cadastro realizado com sucesso");
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o valor a ser creditado:");
                    valor = scanner.nextFloat();
                    banco.creditar(numero, valor);
                    System.out.println("Crédito efetivado com sucesso");
                    break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o valor a ser debitado:");
                    valor = scanner.nextFloat();
                    banco.debitar(numero, valor);
                    System.out.println("Débito efetivado com sucesso");
                    break;
                case 4:
                    System.out.println("Informe o número da conta de origem:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o número da conta de destino:");
                    int numeroAux = scanner.nextInt();
                    System.out.println("Informe o valor a ser transferido:");
                    valor = scanner.nextFloat();;
                    banco.transferir(numero, numeroAux, valor);
                    System.out.println("Transferencia realizada com sucesso");
                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("O saldo é" + banco.getSaldo(numero));
                    break;
                case 6:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    banco.renderJuros(numero);
                    break;
                case 7:
                    System.out.println("Confirma o rendimento de juros para");
                    System.out.println("Todas as poupancas do banco? (S/N)");
                    String opc = scanner.next();
                    if (opc.equalsIgnoreCase("S")) {
                        banco.renderJurosGeral();
                        System.out.println("Operação realizada.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Opção Incorreta! Escolha uma das opções do menu!\n");
                    break;
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }        
        }
    } 
}
