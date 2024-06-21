/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.IU;

import java.util.Scanner;

/**
 *
 * @author kelly
 */
public class Sistema {
    
    /*private int menu(){
        String menu = "MENU\n"
                +"1 - Cadastrar Nova Conta Simples\n"
                +"2 - Cadastrar Nova Conta Especial\n"
                +"3 - Saque"
                +"4 - Depósito\n"
                +"5 - Dados de uma conta especial especifica\n"
                +"6 - Relatógio geral (todas as contas)\n"
                +"7 - Relatório de contas simples\n"
                +"8 - Relatório de contas especiais\n"
                +"9 - Sair\n";
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.nextLine());
        return op;
                
    }
    
    public void executar(){
        System.out.println("Exemplo com uso de controlador");
        int op;
        String numero;
        String titular;
        double saldo, limite, valor;
        Scanner sc = new Scanner(System.in);
        Controlador control = new Controlador();
        Conta c;
        
        do {
            op = menu();
            switch(op){
                case 1: //CADASTRO DE CONTA SIMPLES
                    System.out.println("Numero da Conta: ");
                    numero = sc.nextLine();
                    System.out.println("Nome do Titular: ");
                    titular = sc.nextLine();
                    System.out.println("Saldo: ");
                    saldo = sc.nextDouble();
                    control.addConta(numero, titular, saldo);     
                    break;
                case 2: //CADASTRO DE CONTA ESPECIAL
                    System.out.println("Numero da Conta: ");
                    numero = sc.nextLine();
                    System.out.println("Nome do Titular: ");
                    titular = sc.nextLine();
                    System.out.println("Saldo: ");
                    saldo = sc.nextDouble();
                    System.out.println("Limite: ");
                    limite = sc.nextDouble();
                    control.addContaEspecial(numero, titular, saldo, limite);
                    break;
                case 3:
                    System.out.println("===== SAQUE =====");
                    System.out.println("Numero da conta: ");
                    numero = sc.nextLine();
                    c = control.buscarConta(numero);
                    if(c!=null){
                        System.out.println("Valor do saque: ");
                        valor = Double.parseDouble(sc.nextLine());
                        c.sacar(valor);
                    }else{
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: //RELATORIO GERAL
                    System.out.println("RELATORIO GERAL DE CONTAS\n");
                    System.out.println(control.dadosTodasContas());        
                    break;
                case 7:
                    break;
                case 8: 
                    break;
                default:
                    if(op!=9){
                        System.out.println("OPCAO INVALIDA");
                    }
                    break;
            }
        } while (op != 9);
        
    }*/
    
}
