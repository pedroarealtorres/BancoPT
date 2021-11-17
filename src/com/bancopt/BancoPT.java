package com.bancopt;

import java.util.Scanner;

public class BancoPT {

    public static void main(String[] args) {
        // Mensagem inicial
        System.out.println("Bem-vinda/o ao Banco PT!\n"
                + "Indique o tipo de utilizador que pretende autenticar-se:\n"
                + "1. Gestor de Conta\n"
                + "2. Cliente\n"
                + "3. Administrador\n"
                + "4. Sair");
        
        // Lê valor introduzido pelo utilizador
        Scanner keyboard = new Scanner(System.in);
        int operacao = keyboard.nextInt();
        
        switch(operacao) {
            case 1:
                System.out.println("\nLista de Gestores de Conta:\n");
              
                //Listar clientes para aquele gestor
                //Todas as contas que tem saldo negativo
                //Todos os clientes nao tem contas do tipo Poupança
              
            case 2:
                System.out.println("\nLista de Clientes:\n");
              
            case 3:
                
            case 4:
               System.out.println("Agradecemos a sua visita.");
               break;
            default:
               System.out.println("Opção escolhida inválida.");
               break;
          }
        //BandasDesenhadas bandasDesenhadas = new BandasDesenhadas();
        //bandasDesenhadas.carregar();
    }
    
    /**
     * Criar cliente
     * Criar conta para cliente
     * Registar operacao
     * Listar todos os clientes
     * Listar contas por cliente
     * 
     */
}
