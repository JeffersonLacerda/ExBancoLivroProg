/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exbancolivroprog;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BancoContas banco = new BancoContas();
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
                System.out.println("0 - Sair");
                opcao = scanner.nextInt();
                int numero;
                float saldo;
                float valor;
                
                switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta a ser criada:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o saldo inicial da conta a ser criada:");
                    saldo = scanner.nextFloat();
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
//Tinha adicionado pelo atributo, agora, com o que fiz acima, adiciono pelo construtor...
//                    end1.rua = "Agamenon Magalhães";
//                    end1.numero = "11";
//                    end1.bairro = "Boa Vista";
//                    end1.cidade = "Recife";
//                    end1.estado = "Pernambuco";
//                    end1.cep = "69872-980";
                    Endereco end2 = new Endereco("Av. Boa Viagem","323","Boa Viagem","Recife","Pernambuco","64321-242");
//                    end2.rua = "Av. Boa Viagem";
//                    end2.numero = "323";
//                    end2.bairro = "Boa Viagem";
//                    end2.cidade = "Recife";
//                    end2.estado = "Pernambuco";
//                    end2.cep = "64321-242";
                    Pessoa pessoa = new Pessoa(nome,cpf,sexo,end1,end2);
//                    pessoa.nome = nome; pessoa.cpf = cpf; pessoa.sexo = sexo;
//                    pessoa.endResidencial = end1;
//                    pessoa.endComercial = end2;
                    Conta conta = new Conta(numero,saldo,pessoa);
//                    conta.numero = numero;
//                    conta.saldo = saldo;
//                    conta.pessoa = pessoa; //Não está funcionando (diferente do livro)
                    banco.inserir(conta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o valor a ser creditado:");
                    valor = scanner.nextFloat();
                    banco.creditar(numero, valor);
                    break;
                case 3:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o valor a ser debitado:");
                    valor = scanner.nextFloat();
                    banco.debitar(numero, valor);
                    break;
                case 4:
                    System.out.println("Informe o número da conta de origem:");
                    numero = scanner.nextInt();
                    System.out.println("Informe o número da conta de destino:");
                    int numeroAux = scanner.nextInt();
                    System.out.println("Informe o valor a ser transferido:");

                    valor = scanner.nextFloat();;
                    banco.transferir(numero, numeroAux, valor);
                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numero = scanner.nextInt();
                    System.out.println("O saldo é" + banco.getSaldo(numero));
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
