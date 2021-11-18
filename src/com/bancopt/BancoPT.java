package com.bancopt;

import com.bancopt.contas.Conta;
import com.bancopt.dadosApp.Utilizadores;
import com.bancopt.operacoes.Operacao;
import com.bancopt.utilizadores.Cliente;
import com.bancopt.utilizadores.GestorConta;
import com.bancopt.utilizadores.Utilizador;
import java.util.List;
import java.util.Scanner;

public class BancoPT {

    public static void main(String[] args) {
        // Mensagem inicial
        System.out.println("Bem-vinda/o ao Banco PT!\n"
                + "Tipos de Utilizador:\n"
                + "1. Gestor de Conta\n"
                + "2. Cliente\n"
                + "3. Administrador\n"
                + "4. Sair\n"
                +"\nIndique o tipo de utilizador que pretende autenticar-se:");
        
        
        List<Operacao> listOperacoes = Utilizadores.gerarOperacoes();
        List<Conta> listContas = Utilizadores.gerarContas(listOperacoes);
        List<Cliente> listClientes = Utilizadores.gerarClientes(listContas);
        List<GestorConta> listGestoresConta = Utilizadores.gerarGestores(listClientes);

        // Lê valor introduzido pelo utilizador
        Scanner input = new Scanner(System.in);
        int operacao = input.nextInt();

        switch(operacao) {
            case 1:
                System.out.println("\nLista de Gestores de Conta:");
              
                // Imprime lista de gestores
                for(int i = 0; i < listGestoresConta.size(); i++) {
                    System.out.println(i+1 + ". " + listGestoresConta.get(i).getNome());
                }
                
                System.out.println("\nIndique o Gestor de Conta que pretende aceder:");
                int gestor = input.nextInt();
                
                System.out.println("\nLista de clientes do gestor " +  listGestoresConta.get(gestor-1).getNome() + ":");
                GestorConta gestorConta = listGestoresConta.get(gestor-1);
                
                int numCliente = 1;
                for(Cliente cliente : gestorConta.getListClientes()) {
                    System.out.println(numCliente + ". " + cliente.getNome() + " | " + cliente.getDataNascimento() + " | " + cliente.getNif());
                    numCliente++;
                }
                
                System.out.println("\nIndique o Cliente pretende aceder ao detalhes:");
                int cliente = input.nextInt();
                
                Cliente clienteDetalhado = gestorConta.getListClientes().get(cliente-1);
                
                System.out.println("\nDados do Cliente:");
                System.out.println("Nome: " + clienteDetalhado.getNome());
                System.out.println("NIF: " + clienteDetalhado.getNif());
                System.out.println("Data de Nascimento: " + clienteDetalhado.getDataNascimento());
                System.out.println("Contacto: " + clienteDetalhado.getContacto() +"\n");
                
                List<Conta> listaContaCliente = gestorConta.getListClientes().get(cliente-1).getListContas();
                System.out.println("Lista de Contas:");
                int numConta = 1;
                for(Conta conta : listaContaCliente) {
                    System.out.println(conta.getNomeConta());
                    System.out.println("IBAN: " + conta.getIban());
                    System.out.println("Montante: " + conta.getMontante() + "\n");
                    
                    System.out.println("Nº de Operação | Dt. Transf.|            IBAN           |      Montante     ");
                    System.out.println("----------------------------------------------------------------------------");
                    for(int k = 0; k < conta.getListOperacoes().size(); k++) {
                        Operacao op = conta.getListOperacoes().get(k);
                        System.out.println(op.getNome() + " | " + op.getDataOperacao() + " | " +op.getIbanDestino() + " | " + op.getMontante());   
                    }
                    System.out.println("\n");
                    numConta++;
                }
                
                //getClienteByGestor
                
                //Listar clientes para aquele gestor
                //Todas as contas que tem saldo negativo
                //Todos os clientes nao tem contas do tipo Poupança
              
            case 2:
                //System.out.println("\nLista de Clientes:\n");
                
                //Listar todas as contas para um utilizador
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
